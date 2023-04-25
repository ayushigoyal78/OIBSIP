import java.util.*;
public class ATMExample {
    String name;
    String username;
    String password;
    String accountno;
    float balance = 1000001;
    int transactions = 0;
    String transactionHistory = "";

    public static void register() {
        Scanner sc = new Scanner(System.in);
        ATMExample a=new ATMExample();
        System.out.print("\n enter your name ");
        a.name = sc.nextLine();
        System.out.print("\nenter your username ");
        a.username = sc.nextLine();
        System.out.print("\n enter your password ");
        a.password = sc.nextLine();
        System.out.print("\n enter your account number ");
        a.accountno = sc.nextLine();
        System.out.println("\n Registration completed ");
        //sc.close();
        System.out.println(login(a.username,a.password));
    }

    public static boolean login(String user,String pass) {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        ATMExample a=new ATMExample();
        while (!isLogin) {
            System.out.print("\n enter your username");
            String username = sc.nextLine();
            if (username.equals(user)) {
                while (!isLogin) {
                    System.out.print("\n enter your password ");
                    String password = sc.nextLine();
                    if (password.equals(pass)) {
                        System.out.println("\nlogin successfully");
                        isLogin = true;
                    } else {
                        System.out.println("\nIncorrect password");
                    }
                }
            }
            else {
                System.out.println("\n username not found ");
            }
        }
        return isLogin;
    }

    public static void main(String[] args) {
        register();
        //declare and initialize balance, withdraw, and deposit
        int balance = 100000, withdraw, deposit;
        int transfer;

        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for transfer");
            System.out.print("choose 5 for exit");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    //get the withdrawl money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposite amount from te user
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Enter money to be transfer:");

                    //get the withdrawl money from user
                    transfer = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= transfer) {
                        //remove the withdrawl amount from the total balance
                        balance = balance - transfer;
                        System.out.println("Please transfer  money");
                    } else {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 5:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}