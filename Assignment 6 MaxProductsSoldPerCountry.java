// java program to find the max number of products in each country
import java.util.Scanner;
public class MaxProductsSoldPerCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of countries : ");
        int numCountries = sc.nextInt();
        int[][] productSold = new int[numCountries][];

        for (int i = 0; i < numCountries; i++) {
            System.out.print("Enter the number of days in country "+(i+1)+" : ");
            int numProduct = sc.nextInt();
            productSold[i] = new int[numProduct];
            for (int j =0; j < numProduct; j++){
                System.out.print("Enter the number of products sold in day "+(j+1)+" : ");
                productSold[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i < numCountries;i++){
            int maxProductsSold = Integer.MIN_VALUE;
            for(int j = 0; j < productSold[i].length;j++){
                if (productSold[i][j] > maxProductsSold) {
                    maxProductsSold = productSold[i][j];
                }
            }
            System.out.println("Maximum number of products sold in country "+(i+1)+" : "+maxProductsSold);
        }
        sc.close();
    }   
}

// Output:
// Enter the number of countries: 1
// Enter the number of days in country 1: 1
// Enter the number of products sold on day 1:25
// Maximum number of products sold in country 1: 25