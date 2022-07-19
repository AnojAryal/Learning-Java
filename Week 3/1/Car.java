//importing Scanner class
import java.util.Scanner;

/*
 * A class for car objects, demonstrating the use of methods as behaviours
 * and variables as properties.
 * 
 * Ingo Frommholz, October 2011
 */
public class Car
{
    /*
     * The properties of a car
     */
    String model;  // the car model
    String colour;  // the car color
    int numOfPassengers; // how many passengers are in the car?
    double amountOfGas;  // the amount of gas

    /*
     * Constructor of a car object. This constructor takes 3
     * parameters, mod, col, num and amount to set the model, the colour,
     * the number of the passenger and the amount of gas
     * of the particular car object.
     */
    public Car(String mod, String col, int num, double amount)
    {
        model = mod;
        colour = col;
        numOfPassengers = num;
        amountOfGas = amount;
    }
    
    public Car(String mod) {
        model = mod;
        colour = "blue";
    }
    
    /*
     * Initialises the values
     */
    public void initialise()
    {
        numOfPassengers = 0;
        amountOfGas = 16.5;
    }
    
    /*
     * Sets the amount of gas. This method changes the amount of gas
     * property of the object, but does not return anything.
     */
    public void setAmountOfGas(double amount) {
        amountOfGas = amount;
    }
    
    /*
     * Gets the current amount of gas. This method returns the current
     * amount of gas as a double value.
     */
    public double getAmountOfGas()
    {
        return amountOfGas;
    }
    
    /*
     * This adds a passenger to your car.
     */
    public void addPassenger() {
        numOfPassengers++;
        
        // alternatively:
        // numOfPassengers = numOfPassengers + 1;
    }
    
    /*
     * This removes a passenger from your car.
     */
    public void removePassenger() {
        numOfPassengers--;
        
        // alternatively:
        // numOfPassengers = numOfPassengers - 1;
    }
    
    /*
     * This returns the current number of passengers as an integer value. 
     */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    
    /*
     * This returns the model of the car as a String object
     */
    public String getModel() {
        return model;
    }
    
    /*
     * This returns the colour of the car as a String object
     */
    public String getColour() {
        return colour;
    }
    
    public static void main(String[] args) 
    {

        //creating a object in scanner class
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the model of the car : ");
        String mod = read.nextLine();
        System.out.println("Enter the color of the car : ");
        String col = read.nextLine();
        System.out.println("Enter the number of passenger in the car : ");
        int num = read.nextInt();
        System.out.println("Enter the amount of gas in the car : ");
        double amount = read.nextDouble();
        read.close();



        /*
         * Create a new Car object and initialise it
         */
        Car myCar = new Car(mod, col, num, amount);
        myCar.initialise();
        System.out.println("My car is a " + myCar.getModel() 
                            + " and it is " + myCar.getColour() + ".");
                           
                            
        /*
         * Get and print the amount of gas
         */      
        double gasAmount = myCar.getAmountOfGas();
        System.out.println("The current amount of gas is " + gasAmount + ".");

        
        /*
         * Add and print a new passenger
         */
        myCar.addPassenger(); // a new passenger
        myCar.addPassenger(); // and another one
        int passengers = myCar.getNumOfPassengers();
        System.out.println("My car carries " + passengers 
                            + " passengers right now.");
        
        /*
         * Refill the tank, print new value
         */                    
        myCar.setAmountOfGas(30); // fill the tank
        gasAmount = myCar.getAmountOfGas();
        System.out.print("I refilled my car! "); // note the use of print()
        System.out.println("Now the current amount of gas is " 
                            + gasAmount + ".");
                            
        /*
         * Remove one passenger, print updated number of
         * passengers
         */                    
        myCar.removePassenger(); // 1 passenger stepped off
        passengers = myCar.getNumOfPassengers();
        System.out.println("My car carries " + passengers 
                            + " passengers right now.");                    
    }
}