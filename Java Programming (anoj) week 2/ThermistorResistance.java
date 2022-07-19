import java.util.Scanner;

public class ThermistorResistance{
    public static double r, t;

    public double liquidTemperature(){
        final double b = 3969;
        final double r0 = 1075;
        final double t0 = 358;
        double eq1 = b * t0; 
		double eq2 = (t0 * Math.log1p((r / r0) - 1)) + b;
		return (eq1 / eq2) - 273;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Resistance: ");
		r = scan.nextDouble();
		scan.close();
		
        ThermistorResistance tr = new ThermistorResistance();

		System.out.println("Liquid Temperature: "+ tr.liquidTemperature() );
	}
}