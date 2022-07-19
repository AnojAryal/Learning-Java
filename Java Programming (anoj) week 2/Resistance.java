import java.util.Scanner;

public class Resistance {
    public static double r1, r2, r3, parallelRegistance;

    public double registance(){
        parallelRegistance = (1/r2)+(1/r3);
        return (r1 + parallelRegistance);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter r1 Resistance :" );
        r1 = scan.nextDouble();
        System.out.println("Enter r2 Resistance :" );
        r2 = scan.nextDouble();
        System.out.println("Enter r Resistance :" );
        r3 = scan.nextDouble();
        scan.close();
        Resistance r = new Resistance();
        System.out.println("Total Registance = "+r.registance());
    }
}
