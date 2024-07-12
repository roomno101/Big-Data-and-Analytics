// Java program to predict stock market price.

import java.util.Scanner;

public class StockMarketPrediction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current price: ");
        double currentPrice = scanner.nextDouble();
        System.out.print("Enter volumn: ");
        int volume = scanner.nextInt();
        System.out.print("Enter average value: ");
        double Averagevalue = scanner.nextDouble();
        String prediction = predictStockMovement(currentPrice, volume, Averagevalue);
        System.out.println("Prediction: " + prediction);
        scanner.close();
    }

    private static String predictStockMovement(double currentPrice, int volume, double Averagevalue) {
        if (currentPrice > Averagevalue && volume > 100) {
            return "Increase";
        } else {
            return "Decrease";
        }
    }

}

// Output:
// Enter current price: 200
// Enter volume 10
// Enter average value: 60
// Prediction: Decrease
