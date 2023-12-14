package ticketbookinghe;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class BookingSystem  {
	protected ArrayList<Event> events = new ArrayList<>();
	abstract Event createEvent(String eventName, LocalDate eventdate, LocalTime eventtime, int totalSeats, Double ticketPrice, String eventType, String venueName, String venueAddress);

    abstract Double bookTickets(Event event, int numTickets);

    abstract void cancelTickets(Event event, int numTickets);
    abstract void displayEventDetails(Event event);
	

}
