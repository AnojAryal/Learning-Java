// Import scanner class.
import java.util.Scanner;
//class is defined.
public class Input{
    //main method is declared
    public static void main(String [] args) {
        // Reading integer from console.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        // value entered from the console is read.
        int a = read.nextInt();
        read.close();
        // Multiplying the input variable by 2.
        int b = a * 2;
        // Ouput the result.
        System.out.printf(a + " multiplied by 2 is " + b);
    }
}