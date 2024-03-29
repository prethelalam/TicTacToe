import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

    private JFrame frame;
    private JTextField xCount;
    private JTextField oCount;
    private int xCount1=0; //so the game plan is when the user presses a button then we need to gameboard to reflect their move, which is why we create this variable and the ones below
    private int oCount1=0;
    private String startGame = "X"; //created this to make the first user to be X. so the game will start with the first user being X
    private int b1 = 10; //I have to declare these variables below, I have to assign a value greater than 9
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int i = 0; //we need this because after a user places an X or O, we have to increment it by 1

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToe window = new TicTacToe();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TicTacToe() {
        initialize();
    }

    private void winningGame(){ //here we set up all of the possible winning options for X
        //for player x to win

        //this is winning top row horizonal
        if (b1 == 1 && b2 == 1 && b3 == 1){ //the logic is, when the all of these buttons are assigned X then X wins. the same logic is applied to all of the winning options and other buttons
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE); //when someone wins you have to notify the user, so we have to have JOPtionPane show a message. the first argument is the fram, the 2nd argument is the text, and 3rd argument is the title of the game. we need one more argument that we need to pass. so we do joptionpane.informationmessage.
            xCount1++; //we add this because when someone wins we need to add 1 increment to their score
            xCount.setText(String.valueOf(xCount1)); //this will display the xCount (number of wins) and update it in the scoreboard
        } //the same logic used for this if statement applies to the rest of the winning options for X and O
        else if (b4 == 1 && b5 == 1 && b6 == 1){ //this is winning middle row horizonal
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b7 == 1 && b8 == 1 && b9 == 1){ //this is winning bottom row horizonal
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b1 == 1 && b4 == 1 && b7 == 1){ //this is winning left column down
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b2 == 1 && b5 == 1 && b8 == 1){ //this is winning middle column down
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b3 == 1 && b6 == 1 && b9 == 1){ //this is winning right column down
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b1 == 1 && b5 == 1 && b9 == 1){ //this is winning left to right diagonal
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b3 == 1 && b5 == 1 && b7 == 1){ //this is winning right to left diagonal
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }

        //For player O to win

        //this is winning top row horizonal
        if (b1 == 0 && b2 == 0 && b3 == 0){ //the logic is, when the all of these buttons are assigned O then O wins. the same logic is applied to all of the winning options and other buttons
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b4 == 0 && b5 == 0 && b6 == 0){ //this is winning middle row horizonal
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b7 == 0 && b8 == 0 && b9 == 0){ //this is winning bottom row horizonal
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b1 == 0 && b4 == 0 && b7 == 0){ //this is winning left column down
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b2 == 0 && b5 == 0 && b8 == 0){ //this is winning middle column down
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b3 == 0 && b6 == 0 && b9 == 0){ //this is winning right column down
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b1 == 0 && b5 == 0 && b9 == 0){ //this is winning left to right diagonal
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b3 == 0 && b5 == 0 && b7 == 0){ //this is winning right to left diagonal
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
    }

    private void choosePlayer(){ //we set this method to ensure that the first user that goes is X. This also allows the X to also not always be player 1 but for it to alternate each game with player 2 on who is going first
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else {
            startGame="X";
        }
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame(); //created a JFrame and made a border layout
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0)); //this is the Content Pane or the initial pane that was set

        JPanel panel = new JPanel(); //Created a JPanel
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        frame.getContentPane().add(panel, BorderLayout.CENTER); //here we are adding the frame to the content pane and we made the panel in the center
        panel.setLayout(new GridLayout(3, 5, 2, 2)); //here we created a grid layout for the gameboard

        JPanel panel_1 = new JPanel(); //in order to have a button, we had to create a panel to put the button in
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        JButton btn1 = new JButton(""); //this button is in the first panel
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn1.setText(startGame); //here is the panel is clicked then the first player will be X and an X will appear
                if (startGame.equalsIgnoreCase("X")){
                    btn1.setForeground(Color.RED); //here we made the color red for the button
                    b1 = 1; //we do this so it is easier to set up the winning options. so if button 1 is clicked, that is X and it basically holds a 1
                    i++; //here we are incrementing the number of times X is placed by 1. the same logic is applied for all the buttons
                }
                else {
                    btn1.setForeground(Color.blue); //here we are assinging player 2 (O) to be blue
                    b1 = 0; //the same logic is followed for the O winning options. But this time, O holds a 0
                    i++; //here we are incrementing the number of times O is placed by 1. the same logic is applied for all the buttons
                }
                choosePlayer(); //this is important because we need this because this will select if we need to set text O or X. so everytime a user presses a button we call this function to see which image (X or O) will be placed
                winningGame(); //we call this function to see is anyone wins after placing a move
            } //the logic for this button is the same logic used for the rest of the buttons
        });
        btn1.setFont(new Font("Lucida Grande", Font.BOLD, 40)); //here we are jsut adding a font to the text
        panel_1.add(btn1, BorderLayout.CENTER); //here we are adding the button to the panel and setting the layout 

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        JButton btn2 = new JButton("");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn2.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn2.setForeground(Color.RED);
                    b2 = 1;
                    i++;
                }
                else {
                    btn2.setForeground(Color.blue);
                    b2 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn2.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_2.add(btn2, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        JButton btn3 = new JButton("");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn3.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn3.setForeground(Color.RED);
                    b3 = 1;
                    i++;
                }
                else {
                    btn3.setForeground(Color.blue);
                    b3 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_3.add(btn3, BorderLayout.CENTER);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_4);
        panel_4.setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel("Player X");
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 19));
        panel_4.add(lblNewLabel, BorderLayout.CENTER);

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_5);
        panel_5.setLayout(new BorderLayout(0, 0));

        xCount = new JTextField();
        xCount.setBackground(Color.WHITE);
        xCount.setFont(new Font("Lucida Grande", Font.BOLD, 25));
        xCount.setHorizontalAlignment(SwingConstants.CENTER);
        xCount.setText("0");
        panel_5.add(xCount, BorderLayout.CENTER);
        xCount.setColumns(10);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));

        JButton btn4 = new JButton("");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn4.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn4.setForeground(Color.RED);
                    b4 = 1;
                    i++;
                }
                else {
                    btn4.setForeground(Color.blue);
                    b4 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn4.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_6.add(btn4, BorderLayout.CENTER);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));

        JButton btn5 = new JButton("");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn5.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn5.setForeground(Color.RED);
                    b5 = 1;
                    i++;
                }
                else {
                    btn5.setForeground(Color.blue);
                    b5 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn5.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_7.add(btn5, BorderLayout.CENTER);

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));

        JButton btn6 = new JButton("");
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn6.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn6.setForeground(Color.RED);
                    b6 = 1;
                    i++;
                }
                else {
                    btn6.setForeground(Color.blue);
                    b6 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn6.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_8.add(btn6, BorderLayout.CENTER);

        JPanel panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_9);
        panel_9.setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel_1 = new JLabel("Player O");
        lblNewLabel_1.setBackground(Color.BLACK);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 19));
        panel_9.add(lblNewLabel_1, BorderLayout.CENTER);

        JPanel panel_10 = new JPanel();
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_10);
        panel_10.setLayout(new BorderLayout(0, 0));

        oCount = new JTextField();
        oCount.setBackground(Color.WHITE);
        oCount.setFont(new Font("Lucida Grande", Font.BOLD, 25));
        oCount.setHorizontalAlignment(SwingConstants.CENTER);
        oCount.setText("0");
        panel_10.add(oCount, BorderLayout.CENTER);
        oCount.setColumns(10);

        JPanel panel_11 = new JPanel();
        panel.add(panel_11);
        panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_11.setLayout(new BorderLayout(0, 0));

        JButton btn7 = new JButton("");
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn7.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn7.setForeground(Color.RED);
                    b7 = 1;
                    i++;
                }
                else {
                    btn7.setForeground(Color.blue);
                    b7 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn7.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_11.add(btn7, BorderLayout.CENTER);

        JPanel panel_12 = new JPanel();
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));

        JButton btn8 = new JButton("");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn8.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn8.setForeground(Color.RED);
                    b8 = 1;
                    i++;
                }
                else {
                    btn8.setForeground(Color.blue);
                    b8 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn8.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_12.add(btn8, BorderLayout.CENTER);

        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));

        JButton btn9 = new JButton("");
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn9.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn9.setForeground(Color.RED);
                    b9 = 1;
                    i++;
                }
                else {
                    btn9.setForeground(Color.blue);
                    b9 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn9.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_13.add(btn9, BorderLayout.CENTER);

        JPanel panel_14 = new JPanel(); //this panel holds the reset button
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_14);
        panel_14.setLayout(new BorderLayout(0, 0));

        JButton btnReset = new JButton("RESET");
        btnReset.addActionListener(new ActionListener() { //so here we are making the reset button do something. you have to take the naem of the button and add an actionlistener so that the button know to do something once clicked, think of this as a notification.
            public void actionPerformed(ActionEvent e) { //next we set up a actionPerformed and actionEvent. once the system gets notified that a button is clicked then this allow the program to run what you set up/programmed in said button
                btn1.setText(null); //this will make each button in the gameboard blank, which is why we set the text to null
                btn2.setText(null);
                btn3.setText(null);
                btn4.setText(null);
                btn5.setText(null);
                btn6.setText(null);
                btn7.setText(null);
                btn8.setText(null);
                btn9.setText(null);
                b1 = 10; //when we press we the reset button, we have to reset the values for the variables. this is why I am assigning 10 again to all the variables
                b2 = 10;
                b3 = 10;
                b4 = 10;
                b5 = 10;
                b6 = 10;
                b7 = 10;
                b8 = 10;
                b9 = 10;
                i = 0; //we have to reset all the times the values are placed to 0
            }
        });
        btnReset.setBackground(Color.BLACK);
        btnReset.setFont(new Font("Lucida Grande", Font.BOLD, 19));
        panel_14.add(btnReset, BorderLayout.CENTER);
    }
}