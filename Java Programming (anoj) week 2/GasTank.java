import java.util.Scanner;

public class GasTank {
    public static int gasInTank;
    public static int miles;
    public static int gasCostInGallon;
    public static int efficiency;
    public static int costPerMile;

    public int total;

public GasTank() {
    miles= 100;
    costPerMile = (gasCostInGallon*efficiency)/100;
}
public double costPer100Mile(){
    return (costPerMile*100);
}
public double distance(){
    return (gasInTank*efficiency)/100;
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Level of gas in tank = ");
    gasInTank = scan.nextInt();

    System.out.println("Price of gas per gallon = ");
    gasCostInGallon = scan.nextInt();

    System.out.println("Fule efficiency = ");
    efficiency = scan.nextInt();

    scan.close();

    GasTank gas = new GasTank();
    
    System.out.println(" Totle cost per 100 miles is "+(gas.costPer100Mile()));
    System.out.println(" Totle distance travel with gas in tank =  "+(gas.distance()));

}
}
