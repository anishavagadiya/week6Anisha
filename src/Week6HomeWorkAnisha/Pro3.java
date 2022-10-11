package Week6HomeWorkAnisha;

public class Pro3 {
    int a = 15;
 static String test = "Pass";

    public static void main(String[] args) {
      myStaticMethod();
      Pro3 obj = new Pro3();
      obj.myInstanceMethod();

    }
    //instance method
    public void myInstanceMethod() {
        System.out.println(a);
        System.out.println(test);
    }
      //static method
    public static void myStaticMethod(){
        Pro3 obj = new Pro3();
        System.out.println(obj.a);
        System.out.println(test);


    }

}
