import java.util.Scanner;

public class Operations {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
          System.out.println("enter Any two numbers  " );
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            //   ArithmeticOperations result = new ArithmeticOperations();
            additionOp(num1, num2);
            subtractionOp(num1, num2);
        }

        private static void subtractionOp(int num1, int num2) {
            int sub;
            sub = num1 - num2;
            System.out.println("the subtraction is " + sub);
        }

        private static void additionOp(int num1, int num2) {
            int sum;
            sum = num1 + num2;
            System.out.println("the sum is " + sum);
        }

    }


