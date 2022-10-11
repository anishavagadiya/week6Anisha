package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        int a = sc.nextInt();
        System.out.println("plese enter second number");
        int b = sc.nextInt();

        multiplication(a, b);
        division(a, b);
    }
        public void addition (int a, int b){
            System.out.println("addition of two numbers is : " + (a + b));
        }
        public void subtraction ( int a, int b){
            int x = a - b;
            System.out.println("subtraction :" + x);
        }
        public static void multiplication ( int a, int b){
            int i = +a * b;
            System.out.println("multiplication : " + i);
        }
        public static void division ( int a, int b){
            int z = a / b;
            System.out.println("division : " + z);
        }

    }

