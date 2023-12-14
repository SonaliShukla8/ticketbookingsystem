package ticketbookinghe;
class venue {
	private static String venueName;
	private static String address;

public venue() {
	
}
public venue(String venueName, String address) {
    venue.venueName = venueName;
    venue.address = address;
}
public static String getVenueName() {
    return venueName;
}

public void setVenueName(String venueName) {
    this.venueName = venueName;
}

public static String getAddress() {
    return venue.address;
}

public void setAddress(String address) {
    this.address = address;
}
public void displayEventDetailSystem() {
	System.out.println("Venue name: " + venueName);
	System.out.println("Address: "+ address);
}

}
