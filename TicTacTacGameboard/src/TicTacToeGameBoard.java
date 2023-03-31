import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class TicTacToeGameBoard extends JFrame{
    JPanel p = new JPanel(); //this is going to contain all the button for the gameboard
    XOButton buttons[] = new XOButton[9]; //this is going to store all of our buttons
    public static void main(String[] args) {
        new TicTacToeGameBoard();
    }

    public TicTacToeGameBoard(){
        super("TicTacToe");
        setSize(400,400);
    }
}