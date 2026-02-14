package org.Bnzemeine.services;

import org.Bnzemeine.annotations.BookingValidation;
import org.Bnzemeine.exception.InvalidInputException;
import org.Bnzemeine.exception.NoRoomAvailableException;
import org.Bnzemeine.model.Booking;
import org.Bnzemeine.model.Guest;
import org.Bnzemeine.model.Room;
import org.Bnzemeine.validation.Validator;

import java.lang.reflect.Method;
import java.util.*;

public class BookingServices {
    private List<Booking> bookings=new ArrayList<>();
    private Queue<Guest> waitList=new LinkedList<>();
    private Stack<Booking> undoStack=new Stack<>();
    private Set<Guest> uniqueGuests=new HashSet<>();
    private  Map<String,Integer> inventory=new HashMap<>();

    public BookingServices() {
        inventory.put("Deluxe",1);
        inventory.put("Standard",1);
    }

    @Deprecated
    public void legacyBooking(){
        System.out.println("Depricated Booking Logic");
    }

    @BookingValidation
    public Booking bookRoom(
            Guest guest,
            String password,
            String roomType,
            RoomHandler<? extends Room> handler
    )throws NoRoomAvailableException
    {
        processValidation(guest, password);
        Optional<? extends Room> roomOpt=handler.bookRoom();

        if(roomOpt.isEmpty()||inventory.get(roomType)<=0){
            waitList.offer(guest);
            throw new NoRoomAvailableException("No rooms are available");
        }

        inventory.compute(roomType,(k,v)->v-1);

        Booking booking=new Booking(guest,roomOpt.get());
        bookings.add(booking);
        undoStack.push(booking);
        uniqueGuests.add(guest);

        return booking;

    }

    private void processValidation(Guest guest, String password)  {
        try{
            Method m=this.getClass().getMethod(
                    "bookRoom",
                    Guest.class,
                    String.class,
                    String.class,
                    RoomHandler.class
            );
            if(m.isAnnotationPresent(BookingValidation.class)){
                BookingValidation bv=m.getAnnotation(BookingValidation.class);
                if (bv.emailRequired() && !Validator.EMAIL_CHECK.test(guest.getEmail()))
                    throw new InvalidInputException("Invalid Email");

                if (bv.phoneRequired() && !Validator.PHONE_CHECK.test(guest.getPhone()))
                    throw new InvalidInputException("Invalid Phone");

                if (bv.passwordRequired() && !Validator.PASSWORD_CHECK.test(password))
                    throw new InvalidInputException("Weak Password");
            }

        }
        catch (NoSuchMethodException | InvalidInputException e){
            throw new RuntimeException(e);
        }
    }
}
