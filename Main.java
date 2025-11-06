import java.util.Scanner;

class BankAccount {
    double balance;

    // TODO A1: Add a constructor that sets balance
    BankAccount(double B){
        balance = B;
    }

    // TODO A2: Add a method withdraw(double amount)
    //   - If amount <= balance: subtract and print
    //       "Withdrew $<amount>. Balance = $<balance>"
    //   - Else: print "Not enough funds!"
       void withdraw(double amount){

        if ( amount <= balance) {
            balance-= amount;
            System.out.println("Withdrew: $ " + amount + " Balance = $ " + balance);

        }else{
            System.out.println("Not enough funds!");
        }
       }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO B1: Ask user for starting balance
        // TODO B2: Create a BankAccount object

        System.out.print("Enter Starting Balance:");
        double Balance = sc.nextDouble();

        BankAccount B = new BankAccount(Balance);
        // TODO C1: Ask for amount to withdraw (0 to exit)
        // TODO C2: While amount != 0
        //   - Call withdraw(amount)
        //   - Ask for next amount
        while(true ) {
            System.out.print("Enter amount to withdraw ( 0 to exit): ");
            double amount = sc.nextDouble();

            if (amount == 0){
                break;
            }
            B.withdraw(amount);
        }
        System.out.println("Goodbye!");
        // After loop ends:
        //   Print "Goodbye!"
    }
}