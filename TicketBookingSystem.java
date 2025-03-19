package com.navneet.test;

class Ticket{
	String source;
	String distination;
	double prize;
	public Ticket(String source, String distination, double prize) {
		super();
		this.source = source;
		this.distination = distination;
		this.prize = prize;
	}
	public void displayTicketDetails() {
		System.out.println("Ticket from: "+source+" to: "+distination+".Ticket prize is "+prize);
	}
	}
class TrainTicket extends Ticket{
    String trainNumber;

	public TrainTicket(String source, String distination, double prize, String trainNumber) {
		super(source, distination, prize);
		this.trainNumber = trainNumber;
	}
	public void displayTicketDetails() {
		System.out.println("Train Ticket details:");
		System.out.println("Ticket from: "+this.source+" to: "+distination+".Ticket prize is "+this.prize);
		System.out.println("Train number is "+trainNumber);
	} 
	
}
class BusTicket extends Ticket{
    String busCompanyName;

	public BusTicket(String source, String distination, double prize, String busCompanyName) {
		super(source, distination, prize);
		this.busCompanyName = busCompanyName;
	}
	public void displayTicketDetails() {
		System.out.println();
		System.out.println("Bus Ticket details:");
		System.out.println("Ticket from: "+this.source+" to: "+distination+".Ticket prize is "+this.prize);
		System.out.println("Bus Company name: "+busCompanyName);
	} 
}
class FlightTicket extends Ticket{
    String fightNumber;

	public FlightTicket(String source, String distination, double prize, String fightNumber) {
		super(source, distination, prize);
		this.fightNumber = fightNumber;
	}
	public void displayTicketDetails() {
		System.out.println();
		System.out.println("Flight Ticket details:");
		System.out.println("Ticket from: "+this.source+" to: "+distination+".Ticket prize is "+this.prize);
		System.out.println("Fight number:"+fightNumber);
	} 
}
public class TicketBookingSystem {

	public static void main(String[] args) {
		TrainTicket tt = new TrainTicket("City A", "City B", 50, "123");
		tt.displayTicketDetails();
		
		BusTicket bt = new BusTicket("City X", "City Y", 30, "XYZ Bus Company");
		bt.displayTicketDetails();
		
		FlightTicket ft = new FlightTicket("City P", "City Q", 200, "ABC123");
		ft.displayTicketDetails();
	}

}
