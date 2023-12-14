package ticketbookinghe;

import java.util.ArrayList;
import java.util.Date;

class Booking {
	    private static int bookingIdCounter = 1;
	    private int bookingId;
	    private ArrayList<customer> customers;
	    private Event event;
	    private int numTickets;
	    private double totalCost;
	    private Date bookingDate;
	    


	    // Constructors
	    public Booking(ArrayList<customer> customers, Event event, int numTickets) {
	        this.bookingId=bookingIdCounter++;
	        this.customers=customers;
	        this.event=event;
	        this.numTickets=numTickets;
	        this.totalCost=0;
	        this.bookingDate = new Date();  
	    }

	    // Getter and Setter methods
	    public int getBookingId() {
	        return bookingId;
	    }

	    public ArrayList<customer> getCustomers() {
	        return customers;
	    }

	    public Event getEvent() {
	        return event;
	    }

	    public int getNumTickets() {
	        return numTickets;
	    }

	    public double getTotalCost() {
	        return totalCost;
	    }
	    

	    public Date getBookingDate() {
	        return bookingDate;
	    }

	    // Methods
	    public void displayBookingDetails() {
	    	
	    	System.out.println("BookingId :" + bookingId);
	    	System.out.println("Customers: " + customers);
	    	 for (customer customer : customers) {
	             customer.displayCustomerDetails();
	         }
	    	 event.displayEventDetails();
	         System.out.println("Number of Tickets: " + numTickets + "\nTotal Cost: " + totalCost + "\nBooking Date: "
	                 + bookingDate);
	    	
	    	
	    }
	    public void calculateBookingCost(int numTickets) {
	        double totalCost = event.calculateTotalRevenue(numTickets);
	        System.out.println("Booking successful! Total Cost of Booking for " + numTickets + " tickets: $" + totalCost);
	    }

	    public void bookTickets(int numTickets) {
	       if( event.bookTickets(numTickets)) {
	    	   System.out.println("Booking Successful!");
	       }
	       else {
	    	   System.out.println("Not enough available seats. Booking failed.");
	       }
	    }

	    public void cancelBooking(int numTickets) {
	        event.cancelBooking(numTickets);
	    }

	    public int getAvailableNoOfTickets() {
	        return event.getAvailableSeats();
	    }

	    public Event getEventDetails() {
	        return event;
	    } 


	public static void main(String[] args) {

	}

	public void set(Double totalCost, Double totalCost3) {
		this.totalCost = totalCost3;
		
	}

}
