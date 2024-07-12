// Java Program that promots the user to input the elements of two arrays then checks wheather the arrays are equal or not

import java.util.Scanner;

public class checkArrayEquality {
    public static boolean areArrayEqual(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the 1st array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the 2nd array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the 2nd array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean isEqual = areArrayEqual(arr1, arr2);
        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
        sc.close();
    }
}

// Output:
// Enter the number of elements in the first array: 5
// Enter the elements of the first array: 
// 1
// 2
// 3
// 4
// 5
// Enter the number of elements in the second array: 5
// Enter the elements of the second array: 
// 1
// 2
// 3
// 4
// 5
// The arrays are equal.
