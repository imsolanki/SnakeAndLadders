import javax.swing.*;

public class Movements{

    SnakeAndLadders sn;

    public Movements(SnakeAndLadders snake){
        this.sn =snake;
    }

    public void movements(int move){

        System.out.println(this);
        //this is always = to the function on which that object is called

        int saveMove =move;
        this.sn.location =this.sn.location+move;

        this.sn.repaint();

        if(this.sn.location==3){
            this.sn.location=21;

        }
        else if(this.sn.location==8){
            this.sn.location=30;

        }
        else if(this.sn.location==17){
            this.sn.location=13;

        }
        else if(this.sn.location==28){
            this.sn.location=84;

        }
        else if(this.sn.location ==52){
            this.sn.location=29;

        }
        else if(this.sn.location==57){
            this.sn.location=40;

        }
        else if(this.sn.location==58){
            this.sn.location=77;

        }
        else if(this.sn.location==62){
            this.sn.location=22;

        }
        else if(this.sn.location==75) {
            this.sn.location = 86;

        }
        else if(this.sn.location==80){

            this.sn.location=100;
            JOptionPane.showMessageDialog(this.sn,"Hurray!!! Winnerrrr.....");
            this.sn.setVisible(true);
            System.exit(0);
        }else if(this.sn.location==88) {
            this.sn.location = 18;
        }
        else if(this.sn.location==90) {
            this.sn.location = 91;

        }else if(this.sn.location==95) {
            this.sn.location = 51;

        }else if(this.sn.location==97) {
            this.sn.location = 79;
        }
        else if(this.sn.location==100) {
            this.sn.repaint();
            JOptionPane.showMessageDialog(this.sn,"Hurray!!! Winnerrrr.....");

            System.exit(0);
        }
        else if(this.sn.location>100){
            this.sn.location = this.sn.location-saveMove;

        }
        this.sn.repaint();

    }
}
