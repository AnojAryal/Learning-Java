//importing scanner class
import java.util.Scanner;

//declaring class that prints the day according to the no. entered
class E3{

    //declaring switchmethod num
    public void switchMethod(int num){
        switch(num){
            case 1 : System.out.println(" ");
                     System.out.println("Today is Monday.");
                     System.out.println(" ");
                break;
            case 2 : System.out.println(" ");
                     System.out.println("Today is Tuesday.");
                     System.out.println(" ");
                break;
            case 3 : System.out.println(" ");
                     System.out.println("Today is Wednesday.");
                     System.out.println(" ");
                break;
            case 4 : System.out.println(" ");
                     System.out.println("Today is Thursday.");
                     System.out.println(" ");
                break;
            case 5 : System.out.println(" ");
                     System.out.println("Today is Friday.");
                     System.out.println(" ");
                break;
            case 6 : System.out.println(" ");
                     System.out.println("Today is Saturday.");
                     System.out.println(" ");
                break;
            case 7 : System.out.println(" ");
                     System.out.println("Today is Sunday.");
                     System.out.println(" ");
                break;
        }
                    
    }

    //declaring main method
    public static void main(String[] args) {

        //declaing variable
        int num;
        
        //creating object in scanner
        Scanner read = new Scanner(System.in);

        //creating loop

        do{
            
            //reading data from console
            System.out.println(" ");
            System.out.println("Please enter any number : ");
            System.out.println(" ");
            num = read.nextInt();

            if(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7){
                break;
            }
            else{
                System.out.println(" ");                
                System.out.println("This number is invalid !!!");
            }

        }while(!(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7));

        read.close();

        //new object is created and initialized
        E3 e = new E3();

        //invoking switch method
        e.switchMethod(num);
    }
}