package service;

import java.util.ArrayList;

import entity.Booking;
import entity.Customer;
import entity.Event;
import exception.InvalidBookingIDException;

public interface IBookingSystemServiceProvider {
	 double calculateBookingCost(Event event, int numTickets);
	    Booking bookTickets(Event event, int numTickets, ArrayList<Customer> customers);
	    boolean cancelBooking(int bookingId)  throws InvalidBookingIDException;
	    Booking getBookingDetails(int bookingId);
}
