import java.util.Scanner;

public class RelativeHumidity
{
    public static double temp, rH, equ;
    public static final double A = 17.27;
	public static final double B = 237.7;

    public double humidity(){
        equ = (((A * temp) / (B + temp)) + Math.log1p((rH / 100.0) - 1));
        return ((B * equ) / (A - equ));
    }
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Temperature(C): ");
		temp = in.nextDouble();
		
		System.out.print("Enter Relative Humidity: ");
		rH = in.nextDouble();
		
		in.close();

        RelativeHumidity rh = new RelativeHumidity();
		System.out.printf("Humidity: %5.3f",rh.humidity() );
	}

}
