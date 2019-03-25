package tutorials.tutorials.basic;

public class Loops {
    public static void main( String[] args ) {
        //  whileLoop();
        // doWhile();
        forLoop();
    }

    static void whileLoop() {
        int counter = 10;
        while (counter < 10) {
            System.out.println(counter);
            counter = counter + 1;
        }

    }
    static void doWhile(){
        int counter=10;

        do{
            counter=counter+1;
            System.out.println(counter);

        }while (counter<10);
    }
    static void forLoop(){
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(counter);

        }
    }
}
