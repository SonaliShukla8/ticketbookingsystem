package ticketbookinghe;

import java.time.LocalDate;
import java.time.LocalTime;

public interface IEventServiceProvider {
	Event createEvent(String eventName, LocalDate eventdate, LocalTime eventtime, int totalSeats, Double ticketPrice, String eventType, String venueName, String venueAddress);
    Event [] getEventDetails();
    int getAvailableSeats();

}
