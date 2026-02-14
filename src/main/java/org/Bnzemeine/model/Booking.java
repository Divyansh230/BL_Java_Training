package org.Bnzemeine.model;

public class Booking {
    private Guest guest;
    private Room room;
    public Booking(Guest guest, Room room) {
        this.guest = guest;
        this.room = room;
    }

    @Override
    public String toString() {
        return guest.getName()+" booked "+room.getRoomId();
    }
}
