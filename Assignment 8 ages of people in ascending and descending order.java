// java program to arrange ages of people in ascending and descending order

import java.util.Arrays;
import java.util.Scanner;
public class Agesorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people : ");
        int numpeople = sc.nextInt();
        int[] ages = new int[numpeople];
        System.out.println("Enter the ages of people : ");
        for (int i = 0; i < numpeople; i++){
            System.out.print("Age of person "+(i+1)+" : ");
            ages[i] = sc.nextInt();
        }
        Arrays.sort(ages);
        System.out.println("Ages in ascending order : ");
        for(int age:ages){
            System.out.println(age);
        }
        for (int i=0;i<=numpeople/2;i++){
            int temp = ages[i];
            ages[i] = ages[numpeople -1 -i];
            ages[numpeople -1 -i] = temp;
        }
        System.out.println("Ages in decending order: ");
        for(int age:ages){
            System.out.println(age);
        }
        sc.close();
    }
}

// Output:
// Enter the number of people:3
// Enter the ages of the people:
// Age of person1:26
// Age of person2:18
// Age of person3:31

// Ages in ascending order:
// 18
// 26
// 31

// Ages in descending order:
// 31
// 26
// 18