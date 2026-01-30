import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input

        in.nextLine();
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sum of squares from " + (startNum) + " to " + (endNum) + ":");

        int sumOfSquares = 0;
        for (int i = startNum; i <= endNum; ++i) sumOfSquares += (i * i);
        
        System.out.println(sumOfSquares);
    }
}