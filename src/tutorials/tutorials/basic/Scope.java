package tutorials.tutorials.basic;

public class Scope {

    static int x;
    public static void main(String[] args) {
        int x= 5;
        System.out.println(x);
        doSomething();
        System.out.println(x);

    }
    static void doSomething(){
        x=10;

    }
    static void doSomethingLocaly(){
        int y= 100;
    }
}
