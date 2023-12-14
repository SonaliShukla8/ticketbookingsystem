package ticketbookinghe;
import java.time.LocalDate;
import java.time.LocalTime;

enum EventType {
    MOVIE, SPORTS, CONCERT;

}
enum ConcertType {
    Theatrical, Classical, Rock, Recital
}

abstract class Event {
	protected String eventName;
	protected LocalDate eventDate;
	protected LocalTime eventTime;
	protected venue venu;
	protected int totalSeats;
	protected int availableSeats;
	protected double ticketPrice;
	protected EventType eventType;

    // Constructors
    public Event() {
    }

    public Event(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName, String venueAddress, int totalSeats,
            double ticketPrice, EventType eventType) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venu = new venue(venueName , venueAddress);
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.ticketPrice = ticketPrice;
        this.eventType = eventType;
    }

    // Getter and Setter methods
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public venue getvenue() {
        return venu;
    }

    public void setVenueName(String vname) {
       venu.setVenueName(vname);
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
    // Other methods
    public double calculateTotalRevenue(int numTickets) {
        return numTickets * ticketPrice;
    }

    public int getBookedNoOfTickets(int numTickets) {
        return totalSeats - availableSeats;
    }

    public boolean bookTickets(int numTickets) {
        if (availableSeats >= numTickets) {
            availableSeats -= numTickets;
            return true;
        } else {
            return false;
        }
    }

    public void cancelBooking(int numTickets) {
        availableSeats += numTickets;
        
        System.out.println(numTickets + " tickets canceled successfully.");
    }

    public abstract void displayEventDetails();
    
}




	
	
