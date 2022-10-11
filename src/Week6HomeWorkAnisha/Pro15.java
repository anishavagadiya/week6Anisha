package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro15 {
public void P15() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number x: ");
    int x = s.nextInt();
    System.out.println("Enter number y: ");
    int y = s.nextInt();
    int z = y;
    y = x;
    System.out.println("-----Swap numbers-------");
    System.out.println("Number x: " + z);
    System.out.println("Number y: " + y);
    s.close();
}
public static void main(String []args){
    Pro15 obj = new Pro15();
    obj.P15();

}

}


















