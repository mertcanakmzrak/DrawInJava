import javax.swing.*;

public class first  {
    public static void main(String[] args){

        JFrame f = new JFrame("DRAWING");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        second p = new second();
        f.add(p);
        f.setSize(400,400);
        f.setVisible(true);

    }
}
