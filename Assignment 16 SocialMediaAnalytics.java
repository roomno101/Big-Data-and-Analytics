
// 2. Develop a Java program for Social Media Analytics.
import java.util.Scanner;

public class SocialMediaAnalytics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of posts: ");
        int numberOfPosts = scanner.nextInt();

        int[] likes = new int[numberOfPosts];
        int[] shares = new int[numberOfPosts];
        int[] comments = new int[numberOfPosts];
        for (int i = 0; i < numberOfPosts; i++) {
            System.out.println("\nPost " + (i + 1) + ":");
            System.out.print("Enter number of likes: ");
            likes[i] = scanner.nextInt();
            System.out.print("Enter number of shares: ");
            shares[i] = scanner.nextInt();
            System.out.print("Enter number of comments: ");
            comments[i] = scanner.nextInt();
        }
        double averageLikes = calculateAverage(likes);
        double averageShares = calculateAverage(shares);
        double averageComments = calculateAverage(comments);
        System.out.println("\nSocial Media Analytics:");
        System.out.println("Average Likes per Post: " + averageLikes);
        System.out.println("Average Shares per Post: " + averageShares);
        System.out.println("Average Comments per Post: " + averageComments);

        scanner.close();
    }

    public static double calculateAverage(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return (double) sum / data.length;
    }
}

// Output:
// Enter the number of posts: 2

// Post 1:
// Enter number of likes: 10
// Enter number of shares: 2
// Enter number of comments: 4

// Post 2:
// Enter number of likes: 15
// Enter number of shares: 5
// Enter number of comments: 4

// Social Media Analytics:
// Average Likes per Post: 12.5
// Average Shares per Post: 3.5
// Average Comments per Post: 4.0