package ticketbookinghe;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

class Concert extends Event{
	private String artist;
	private ConcertType type;
	
	public Concert(){
	}
	public Concert(String eventName, LocalDate eventDate,LocalTime eventTime, String venuName, String venueAddress, int totalSeats,
			 Double ticketPrice, String artist, ConcertType type) {
		super(eventName,eventDate,eventTime, venuName, venueAddress,totalSeats,ticketPrice,EventType.CONCERT);
		this.artist=artist;
		this.type=type;
	}
	 public String getArtist() {
	        return artist;
	    }

	    public void setArtist(String artist) {
	        this.artist = artist;
	    }

	    public ConcertType getType() {
	        return type;
	    }

	    public void setType(ConcertType type) {
	        this.type = type;
	    }
//	    public Concert(String eventName, LocalDate eventDate, LocalTime eventTime, venue venu,
//                int totalSeats, Double ticketPrice, String artist, ConcertType type,
//                String customerName, String email, String phoneNumber) {
//     super(eventName, eventDate, eventTime, venu, totalSeats, ticketPrice, EventType.CONCERT);
//     this.artist = artist;
//     this.type = type;
//     // Additional logic for handling Customer attributes
// }
	    @Override
	    public void displayEventDetails() {
	    	System.out.println("--------------------------------------------");
	    	System.out.println("Event Name: " + eventName);
	        System.out.println("Event Date: " + eventDate);
	        System.out.println("Event Time: " + eventTime);
	        System.out.println("Venue Name: " + venue.getVenueName());
	        System.out.println("Venue Address: " + venue.getAddress());	        
	        System.out.println("Total Seats: " + totalSeats);
	        System.out.println("Available Seats: " + availableSeats);
	        System.out.println("Ticket Price: $" + new DecimalFormat("#.##").format(ticketPrice));
	        System.out.println("Event Type: " + eventType);
	       System.out.println("Artist: " + artist);
	       System.out.println("Type: " + type);
	       System.out.println("---------------------------------------------");
	    }
	
}
