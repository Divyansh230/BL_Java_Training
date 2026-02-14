package org.Bnzemeine;


import org.Bnzemeine.exception.NoRoomAvailableException;
import org.Bnzemeine.model.*;
import org.Bnzemeine.services.BookingServices;
import org.Bnzemeine.services.RoomHandler;

public class App
{
    public static void main( String[] args )
    {
        try{
            RoomHandler<DeluxeRoom> handler=new RoomHandler<>();
            handler.addRoom(new DeluxeRoom("D101"));

            Guest guest=new Guest(
                    "Divyansh",
                    "divyansh2304@gmail.com",
                    "9876543210"
            );

            BookingServices service=new BookingServices();
            Booking booking=service.bookRoom(
                    guest,
                    "Strong@123",
                    "DELUXE",
                    handler
            );

            System.out.println("BOOKING SUCCESS → " + booking);

            // Streams demo
            handler.getSortedAvailableRooms()
                    .forEach(System.out::println);
        }
        catch(NoRoomAvailableException e){
            System.out.println("BOOKING FAILED → " + e.getMessage());
        }
    }
}
