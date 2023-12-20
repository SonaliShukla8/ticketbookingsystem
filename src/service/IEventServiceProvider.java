package service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import entity.Concert;
import entity.Event;
import entity.EventType;
import entity.Movie;
import entity.Sports;

public interface IEventServiceProvider {
	Movie createEvent(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName, String venueAddress, int totalSeats, double ticketPrice, EventType eventType, String genre, String actorName, String actressName);

    Concert createEvent(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName, String venueAddress, int totalSeats, double ticketPrice, EventType eventType, String artist, String type);
    Sports createEvent(String eventName, LocalDate eventDate, LocalTime eventTime, String venueName, String venueAddress, int totalSeats, double ticketPrice, EventType eventType, String sportName, ArrayList<String> teamsName);
    List<String> getEventDetails(Event event);

    int getAvailableNoOfTickets(Event event);
}
