
// Assignment: 14 Java Program to find the frequency of odd & even numbers in the given matrix.
import java.util.*;

public class FrequencyOddEvenMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int oddFrequency = 0;
        int evenFrequency = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenFrequency++;
                } else {
                    oddFrequency++;
                }
            }
        }
        System.out.println("The frequency of odd numbers is : " + oddFrequency);
        System.out.println("The frequency of even numbers is : " + evenFrequency);
        sc.close();
    }
}
// Output:
// Enter the number of rows: 2
// Enter the number of columns: 2
// Enter the elements of the matrix:
// 1
// 2
// 3
// 4
// Frequency of odd numbers: 2
// Frequency of even numbers: 2
