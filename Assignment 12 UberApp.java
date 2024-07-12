// java program that simulates a ride in uber
import java.util.*;

class Ride{
    private String pickupLocation;
    private String destination;
    private double distance;
    private int duration; // in minutes
    public Ride(String pickupLocation, String destination, double distance, int duration){
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.distance = distance;
        this.duration = duration;
    }
    public double calculateFare(){
        double baseFare = 2.0;
        double distanceFare = distance* 1.5; // $1.5 per mile
        double timeFare = duration * 0.1; //  $0.10 per minute
        return baseFare + distanceFare + timeFare;
    }
    public void displayRideDetails(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Ride Details : ");
        System.out.println("Pickup Location : "+pickupLocation);
        System.out.println("Destination : "+ destination);
        System.out.println("Distance : "+distance+" miles.");
        System.out.println("Duration : "+duration+" minutes.");
    }
}

class Uber{
    private String name;
    public Uber(String name){
        this.name = name;
    }

    public void bookRide(Ride ride){
        System.out.println("Booking ride with "+name+"...");
        ride.displayRideDetails();
        double fare = ride.calculateFare();
        System.out.println("Estimate fare : $"+fare);
        System.out.println("Ride booked successfully with "+name+"!");
    }
}
public class UberApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pickup location : ");
        String pickupLocation = sc.nextLine();
        System.out.print("Enter destination : ");
        String destination = sc.nextLine();
        System.out.print("Enter distance (in miles) : ");
        double distance = sc.nextDouble();
        System.out.print("Enter duration (in minutes) : ");
        int duration = sc.nextInt();

        Ride ride = new Ride(pickupLocation, destination, distance, duration);
        Uber uber = new Uber("UberX");
        uber.bookRide(ride);
        sc.close();
    }
}

// Output:
// Enter pickup location: Shyambazar
// Enter destination: Jharkhand
// Enter distance (in miles): 150
// Enter duration (in minutes): 1200
// Booking ride with Johny Souvik Sins...
// Ride Details:
// Pickup Location: Shyambazar
// Destination: Jharkhand
// Distance: 150.0 miles
// Duration: 1200 minutes
// Estimated Fare: $347.0
// Ride booked successfully with Johny Souvik Sins!