import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {
        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Initialise some variables
        boolean isValidSize = false;
        int size = 0;

        // Allow the user to input more than one size if outside the range
        while (!isValidSize)  {
            // Prompt the user for the size
            System.out.print("Enter the size: ");
            size = in.nextInt(); // Reads in an int from standard input

            // Check if the input is outside the range
            if (size < 1) System.out.println("too small!");
            else if (size > 5) System.out.println("too big!");
            else isValidSize = true;
            System.out.println();
        }

        // Initialise two variables to hold the output
        int[] lineHalf;
        int[] lineReversed;
        int[] line = new int[size*2];
        int[][] block = new int[size][size*2];
        // Tracker for the column
        int column = 0;

        // Iterate through each unique row
        for (int row = 1; row <= size; ++row) {
            // Initialise the line array
            lineHalf = new int[size];
            column = 0;

            // Iterate through each number in the current row
            for (int number = row; number < (size + row); ++number) {
                // Add the number to the line
                lineHalf[column] = number;
                ++column;
            }

            // Reverse the line array
            lineReversed = reverseArray(lineHalf);
            // Join the 2 lines together
            System.arraycopy(lineHalf, 0, line, 0, size);
            System.arraycopy(lineReversed, 0, line, size, size);

            // Iterate through the line and output the numbers
            for (int i = 0; i < size*2; ++i) {
                System.out.print(line[i]);
            }
            System.out.println();

            // Add this line to the block
            block[row-1] = line.clone();
        }

        // Output the block in reverse order
        for (int blockRow = 0; blockRow < size; ++blockRow) {
            for (int number = 0; number < size*2; ++number) {
                System.out.print(block[block.length - blockRow - 1][number]);
            }
            System.out.println();
        }
        
        System.out.println();
        // Close the input stream reader
        in.close();
    }

    static int[] reverseArray(int[] arr) {
        // Initialise the reversed array
        int[] reversedArr = new int[arr.length];

        // Loop through reversing the elements
        for (int i = 0; i < arr.length; ++i) {
            reversedArr[i] = arr[arr.length - i - 1];
        }

        return reversedArr;
    }
}