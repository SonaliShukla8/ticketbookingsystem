package ticketbookinghe;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

class Sports extends Event{
	private String sportName;
	private String teamsName;
	
	public Sports() {
		
	}
	public Sports(String eventName, LocalDate eventDate, LocalTime eventTime, String venuName, String venueAddress,
			int totalSeats, Double ticketPrice, String sportName,String teamsName) {
		super(eventName,eventDate,eventTime, venuName,venueAddress,totalSeats,ticketPrice,EventType.SPORTS);
		this.sportName=sportName;
		this.teamsName=teamsName;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName=sportName;
	}
	public String getTeamsName() {
		return teamsName;
	}
	public void setTeamsName(String teamsName) {
		this.teamsName=teamsName;
	}
//	public Sports(String eventName, LocalDate eventDate, LocalTime eventTime, venue venu,
//            int totalSeats, Double ticketPrice, String sportName, String teamsName,
//            String customerName, String email, String phoneNumber) {
//  super(eventName, eventDate, eventTime, venu, totalSeats, ticketPrice, EventType.SPORTS);
//  this.sportName = sportName;
//  this.teamsName = teamsName;
//}
	@Override
	 public void displayEventDetails() {
		System.out.println("-----------------------------------------");
		System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Time: " + eventTime);
        System.out.println("Venue Name: " + venue.getVenueName());
        System.out.println("Venue Address: " + venue.getAddress());
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Ticket Price: $" + new DecimalFormat("#.##").format(ticketPrice));
        System.out.println("Event Type: " + eventType);
	        System.out.println("Sport Name: " + sportName);
	        System.out.println("Teams: " + teamsName);
	    System.out.println("-------------------------------------------");
	    }	
}
