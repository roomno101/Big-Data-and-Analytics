
// 1. Develop a Java program for Employee Performance Analysis.
import java.util.Scanner;

public class EmployeePerformanceAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        String[] employeeNames = new String[numberOfEmployees];
        int[] performanceRatings = new int[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.next();
            System.out.print("Enter performance rating of employee " + (i + 1) + " (out of 10): ");
            performanceRatings[i] = scanner.nextInt();
        }

        double averagePerformanceRating = calculateAverage(performanceRatings);

        String[] topPerformers = findTopPerformers(employeeNames,
                performanceRatings);

        System.out.println("\nEmployee Performance Analysis:");
        System.out.println("Average Performance Rating: " + averagePerformanceRating);
        System.out.println("Top Performer(s):");
        for (String performer : topPerformers) {
            System.out.println("- " + performer);
        }

        scanner.close();
    }

    public static double calculateAverage(int[] ratings) {
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.length;
    }

    public static String[] findTopPerformers(String[] names, int[] ratings) {
        int maxRating = Integer.MIN_VALUE;
        for (int rating : ratings) {
            if (rating > maxRating) {
                maxRating = rating;
            }
        }
        int count = 0;
        for (int rating : ratings) {
            if (rating == maxRating) {
                count++;
            }
        }
        String[] topPerformers = new String[count];
        int index = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == maxRating) {
                topPerformers[index++] = names[i];
            }
        }
        return topPerformers;
    }
}

// Output:
// Enter the number of employees: 2
// Enter name of employee 1: Chris
// Enter performance rating of employee 1 (out of 10):9
// Enter name of employee 2: Thor
// Enter performance rating of employee 2 (out of 10):10

// Employee Performance Analysis:
// Average Performance Rating: 9.5
// Top Performer(s):
// - Thor