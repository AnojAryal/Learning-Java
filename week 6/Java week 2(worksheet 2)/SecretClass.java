/*
* Please fill or complete the comments of this class so that
* they reflect what their subsequent line(s) are doing
*/
public class SecretClass {
    // The constant PI is declared with value.
    static final double PI = 3.141592653589793;
    
    /*
    * The purpose of the main() method is excute the program.
    */
    public static void main(String args[]) {

        // This is written to print "Java is cool!".
        System.out.println("Java is cool!");
    
        // The line prints the sum of 2 and 3.
        System.out.println(2 + 3);
    
        // The line print 24 as 2 is written as string and 2+2 is arthematic.
        System.out.println("2" + (2 + 2));
    
    /*
    * The next two lines prints PI = 3.141592653589793 . 
    */
        String str = "PI = ";
        System.out.println(str + PI);
    
        // The square of PI is calculated.
        double piSquare = PI * PI;
    
        // The line prints "The square of PI is 3.141592653589793".
        System.out.println("The square of PI is " + piSquare);
    
        // The piSquare is divided by 2.
        double fakePI = piSquare/2;
    
        // The value of PI and fakePI is compared and value is printed in true or flase form.
        boolean checkPI = (PI == fakePI);
    
        // The line prints "PI and the fake PI are equal. This statement is true or flase."
        System.out.println("PI and the fake PI are equal. " + " This statement is " + checkPI + ".");
    
    /*
    * The next 3 lines delcares the value of fakePI and compares with PI and the truth of the statement is determined.
    */
        fakePI = 3.141592653589793;
        checkPI = (PI == fakePI);
        System.out.println("PI and the fake PI are equal. " + " Now this statement is " + checkPI + ".");
    
        // The line checks the truthness of the terms.
        System.out.println("Hussain".equals("Fred"));
    }
}