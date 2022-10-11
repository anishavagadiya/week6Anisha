package Week6HomeWorkAnisha;

import java.util.Locale;
import java.util.Scanner;

public class Pro19 {
    public static void main(String[] args) {
        Pro19 obj = new Pro19();
        obj.upperTolower1();
    }

    ////upper case to lower case conversion
    public void upperTolower1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string in upper Case:");
        String uppstrng = scanner.nextLine();
        String lowstng = uppstrng.toLowerCase();
        System.out.println("The lower case string is: " + lowstng);
        scanner.close();
    }





}
