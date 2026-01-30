public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
 
       // If block
       if (number == 1) System.out.println("uno");
       else if (number == 2) System.out.println("dos");
       else if (number == 3) System.out.println("tres");
       else if (number == 4) System.out.println("cuatro");
       else if (number == 5) System.out.println("cinco");
       else System.out.println("Sorry I do not know that!");

       // Switch block
       switch (number) {
        case 1: System.out.println("uno"); break;
        case 2: System.out.println("dos"); break;
        case 3: System.out.println("tres"); break;
        case 4: System.out.println("cuatro"); break;
        case 5: System.out.println("cinco"); break;
        default: System.out.println("Sorry I do not know that!");
       }
    }
 }