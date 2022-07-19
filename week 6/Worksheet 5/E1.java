//importing Scanner class
import java.util.Scanner;

//declaring class as E1 
class E1{

    //declaring loop method
    public void loop(){


            //creating object in scanner 
            Scanner scan = new Scanner(System.in);

            //declaring variable
            String c;

        //looping statement implementing
        do{
           

            System.out.println("Do you want to continue? (Y / N) :");
            System.out.println(" ");

            //declarig loop inside a loop
            do{    
                c = scan.nextLine();

                //declaring condition 
                if((c.equalsIgnoreCase("n")) || c.equalsIgnoreCase("y")){
                    break;
                }

                else{
                    System.out.println(" ");
                    System.out.print("This is invalid character !!!");
                    System.out.println(" Please enter the character once again.");
                    System.out.println(" ");
                }

            }while(!(c.equalsIgnoreCase("y")) || (c.equalsIgnoreCase("n")));
            
        } while (c.equalsIgnoreCase("y"));    //closing statement with looping value

        scan.close();

        System.out.println(" ");
        System.out.println("See You soon!");
        System.out.println(" ");

    }

    //declaring main method
    public static void main(String[] args){
        
        //object is created and initialized
        E1 e = new E1();
        
        //invoking loop method
        e.loop();
    }
} 