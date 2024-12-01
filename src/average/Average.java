
package average;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Average {
    // Average class
        private int[] data = new int[5]; 
        private double mean; 

        // Constructor
        public Average() {
            Scanner scanner = new Scanner(System.in);

            // scores
            for (int i = 0; i < data.length; i++) {
                System.out.print("Enter score " + (i + 1) + ": ");
                data[i] = scanner.nextInt();
            }

        //sorting and calculating
            selectionSort(); 
            calculateMean();  
        }

        // Calculate the mean
        private void calculateMean() {
            int total = 0;
            for (int score : data) total += score;
            mean = (double) total / data.length;
        }

        // Sorting array in descending order
        private void selectionSort() {
            for (int i = 0; i < data.length - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] > data[maxIndex]) maxIndex = j;
                }
                // Swap
                int temp = data[maxIndex];
                data[maxIndex] = data[i];
                data[i] = temp;
            }
        }
        //
        public String toString() {
            StringBuilder result = new StringBuilder("Data in descending order: ");
            for (int score : data) result.append(score).append(" ");
            result.append("\nMean: ").append(mean);
            return result.toString();
        }
    }
//song class (given)
    public static class Song { 
private String title;   // The song's title 
private String artist;  // The song's artist 

public Song(String title, String artist) 
{ 
this.title = title; 
this.artist = artist; 
} 
 
public String toString() 
{ 
return title + " by " + artist + "\n"; 
} 

    public static void main(String[] args) {
        //task 1 and 2
        System.out.println("Task #1 and #2: Average Class and Driver");
        Average average = new Average();
        System.out.println(average);
    }
    
}
