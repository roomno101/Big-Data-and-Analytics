//Simple Java Program to find the maximum temperature in each year.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of years:");
        int numberOfYears=scanner.nextInt();
        int[][] temperatures=new int[numberOfYears][];
        for(int year=0;year<numberOfYears;year++){
            System.out.print("Enter the number of month for years"+(year+1)+":");
            int numberOfMonths=scanner.nextInt();
            temperatures[year]=new int[numberOfMonths];
            for(int month=0;month<numberOfMonths;month++){
                System.out.print("Enter the temperature for month"+(month+1)+":");
                temperatures[year][month]=scanner.nextInt();
            }
        }
        for(int year=0;year<numberOfYears;year++){
            int maxTemperature=findMaxTemprature(temperatures[year]);
            System.out.print("Maximum temperature for year"+(year+1)+":"+maxTemperature);
        }
        scanner.close();
    }
    private static int findMaxTemprature(int[] temperatures){
        int maxTemperature=temperatures[0];
        for(int temperature:temperatures){
            if(temperature>maxTemperature){
                maxTemperature=temperature;
            }
        }
        return maxTemperature;
    }  
}

// Output:
// Enter the number of years:1
// Enter the number of month for years1:2
// Enter the temperature for month1:12
// Enter the temperature for month2:13
// Maximum temperature for year1:13 