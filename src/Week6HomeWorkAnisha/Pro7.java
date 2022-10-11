package Week6HomeWorkAnisha;

import java.util.Scanner;

public class Pro7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value in fehrenheit:");
        double f = scanner.nextDouble();
        double c = (((f-32)*5)/9);
        System.out.println(c + "Degree celsius");
        }
    }



