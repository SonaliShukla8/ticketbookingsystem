package ticketbookinghe;

import java.util.List;

public interface IBookingSystemServiceProvider {
	double calculateTotalRevenue(int numTickets);
	boolean bookTickets(String eventName, int numTickets, List<customer> arrayOfCustomer);


}
