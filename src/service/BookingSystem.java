package service;

import java.time.LocalDate;
import java.time.LocalTime;

import entity.Event;
import entity.EventType;
import entity.Venue;

public abstract class BookingSystem {
	public abstract Event createEvent(String eventName, LocalDate eventDate, LocalTime eventTime, Venue venueName, int totalSeats, double ticketPrice, EventType eventType);

    public abstract void displayEventDetails(Event event);

    public abstract void bookTickets(Event event, int numTickets);

    public abstract boolean cancelTickets(Event event, int numTickets);

}
