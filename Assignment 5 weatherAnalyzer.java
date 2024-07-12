// java program to print wheather the day is shinny or cold.
import java.util.Scanner;
public class weatherAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the temperature : ");
        double temperature = sc.nextDouble();

        if (temperature > 25){
            System.out.println("It's a sunny day!");
        }
        else{
            System.out.println("It's a cool day!");
        }
        sc.close();
    }
}

// Output:
// Enter the temperature: 35
// It's shiny day!