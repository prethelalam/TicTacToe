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

    public TicTacGUI(){ //this is going to be our constructor. this is a method that will be used to initialize objects
        super(); //this calls the parent class, which is the jframe constructor
        pane = getContentPane(); //don't have to use this. because that is for the user. so you just have to put getcontentpane since jframe has that
        pane.setLayout(new GridLayout(3,3));
        setTitle("TicTacToe"); //this is the title of the game obviously
        setSize(500,500); //this is the size of the panel
        setResizable(false); //this does not let the user to re-size the game
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true); //this will allow the user to see the GUI
        currentPlayer = "x";
        board = new JButton[3][3];
        hasWinner = false; //so the game just started and there is not any winner

    }
    private void initializeMenuBar(){} //this will obviously initialize the menu bar
    private void resetBoard(){}//this will reset the board when the user clicks new game
    private void initializeBoard(){}
    private void togglePlayer(){} //this is our change move method
    private void hasWinner(){} //this is going to check to see if there is a winner
    }


