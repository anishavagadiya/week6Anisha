package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro18 {
    public static void main(String[] args) {
        Pro18 obj = new Pro18();
        obj.compute();
    }
    //sum (addition), multiply, subtract, divide and remainder of two numbers

    public void compute(){
        Scanner s = new Scanner(System.in);
        System.out.println("input first time : ");
        int num1 = s.nextInt();
        System.out.println("input second number :");
        int num2 = s.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        System.out.println(num1 + "-" + num2 + "-" + (num1-num2));
        System.out.println(num1 + "*" + num2 + "*" + (num1*num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        System.out.println(num1 + "mod" + num2 + "=" + (num1%num2));
        s.close();

    }








}
