// Q1. Java code for collecting student data and making dicisions based on it.
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbers of students: ");
    int numStudents = sc.nextInt();
    String[] studentNames = new String[numStudents];
    double[] studentGrades = new double[numStudents];
    for (int i = 0; i < numStudents; i++){
      System.out.println("\nEnter details for student " + (i+1) + ": ");
      System.out.print("Name: ");
      studentNames[i] = sc.next();
      System.out.print("Grade: ");
      studentGrades[i] = sc.nextDouble();
    }
    double totalGrade = 0;
    for(double grade: studentGrades){
      totalGrade += grade;
    }
    double averageGrade = totalGrade / numStudents;
    System.out.println("\nAverage grade: " + averageGrade);
    if(averageGrade >= 60){
      System.out.println("Congratulations! The class passes.");
    }else{
      System.out.println("Unfortunately, the class fails.");
    }
    sc.close();
  }
}
// Output:
// Enter the numbers of students: 2

// Enter details for student 1: 
// Name: Johny
// Grade: 70

// Enter details for student 2: 
// Name: Souvik
// Grade: 99

// Average grade: 84.5
// Congratulations! The class passes.
