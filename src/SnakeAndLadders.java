import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SnakeAndLadders extends  JFrame implements ActionListener{
    JButton btn;
    JLabel label;
    int location=1;
    public void showFrame(){

        super.setPreferredSize(new Dimension(500, 520));
        super.setResizable(false);
        super.setVisible(true);
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Owner\\Desktop\\name.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(480, 450,  0); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);
        label = new JLabel(imageIcon);
        label.setBounds(0,0,480,450);
        super.add(label);
        btn = new JButton();
        btn.setBounds(245,455,75,25);
        super.add(btn);
        btn.addActionListener(this);

        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();

    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        int x;
        int y;
        //----------------------------------------------------------------//

        //----------------------------------------------------------------//
        g.fillOval(x,y,40,40);
    }
    public static void main(String[] args) {
        SnakeAndLadders s = new SnakeAndLadders();
        s.showFrame();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(btn))//start
        {

            //int x= (int) Math.floor(Math.random() * (7 - 1) + 1);
            Random r =new Random();
            int x = r.nextInt(6)+1;
            movements(x);
            btn.setText(String.valueOf(x));
        }

        }
        public void movements(int move){

        location =location+move;

        this.repaint();
        }


}
