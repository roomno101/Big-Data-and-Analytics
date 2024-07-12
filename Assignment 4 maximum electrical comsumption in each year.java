
// simple java program to find the maximum electrical comsumption in each year.
import java.util.Scanner;

public class assgn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();

        int[][] electric_comsumption = new int[numberOfYears][];
        for (int year = 0; year < numberOfYears; year++) {
            System.out.print("Enter the number of months for year " + (year + 1) + " :  ");
            int numberOfMonths = sc.nextInt();
            electric_comsumption[year] = new int[numberOfMonths];
            for (int month = 0; month < numberOfMonths; month++) {
                System.out.print("Enter electricity comsumption for month " + (month + 1) + " : ");
                electric_comsumption[year][month] = sc.nextInt();
            }
        }
        for (int year = 0; year < numberOfYears; year++) {
            int maxelectricity = findMaxelectricity(electric_comsumption[year]);
            System.out.println("\nMaximum electric comsumption for year " + (year + 1) + " : " + maxelectricity);
        }
        sc.close();
    }

    private static int findMaxelectricity(int[] electricities) {
        int maxelecticity = electricities[0];
        for (int electricity : electricities) {
            if (electricity > maxelecticity) {
                maxelecticity = electricity;
            }
        }
        return maxelecticity;
    }
}
// Output:
// Enter the number of years: 2
// Enter electrical consumption for year1:100
// Enter electrical consumption for year2:105
// Maximum electrical consumption in year1:105.0
// Maximum electrical consumption in year2:100.0