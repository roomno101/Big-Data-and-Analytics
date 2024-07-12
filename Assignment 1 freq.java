// program to calculate the frequency of a letter in a string
import java.util.Scanner;

public class freq{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String : ");
        String inpuString = sc.nextLine();

        System.out.print("Enter the letter to find its frequency : ");
        char targetLetter = sc.next().charAt(0);

        int frequency = calculateLetterFrequency(inpuString, targetLetter);
        System.out.print("Frequency of "+ targetLetter+" in the string : " + frequency);
    }
    private static int calculateLetterFrequency(String inpuString, char targetLetter){
        int frequency = 0;

        for(char letter : inpuString.toCharArray()){
            if(Character.toLowerCase(letter) == Character.toLowerCase(targetLetter)){
                frequency++;
            }
        }
        return frequency;
    }
}
// Output:
// Enter the string:chrisevans
// Enter the letter to find its frequency:
// s
// Frequency of s in the string 2