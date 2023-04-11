import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //creating an instance of ATMDispenser class
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
//        while (true) {
            int amount;
            System.out.println("Enter amount to dispense");

            //accepts input from user
            Scanner input = new Scanner(System.in);

            // assigns user input to variable amount
            amount = input.nextInt();

            //checks that amount is not less than 0
            if (amount <= 0) {
                System.out.println("Error!!");
                System.out.println("Amount should not be zero or negative");
                return;
            }
            System.out.println("Dispensing: ");
            // process the request
            atmDispenser.note50.dispense(new Currency(amount));
        //}
    }
}
