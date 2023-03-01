import java.util.Random;

public class DmvSimulator {

    public static void main(String args[]) {
        //Welcome message
        System.out.println("Welcome to the DMV!"); 

        //PRNG object 
        Random prng = new Random(); 
        //Generate a random int between [0,99] and adds one to get [1,100]
        int ticketNumber = prng.nextInt(100) + 1;
        System.out.println("Your number is: " + ticketNumber); 
        System.out.println("Please wait until your number is called.");
        
        //Calls every number 
        for(int i = 1; i < 100; i++) {
            if(ticketNumber + i > 100) {
                int temp = (ticketNumber + i) - 100;
                System.out.println("Number: " + temp);
            }
            else {
                System.out.println("Number: " + (ticketNumber + i));
            }
        }

        //Tells the customer that they do not have the correct paperwork 
        System.out.println("You do not have the right paperwork, SUCKER!");
    }

}
