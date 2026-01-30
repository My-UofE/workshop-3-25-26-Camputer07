import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input

        in.nextLine();
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sum of squares from " + (startNum) + " to " + (endNum) + ":");

        int sumOfSquares = 0;
        int i = startNum;
        while (i <= endNum) {
            sumOfSquares += (i * i);
            i++;
        }
        
        System.out.println((double) sumOfSquares / (endNum - startNum + 1));
    }
}