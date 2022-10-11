package Week6HomeWorkAnisha;

public class Pro4 {
    int a = 10;
    int b = 20;
    static String city = "London";
    static String county = "Middlesex";

    public static void main(String[] args) {
        Pro4 t = new Pro4();
        t.myFirstMethod();
        myNumber();

    }

    ///instance method
    public void myFirstMethod() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(city);
        System.out.println(county);
    }
    //static method

    public static void myNumber() {
        Pro4 obj = new Pro4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(city);
        System.out.println(county);

    }

}



