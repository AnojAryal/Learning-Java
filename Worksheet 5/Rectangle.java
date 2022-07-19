import java.util.Scanner; // ...

/**
 * Write a description of class Rectangle here.
 * .
 * 
 */
public class Rectangle
{
    double length; 
    double width; 

    /*
     * method rectangle is declaared
     * global vairables length and width are assigned to the value of local variable l and w reaspectic=vely
     */
    public Rectangle(double l, double w)
    {
        length = l; 
        width = w;  
    }

    
    /*
     * method getlength is declared.
     * this method returns the value of length to double getlength 
     */
    public double getLength() {
        return length; 
    }
    
    /* 
     * method getwidth is declared
     * This method returns the value of width to double getwidth
     */
    public double getWidth() {
        return width; 
    }
    
    /*
     *  method is square is declared
     *  This method returns a boolean value to the boolean issquare
     */
    public boolean isSquare()
    {
        return (length == width); // returns boolean value
    }
    
    /*
     * method getarea is declared
     * This method returns the value of area to double getarea
     */
    public double getArea() {
        double area = length * width; 
        return area; 
    }
    
    /*
     *  method getperimeter is declared
     *  This method returns the calculated value to double getperimeter
     */
    public double getPerimeter() {
        return 2 * (length + width); 
    }
    
    /*
     * main method is declared
     * The main method is the method that is executed during excution
     * this method calls the required method during the execution of the program 
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // new object is created in scanner
        
        String cont = "yes"; // value yes assigned to variable cont
        
        /*
         * The following do-while block loops the program while user enters yes and stop the program when user enters no
         */
        do {
            /*
             * The next 4 lines reads the data from console that user entered
             */
            System.out.print(" Enter the length of rectangle: ");
            double len = keyboard.nextDouble(); // reads the data from console
            System.out.print(" Enter the width of rectangle: ");
            double wid = keyboard.nextDouble(); // reads the data from console
            
            /*
             * The if statement and the next 4 lines checks the entered value are valid and the results obtained from the different calculation
             */
            if ((len <= 0) || (wid <= 0)) {
                System.out.println("You have entered the wrong value.\n");
                continue;  
            }
            
            Rectangle myRectangle = new Rectangle(len, wid); // new object is created and initialized

            
            System.out.println("The length of the rectangle is " + myRectangle.getLength()); 
            
            
            System.out.println("The width of the rectangle is " + myRectangle.getWidth());
            
            

            System.out.println("The area of the rectangle is " + myRectangle.getArea());
            
            

            System.out.println("The perimeter of the rectangle is " + myRectangle.getPerimeter());
                        
            boolean isSquare = myRectangle.isSquare(); // vaiable issquared is assigned to the value obtained after calling issquare function
            
            /*
             * The following if-else statement checks whether the rectangle is square or not
             */
            if (isSquare) { // checks whether the rectangle is square or not
                System.out.println("The rectangle is a square."); 
            }
            else { // whether the rectangle is square or not
                System.out.println("The rectangle is no square."); 
            }
            
            System.out.print("Do you want to continue [yes/no]? "); 
            cont = keyboard.next(); // data is read from the console and assigned to cont variable
            System.out.println(""); // prints a space
        }
        while (cont.equals("yes")); // checks the value of cont and decides whether to continue the loop or not
        
        System.out.println("thankyou!"); 
    }
}
