import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.add(panel);
    }


    //        super(); //this calls the parent class, which is the jframe constructor
//        pane = getContentPane(); //don't have to use this. because that is for the user. so you just have to put getcontentpane since jframe has that
//        pane.setLayout(new GridLayout(3, 3));
//        setTitle("TicTacToe"); //this is the title of the game obviously
//        setSize(500, 500); //this is the size of the panel
//        setResizable(false); //this does not let the user to re-size the game
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        setVisible(true); //this will allow the user to see the GUI
//        currentPlayer = "x";
//        board = new JButton[3][3];
//        hasWinner = false; //so the game just started and there is not any winner yet
//        initializeBoard();
//        initializeMenuBar();
}
