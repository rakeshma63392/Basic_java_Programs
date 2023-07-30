import java.util.Scanner;

public class account {

        static double amount;
        static double cash;
        static double balance;
        public static void main(String[] args) {

            account();
            System.out.println("How much money you want to withdraw your money??");
            Scanner s= new Scanner(System.in);
            cash=s.nextInt();
            if (cash<amount) {
                withdrawAmount();
            } else {
                System.out.println("your account have not enough money");
            }

        }
        public static void account(){
            amount=15000;

            System.out.println("Your bank balance is="+amount);


        }


        public static void withdrawAmount(){
            //   System.out.println("enter amount to withdraw");
            // Scanner s=new Scanner(System.in);
            //  int cash=s.nextInt();

            balance=amount-cash;

            System.out.println("Your balance is "+ balance);
        }

    }

