package ticketbookinghe;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

class Movie extends Event{
	private String genre;
	private String actorName;
	private String actressName;
	
Movie(){
}
public Movie(String eventName, LocalDate eventDate, LocalTime eventTime, String venuName, String venueAddress,
		int totalSeats, double ticketPrice, String genre, String actorName, String actressName) {
super(eventName, eventDate, eventTime, venuName, venueAddress, totalSeats, ticketPrice, EventType.MOVIE);
this.genre = genre;
this.actorName = actorName;
this.actressName = actressName;
}
public String getGenre() {
    return genre;
}

public void setGenre(String genre) {
    this.genre = genre;
}

public String getActorName() {
    return actorName;
}

public void setActorName(String actorName) {
    this.actorName = actorName;
}

public String getActressName() {
    return actressName;
}

public void setActressName(String actressName) {
    this.actressName = actressName;
}
//public Movie(String eventName, LocalDate eventDate, LocalTime eventTime,venue venu,
//        int totalSeats, Double ticketPrice, String genre, String actorName, String actressName,
//        String customerName, String email, String phoneNumber) {
//super(eventName, eventDate, eventTime, venu , totalSeats, ticketPrice, EventType.MOVIE);
//this.genre = genre;
//this.actorName = actorName;
//this.actressName = actressName;
//// Additional logic for handling Customer attributes
//}
@Override
public void displayEventDetails() {
	System.out.println("-------------------------------------------");
	System.out.println("Event Name: " + eventName);
    System.out.println("Event Date: " + eventDate);
    System.out.println("Event Time: " + eventTime);
    System.out.println("Venue Name: " + venue.getVenueName());
    System.out.println("Venue Address: " + venue.getAddress());
    System.out.println("Total Seats: " + totalSeats);
    System.out.println("Available Seats: " + availableSeats);
    System.out.println("Ticket Price: $" + new DecimalFormat("#.##").format(ticketPrice));
    System.out.println("Event Type: " + eventType);
	System.out.println("Genre: " + genre);
     System.out.println("Actor: " + actorName);
     System.out.println("Actress: " + actressName);
 	System.out.println("-------------------------------------------");

}
}

