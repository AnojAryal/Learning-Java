import java.util.Scanner;

public class DiscountCalculator{

    public static int movieRentals;
    public static int memberReferral;

    public  double discountCalculator(){
        double discountVal = Math.min(movieRentals + memberReferral, 75);
        return discountVal;
    }
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number of movie rentals: ");
    movieRentals = scan.nextInt();

    System.out.print("Enter the number of members referred to the video club: ");
    memberReferral = scan.nextInt();
    scan.close();

    DiscountCalculator dc = new DiscountCalculator();
    System.out.println("The discount is equal to: " + dc.discountCalculator());
    

}

}
