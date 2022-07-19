// Impotring the class Scanner.
import java.util.Scanner;
// Declaring the class name.
class MeterToKilometers{
    // Declaring a constant with value.
    public static final double CONSTANT = 1000000;
    // Method conversion is defined.
    public void conversion(){
        // Reading form console.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the distance in square meter : ");
        // Value entered from console is read.
        double a = read.nextDouble();
        read.close();
        double b = a / CONSTANT;
       // Output the result.
        System.out.printf(a + "square meters is equal to " + b + " square kilometers"); 
    }
    // Main method is decalred.
    public static void main(String[] args) {
        // Object is initilized.
        MeterToKilometers mtk = new MeterToKilometers();
        // Method conversion is called.
        mtk.conversion();
    }
}