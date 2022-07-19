import java.util.Scanner;

public class Extract {
    public static float price;
    public int dollars;
    public int cent;

    public Extract() {
        dollars = (int)(price);
        cent = (int)((price - dollars) * 100 + 0.5);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your price :");
        price = scan.nextFloat();
        scan.close();

        Extract ex = new Extract();
        System.out.println(ex.dollars + " Dollars, " + ex.cent + " cents ");
    }
}
