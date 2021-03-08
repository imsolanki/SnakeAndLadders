import javax.swing.*;
import java.awt.*;

public class SnakeAndLadders extends  JFrame {

    public void showFrame(){
        super.setBounds(180, 150, 480, 480);
        super.setVisible(true);
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Owner\\Desktop\\name.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(480, 480,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);
        super.add(new JLabel(imageIcon));
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();

    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        int col,row;
        col=453;
        row=27;
        g.fillOval(row,col,40,40);
    }
    public static void main(String[] args) {
        SnakeAndLadders s = new SnakeAndLadders();
        s.showFrame();
    }

}
