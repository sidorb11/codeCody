package tutorials.tutorials.basic;

public class Constance {
   public static final int WIDTH= 800;
   public static final int WEIGHT=600;
   public static final Person PI=new Person("");
   public static final int NUM_ENEMIES=5;

    public static void main( String[] args ) {
        //constance never change
        //declare constance by using the final
        System.out.println(WIDTH);
        System.out.println(Math.PI);
    }
}
