//Program to sort array in both ascending and descending order.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of arrays: ");
    int size = scanner.nextInt();
    System.out.println("Enter the elements of array: ");
    int[] arr = new int[size];
    for(int i = 0; i < size; i++){
      arr[i] = scanner.nextInt();
    }
    int[] ascendingOrder = Arrays.copyOf(arr, arr.length);
    Arrays.sort(ascendingOrder);
    int[] descendingOrder = Arrays.copyOf(arr, arr.length);
    Arrays.sort(descendingOrder);
    reverseArray(descendingOrder);
    System.out.println("Arrays sorted in ascending order: " + Arrays.toString(ascendingOrder));
    System.out.println("Arrays sorted in descending order: " + Arrays.toString(descendingOrder));
    scanner.close();
  }
  public static void reverseArray(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
// Output:
// Enter the size of arrays: 5
// Enter the elements of array: 
// 1 2 6 2 8
// Arrays sorted in ascending order: [1, 2, 2, 6, 8]
// Arrays sorted in descending order: [8, 6, 2, 2, 1]