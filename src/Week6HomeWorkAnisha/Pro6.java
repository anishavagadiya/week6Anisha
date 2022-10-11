package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args){
        Pro6 obj = new Pro6();
        obj.circle();
    }

    public void circle(){
        double r;
        System.out.println("Area of circle");
        Scanner ci = new Scanner(System.in);
        System.out.println("Enter radius");
        r = ci.nextDouble();
        System.out.println("Area: " + (3.14 * r *r));
        ci.close();
    }

}

