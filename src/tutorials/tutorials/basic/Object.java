package tutorials.tutorials.basic;

import javax.swing.*;

public class Object {
    public static void main( String[] args ) {
        int number=5;
        JFrame window=new JFrame();//window variable that holds jfrme aobject end we created
        window.setTitle("My window");// we"re calling methods on our j frame object to configure that
        window.setSize(800,600);
        window.setVisible(true);
        JLabel label= new JLabel();
        label.setText("My label");//we're calling the add method of our JFrame object to add our label to the window

        window.add(label);
        String s = "hi";

    }
}
