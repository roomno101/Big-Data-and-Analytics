// java program to find avg age of the people
import java.util.Scanner;
public class AvgAgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people : ");
        int numberofpeople = scanner.nextInt();
        int totalage = 0;
        for (int i = 1; i <= numberofpeople; i++) {
            System.out.print("Enter age of persons "+i+" : ");
            int age = scanner.nextInt();
            totalage += age;
        }
        double averageage = (double) totalage/numberofpeople;
        System.out.print("The average age of the group is : "+averageage);
        scanner.close();
    }
}
// Output:
// Enter the number of people: 2
// Enter the age of person 1: 25
// Enter the age of person 2: 35
// The average age of the group is:30.0