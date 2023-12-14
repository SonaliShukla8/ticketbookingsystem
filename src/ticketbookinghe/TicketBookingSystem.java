package ticketbookinghe;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TicketBookingSystem extends BookingSystem {
		 private static Scanner scanner = new Scanner(System.in);
		
           
		   public  Event createEvent(String eventName, LocalDate eventDate, LocalTime eventTime, int totalSeats,
		                                    Double ticketPrice, String eventType, String venueName , String venueAddress) {
		        //LocalDate eventDate = LocalDate.parse(date);
		        //LocalTime eventTime = LocalTime.parse(time);
		    	
		        EventType type = EventType.valueOf(eventType.toUpperCase());

		        switch (type) {
		            case MOVIE:
		            	System.out.print("Enter genre name: ");
		            	String g = scanner.next();
		            	System.out.print("Enter Actor name: ");
		            	String actor = scanner.next();
		            	System.out.print("Enter Actress name: ");
		            	String actress = scanner.next();
		            	System.out.print("-------------------------------------------");
		            	System.out.println();

		            	
		                return new Movie(eventName, eventDate, eventTime, venueName, venueAddress, totalSeats,
		                        Double.valueOf(ticketPrice), g , actor, actress);
	

		            case SPORTS:
		            	System.out.print("Enter Sports name: ");
		            	String sportname = scanner.next();
		            	scanner.nextLine();
		            	System.out.print("Enter Teams name: ");
		            	String teamname = scanner.nextLine();
		            	System.out.print("-------------------------------------------");
		            	System.out.println();
		            	
		                return new Sports(eventName, eventDate, eventTime, venueName,venueAddress, totalSeats,
		                        Double.valueOf(ticketPrice), sportname, teamname);

		            case CONCERT:
		            	System.out.print("Enter Artist name: ");
		            	String artistname = scanner.next();
		            	System.out.print("Enter event type (Theatrical/Classical/Rock/Recital): ");
	                    String concerttype = scanner.next() ;
	                    
		            	System.out.print("----------------------------");
		            	System.out.println("");

		            	
		            	return new Concert(eventName, eventDate, eventTime, venueName,venueAddress, totalSeats,
		                        Double.valueOf(ticketPrice), artistname, ConcertType.valueOf(concerttype));	            
			   
	                    
		            default:
		                return null;
		        }
		    }


			public  void displayEventDetails(Event event) {
		        if (event != null) {
		            event.displayEventDetails();
		        } else {
		            System.out.println("Invalid event type.");
		        }
		    }
			 
            public  Double  bookTickets(Event event, int numTickets) {
		        if (event != null) {
		            if (event.bookTickets(numTickets)) {
		                return event.calculateTotalRevenue(numTickets);
		            } else {
		                System.out.println("Not enough available seats. Booking failed.");
		            }
		        } else {
		            System.out.println("Invalid event type. Booking failed.");
		        }
		        return Double.MIN_NORMAL;
		    }

		    public void cancelTickets(Event event, int numTickets) {
		        if (event != null) {
		            event.cancelBooking(numTickets);
		            System.out.println(numTickets + " tickets canceled for the event.");
		        } else {
		            System.out.println("Invalid event type. Cancellation failed.");
		        }
		    }
		    
		    public static void main(String[] args) {
		    	//Booking mybooking = new Booking(null, null, 0);
		    	TicketBookingSystem system = new TicketBookingSystem(); 
		    	
		    	ArrayList<customer> customers = null;
		    	
		    	
		        Event event = null;
		        int choice;
		        do {
		            System.out.println("   Ticket Booking System Menu   ");
		            System.out.println("1. Create Event");
		            System.out.println("2. Display Event Details");
		            System.out.println("3. Book Tickets");
		            System.out.println("4. Cancel Tickets");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            scanner.nextLine();  // Consume the newline character

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter event name: ");
		                    String eventName = scanner.nextLine();
		                    System.out.print("Enter date (dd/MM/yyyy): ");
		                    String dateStr = scanner.next(); 
		                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		                    LocalDate eventDate = LocalDate.parse(dateStr, formatter); 
		                    System.out.print("Enter time (HH:mm): ");	
		                    String timeString = scanner.next();
		                    DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("HH:mm");
		                    LocalTime eventTime = LocalTime.parse(timeString, formatterr);

		                    System.out.print("Enter total seats: ");
		                    int totalSeats = scanner.nextInt();
		                    System.out.print("Enter ticket price: ");
		                    double ticketPrice = scanner.nextDouble();
		                    scanner.nextLine();  // Consume the newline character
		                    System.out.print("Enter event type (Movie/Sports/Concert): ");
		                    String eventType = scanner.nextLine();
		                    System.out.print("Enter venue name: ");
		                    String venueName = scanner.nextLine();
		                    System.out.print("Enter venue Address: ");
		                    String venueAddress = scanner.nextLine();
		                    //venue myvenu=new venue(venueName,venueAddress);
		                    //customer newcustomer=new customer();
		                    
		  
		                	//Booking mybooking = new Booking(null, null, 0);
		                    event = system.createEvent(eventName, eventDate, eventTime, totalSeats, ticketPrice, eventType, venueName, venueAddress);
		                    break;

		                case 2:
		                //	Booking mybooking = new Booking(null, null, 0);
		                    system.displayEventDetails(event);
		                    break;

		                case 3:
		                    customer newcustomer=new customer();

		                    if (event != null) {
		                    	System.out.println("-------------------------------------");
		                        System.out.print("Enter the number of tickets to book: ");		                        
		                        int numTicketsToBook = scanner.nextInt();
		                        int m=numTicketsToBook;
		                        ArrayList<customer> customers = null;
		                        do {
		                        	System.out.println("Enter customer name of " + m + "customer : ");
		                        	System.out.println("Enter email of " + m + "customer : ");
		                        	System.out.println("Enter phone number of " + m + "customer : ");
		                        	
		                        }while(m>0);
		                        
								Booking mybooking = new Booking(customers, event, numTicketsToBook);

		                        Double totalCost = system.bookTickets(event, numTicketsToBook);
		                        mybooking.set(totalCost,totalCost);
		                        if (!totalCost.equals(Double.MIN_VALUE)) {
		                            System.out.println("Booking successful! Total cost: $" + totalCost);
		                        }
		                    } else {
		                        System.out.println("Event not created yet. Please create an event first.");
		                    }
		                    System.out.println("----------------------------------");
		                    break;

		                case 4:
		                    if (event != null) {
			                    System.out.println("----------------------------------");
		                        System.out.print("Enter the number of tickets to cancel: ");
		                        int numTicketsToCancel = scanner.nextInt();
		                        system.cancelTickets(event, numTicketsToCancel);
		                    } else {
		                        System.out.println("Event not created yet. Please create an event first.");
		                    }
		                    System.out.println("----------------------------------");

		                    break;

		                case 5:
		                    System.out.println("Exiting the Ticket Booking System. Goodbye!");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please enter a valid option.");
		            }

		        } while (choice != 5);

		        scanner.close();
		    
		    }


}


