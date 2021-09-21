import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class second extends JPanel {

    public void paintComponent(Graphics g){
        Graphics2D grap2 = (Graphics2D)g;

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        Shape line = new Line2D.Float(100,100,10,150) ;
        Shape ellipse = new Ellipse2D.Float(10,200,100,100);
        Shape round =new RoundRectangle2D.Double(25,25,50,50,45,45);
        Shape rectangle = new Rectangle2D.Float(150,100,100,150);


        grap2.setPaint(Color.BLACK);
        grap2.draw(line);
        grap2.setPaint(Color.RED);
        grap2.draw(ellipse);
        grap2.setPaint(Color.GREEN);
        grap2.draw(round);
        grap2.draw(rectangle);


    }
}
