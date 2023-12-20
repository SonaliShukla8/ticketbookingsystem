package repo;
import java.util.List;

import entity.Booking;
import entity.Customer;
import entity.Event;
import entity.Venue;

public interface IBookingSystemRepository {

    Event createEvent(String eventName, String date, String time, int totalSeats,
                      float ticketPrice, String eventType, Venue venue);

    List<Event> getEventDetails();

    int getAvailableNoOfTickets();

    void calculateBookingCost( Event event, int numTickets);

    void bookTickets(Event event, int numTickets, List<Customer> listOfCustomers);

    void cancelBooking(int bookingId);

    Booking getBookingDetails(int bookingId);
}
