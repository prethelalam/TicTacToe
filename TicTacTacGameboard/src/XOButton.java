import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener; //so we are adding this because we want a sound to occur when we press a button
import java.awt.event.ActionEvent;
public class XOButton extends JButton implements ActionListener{ //we just need the grid to have an image and when its clicked on then it scrolls through the options. we put the actionlistener because we need to implement that
    ImageIcon X,O; //this creates an icon that will keep track of the dimension of an image and hold it there. so you dont have to call it several times
    //now we need to variable to represent what image we are on (nothing, X, or O)
    byte value = 0;
    /*
    0: nothing
    1: X
    2: O
    */
    public XOButton(){
        //now we're gonna give the X and O values
        X = new ImageIcon(this.getClass().getResource("x.png")); //so the getClass is grabbing the folder, and get resources grabs the stuff inside the folder
        O = new ImageIcon(this.getClass().getResource("o.png"));
        this.addActionListener(this); //we are listening on it hence this at the end. at the one at the beginning is us triggering it
    }

    public void actionPerformed(ActionEvent e){ //we need to have this which is a method for action listener. one parameter which is action event which is what happened
        value++;
        value%= 3; //this is saying if it is more than or equal to 3 then it will go to zero?
        switch(value){
            case 0:
            case 1:
            case 2:
        }
    }
}
