package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro13 {

    public static void main(String[] args) {

    }
    ///Calculating average of three numbers
    public void average(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 3 number: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        System.out.println("Average of the given number is: " + (num1+num2+num3)/3);
        s.close();
    }
}
