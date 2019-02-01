import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {


    public int accountNumber;
    public double accountBalance;
    public String username;
    public char [] password;

    static   ArrayList <BankAccount> accounts = new ArrayList<BankAccount>();
    static Scanner sc = new Scanner(System.in);


    public BankAccount(int accountNumber, double accountBalance, String username, char [] password){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.username = username;
        this.password = password;
    }

    public static void addAccount(){



        System.out.println("Please enter the account number");
        while(!sc.hasNextInt()){
            String input = sc.next();
            System.err.println("You've entered a wrong number " + input);
            System.out.println("Please enter the value again");
        }
        int accountNumber = sc.nextInt();




        System.out.println("Please enter the Username");
        while(!sc.hasNextLine()){
            int input = sc.nextInt();
            System.err.println("You've entered a wrong number " + input);
            System.out.println("Please enter the value again");
        }
        String username = sc.next();

        System.out.println("Please enter the account balance");
        double accountBalance = sc.nextDouble();

        System.out.println("Please enter the password");
        String passwords = sc.next();
        char password [] = passwords.toCharArray();

        BankAccount account1 = new BankAccount(accountNumber,accountBalance,username,password);
        accounts.add(account1);
        menu();

    }

    public static void loginAccount(){
        System.out.println("Please enter the username");
        String username = sc.next();

        System.out.println("Please enter the password");
        char [] password = sc.next().toCharArray();

        for(BankAccount account : accounts){
            if (account.username.equalsIgnoreCase(username) && Arrays.equals(account.password, password)){

                System.out.println("Your login is successfull");
                System.out.println("Your account number is" + account.accountNumber);
                System.out.println("Your account balance is" + account.accountBalance);

            }else{

                System.out.println("Your login is not successfull");
            }
        }

        menu();
    }

    public static void menu() {

        System.out.println("Please select an option");
        System.out.println("1 . Add Account");
        System.out.println("2. login Account");
        System.out.println("3. Exit ");
        char option = '\0';
        option = sc.next().charAt(0);
        do {
            switch (option) {
                case '1':
                    addAccount();
                    break;

                case '2':
                    loginAccount();
                    break;
                case '3':
                    System.exit(3);
                default:
                    System.out.println("Invalid option");

            }



        } while (option != 3);

    }


    public static void main(String[] args){

        System.out.println("Welcome to New Banking System PTY");

        menu();


    }


    //New Comment added













}


