public class Demoofstatic {
    static int a = 100;
    static
    {
        System.out.println("This is static block.");
       // a=2;
    }
    static void method1()
    {
        System.out.println("This is static method.");
        System.out.println("Static variable is:" + a);
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        method1();
        System.out.println(a);
    }

}
