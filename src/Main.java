import java.util.Scanner;

public class Main {

    //Variables
    static int balance = 5000, withdraw, deposit;
    static String thankYou = "Thank you for using our service";


    public static void main(String[] args) {

        byte options;
        do {
            System.out.println("Automatic Teller Machine\n");

            //Options
            System.out.println("Enter 1 to check your balance");
            System.out.println("Enter 2 to withdraw from your balance");
            System.out.println("Enter 3 to deposit to your balance");
            System.out.println("Enter 4 to exit\n");

            //Scanner
            Scanner atm = new Scanner(System.in);

            //Operation
            System.out.println("Enter which option you would like to use:");
            options = atm.nextByte();


            switch (options) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println(thankYou);
                    break;
            }

        } while (options != 4);
    }

    //Functions

    //Checking Balance
    static void checkBalance() {
        System.out.println("Balance : " + balance);
    }

    //Withdrawing Money
    static void withdrawMoney() {
        //Scanner
        Scanner atm = new Scanner(System.in);

        System.out.println("Enter the amount of money you want to withdraw");
        withdraw = atm.nextInt();

        if (withdraw < balance) {
            balance = balance - withdraw;
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("You don't have sufficient funds to perform this action");
        }
    }

    //Depositing Money
    static void depositMoney() {
        //Scanner
        Scanner atm = new Scanner(System.in);

        System.out.println("Enter the amount of money you want to deposit");
        deposit = atm.nextInt();

        balance = balance + deposit;
        System.out.println("Balance : " + balance);
    }
}

