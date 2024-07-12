//Program to check whether the students attendance is good or bad 
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the total number of classes held:");
    int totalClasses = scanner.nextInt();
    System.out.print("Enter the number of classes attended:");
    int attendedClasses = scanner.nextInt();
    double attendancePercentage = (double) attendedClasses / totalClasses * 100;
    System.out.println("Attendance Percentage: " + attendancePercentage + "%");
    final double GOOD_ATTENDANCE_THRESHOLD = 75.0;
    if (attendancePercentage >= GOOD_ATTENDANCE_THRESHOLD){
      System.out.println("Attendance is good!");
    }else{
      System.out.println("Attendance is bad!");
    }
    scanner.close();
  }
}
// Output:
// Enter the total number of classes held:10
// Enter the number of classes attended:8
// Attendance Percentage: 80.0%
// Attendance is good!
