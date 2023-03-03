import java.util.Random;

public class DmvSimulator {

    public static void main(String args[]) {
        //Welcome message
        System.out.println("Welcome to the DMV!"); 

        //PRNG object 
        Random prng = new Random(); 
        //Line length (Easier than hardcoding it)
        int lineLength = 200;
        //Generate a random int between [0,lineLength] and adds one to get [1,lineLength]
        int ticketNumber = prng.nextInt(lineLength) + 1;
        System.out.println("Your number is: " + ticketNumber); 
        System.out.println("Please wait until your number is called.");
        
        //Calls every number 
        for(int i = 1; i < lineLength; i++) {
            if(ticketNumber + i > lineLength) {
                int temp = (ticketNumber + i) - lineLength;
                System.out.println("Number: " + temp);
            }
            else {
                System.out.println("Number: " + (ticketNumber + i));
            }
        }

        //Generates a random number between 1 and a 100
        int miracle = prng.nextInt(100) + 1; 
        if(miracle == 1) {
            System.out.println("You somehow have the right paperwork. IMPOSSIBLE!");
        }
        else {
            //Tells the customer that they do not have the correct paperwork 
            System.out.println("Get out of my face you peseant! You have the wrong paperwork! IDIOT! MWAHAHAHA");
        }
    }

}
