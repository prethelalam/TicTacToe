import javax.swing.*;
import java.awt.*;
import javax.swing.JButton; //from here down we imported all of our classes
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class TicTacGUI extends JFrame {
    private Container pane; //this is going to hold the content pane
    private String currentPlayer; //this will keep track of whose turn it is
    private JButton[][] board; //this 2d array will be the board
    private boolean hasWinner; //use this field to see if there is a winner. its like a flagging the winner
    private JMenuBar menuBar; //this is for the menu bar
    private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;

    public TicTacGUI(){} //this is going to be our constructor. this is a method that will be used to initialize objects
    private void initializeMenuBar(){} //this will obviously initialize the menu bar
    private void resetBoard(){}//this will reset the board when the user clicks new game
    private void initializeBoard(){}
    private void togglePlayer(){} //this is our change move method
    private void hasWinner(){} //this is going to check to see if there is a winner
    }


