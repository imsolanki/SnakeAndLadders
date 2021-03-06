import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SnakeAndLadders extends  JFrame implements ActionListener {

    JButton btn;
    JLabel label;
    int location=1;

    public void showFrame(){
        System.out.println(this);
        super.setPreferredSize(new Dimension(520, 600));
        super.setResizable(false);
        super.setVisible(true);
        super.setTitle("Snake and Ladders!....");
        ImageIcon imageIcon = new ImageIcon("src\\board.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(500, 500,  0); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);
        label = new JLabel(imageIcon);
        label.setBounds(0,0,500,500);
        super.add(label);
        btn = new JButton();
        btn.setBounds(210,510,75,25);
        super.add(btn);
        btn.addActionListener((ActionListener) this);

        super.setLayout(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();

    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        int col=location;
        int row=location;
        int x;
        int y;
        //----------------------------------------------------------------//
        /*
         * Location of the board==
         * 100  99 98............
         * ......
         * 20 19 18......13 12 11
         * 1  2  3  .....8  9  10
         *
         * ex
         *
         * */
        row = row -1;
        row = row /10;
        row = 9-row;   //flipping the row

        col = (col-1)%10;
        if(row%2==0){
            col=9-col;//flipping column
        }
        x=col*50+25;
        y=row*50+35;
        //----------------------------------------------------------------//
        g.fillOval(x,y,30,30);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(btn))//start
        {

            //int x= (int) Math.floor(Math.random() * (7 - 1) + 1);
            Random r =new Random();
            int x = r.nextInt(6)+1;
            Movements m =new Movements(this);
            m.movements(x);
            btn.setText(String.valueOf(x));
        }

    }
}
