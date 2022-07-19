import java.util.Scanner;

public class BookStore {
    public static double taxOnBook, taxPrice; 
    public static double shippingCharge, totalShippingCharge;
    public static double numOfBooks, totalBookPrice, pricePerBook;

    public BookStore(){
        taxOnBook = 7.5f;
        shippingCharge = 2;
        totalBookPrice = numOfBooks*pricePerBook;
        taxPrice = totalBookPrice*taxOnBook/100;
        totalShippingCharge = numOfBooks*shippingCharge;
    }
    public double bookStore(){
        return (totalBookPrice+totalShippingCharge+taxPrice);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers of books :" );
        numOfBooks = scan.nextDouble();
        System.out.println("Enter price of book :" );
        pricePerBook = scan.nextDouble();
        scan.close();
        BookStore bs = new BookStore();
        System.out.println("Price of order is : "+bs.bookStore());
    }
    
}
