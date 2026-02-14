package org.Bnzemeine;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.Bnzemeine.model.DeluxeRoom;
import org.Bnzemeine.model.Guest;
import org.Bnzemeine.services.BookingServices;
import org.Bnzemeine.services.RoomHandler;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void testBookingSuccess() throws Exception{
        RoomHandler<DeluxeRoom> handler=new RoomHandler<>();
        handler.addRoom(new DeluxeRoom("D1"));

        Guest guest=new Guest("Test","guest@gmail.com","8791314283");
        BookingServices service=new BookingServices();
        assertNotNull(service.bookRoom(guest,"Strong@123","Deluxe",handler));
    }

}
