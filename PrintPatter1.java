import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPatter1 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt(); // Reads in an int from standard input

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}