package tutorials.tutorials.basic;

public class Method {
    public static void main( String[] args ) {
        sayHelloWorld();
        sayHelloTo("charlie");
        sayHelloTo("john");
        int x= returnFive();
        System.out.println(x);

        int result= square(returnFive());
        System.out.println(square(returnFive()));

    }
    static int square(int x){
        return x*x;
    }
    static int returnFive(){
        return 5;
    }
    static void sayHelloTo(String name){
        System.out.println("Hello, "+name+" !");
    }
    static void sayHelloWorld(){
        System.out.println("Hello World!");
    }
}