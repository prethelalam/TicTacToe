import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public TicTacGUI() { //this is going to be our constructor. this is a method that will be used to initialize objects
        super(); //this calls the parent class, which is the jframe constructor
        pane = getContentPane(); //don't have to use this. because that is for the user. so you just have to put getcontentpane since jframe has that
        pane.setLayout(new GridLayout(3, 3));
        setTitle("TicTacToe"); //this is the title of the game obviously
        setSize(500, 500); //this is the size of the panel
        setResizable(false); //this does not let the user to re-size the game
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true); //this will allow the user to see the GUI
        currentPlayer = "x";
        board = new JButton[3][3];
        hasWinner = false; //so the game just started and there is not any winner yet
        initializeBoard();
        initializeMenuBar();
    }
            private void initializeMenuBar() { //this will obviously initialize the menu bar
                menuBar = new JMenuBar();
                menu = new JMenu("File"); //we name this file because most ide's/codes have a file tab? look up
                //going to make 2 new jmenu items (listed below)
                newGame = new JMenuItem("New Game"); //want this to do something so we're going to set it up below
                newGame.addActionListener(new ActionListener() { //we want New Game to reset the board

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        resetBoard();
                    }
                });
                quit = new JMenuItem("Quit"); //want this to do something so we're going to set it up below
                quit.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0); //system.exit is going to terminate the program
                    }
                });
                menu.add(newGame);
                menu.add(quit);
                menuBar.add(menu);
                setJMenuBar(menuBar);
            }

            private void resetBoard() {//this will reset the board when the user clicks new game. All we're doing here is resetting the fields (x is first player)
                currentPlayer = "x";
                hasWinner = false;
                //now we have to reset the JButton because it holds the x's and o's that are displayed to the user
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        board[i][j].setText(""); //so we are going through each JButton and setting the text into an empty string because by default if you don't give a name for the Jbutton, java gives it a name
                    }
                }
            }

            private void initializeBoard() {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        JButton btn = new JButton(""); //by default this doesn't habe a name
                        btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
                        board[i][j] = btn;
                        btn.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {  //this returns who clicked this button (returns itself). we're casting it into a jbutton. testing to see if it is an empty string to see if it is a valid move
                                if (((JButton) e.getSource()).getText().equals("") && hasWinner == false) {
                                    btn.setText(currentPlayer);
                                    hasWinner(); //here intially haswinner is set to false. this is checking to if we have a winner and if it is true then the statement above doesn't execute
                                    togglePlayer(); //this switches the players based on who went before
                                }
                            }
                        });
                        pane.add(btn);
                    }
                }
            }
            private void togglePlayer() { //this is our change move method
                if (currentPlayer.equals("x")) {
                    currentPlayer = "o";
                }
                else {
                    currentPlayer = "x";
                }
            }

            private void hasWinner(){ //this is going to check to see if there is a winner
                //this will get the board (its a type jbutton, jbutton has a method called getText, which we will compare to see if it is equal to the current player.
                if (board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning left column down
                    hasWinner = true;
                }
                else if (board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning middle column down
                    hasWinner = true;
                }
                else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning right column down
                    hasWinner = true;
                }
                else if (board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning top row across
                    hasWinner = true;
                }
                else if (board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning middle row across
                    hasWinner = true;
                }
                else if (board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning bottom row across
                    hasWinner = true;
                }
                else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning right column down
                    hasWinner = true;
                }
                else if (board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning diagonal left to right
                    hasWinner = true;
                }
                else if (board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won"); //winning diagonal right to left
                    hasWinner = true;
                }

            }
        }


//currently on part 5