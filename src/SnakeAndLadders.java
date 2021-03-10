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
        btn.addActionListener(this);

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
        int saveMove =move;
        location =location+move;

        this.repaint();

        if(location==3){
            location=21;
            //this.repaint();
        }
        else if(location==8){
            location=30;
            //this.repaint();
        }
        else if(location==17){
            location=13;
            //this.repaint();
        }
        else if(location==28){
            location=84;
            //this.repaint();
        }
        else if(location ==52){
            location=29;
            //this.repaint();
        }
        else if(location==57){
            location=40;
            //this.repaint();
        }
        else if(location==58){
            location=77;
           // this.repaint();
        }
        else if(location==62){
            location=22;
           //this.repaint();
        }
        else if(location==75) {
            location = 86;
            this.repaint();
        }
        else if(location==80){
            location=100;
           // this.repaint();
            JOptionPane.showMessageDialog(this,"Hurray!!! Winnerrrr.....");
            //FileDialog fd =new FileDialog(this,"Hurray!!! Winnerrrr.....");
            this.setVisible(true);
            System.exit(0);
        }else if(location==88) {
            location = 18;
            //this.repaint();
        }
        else if(location==90) {
            location = 91;
            //this.repaint();
        }else if(location==95) {
            location = 51;
            //this.repaint();
        }else if(location==97) {
            location = 79;
            //this.repaint();
        }
        else if(location==100) {
            this.repaint();
            JOptionPane.showMessageDialog(this,"Hurray!!! Winnerrrr.....");
            //FileDialog fd =new FileDialog(this,"Hurray!!! Winnerrrr.....");
            //this.setVisible(true);
            System.exit(0);
        }
        else if(location>100){
            location = location-saveMove;
            //this.repaint();
        }
        this.repaint();

    }




}
