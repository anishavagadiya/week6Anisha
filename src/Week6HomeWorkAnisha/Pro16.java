package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro16 {

    public static void main(String [] args){
        Pro16 obj = new Pro16();
        obj.addbinaryum();

    }

    ///Adding two binary numbers
    public void addbinaryum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two binary numbers");
        String b1 = s.nextLine();
        String b2 = s.nextLine();
        int num1 = Integer.parseInt(b1, s.radix());
        int num2 = Integer.parseInt(b2, s.radix());
        int sum = num1 + num2;
        System.out.println("The sum of given binary numbers is : ");
        System.out.println(Integer.toBinaryString(sum));
        s.close();


    }














}
