import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
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

public class TicTacToeLearning {

    private JFrame frame;
    private JTextField xCount;
    private JTextField oCount;
    private int xCount1=0;
    private int oCount1=0;
    private String startGame = "X";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToeLearning window = new TicTacToeLearning();
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
    public TicTacToeLearning() {
        initialize();
    }

    private void choosePlayer(){
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
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 5, 2, 2));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        JButton btn1 = new JButton("");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btn1.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn1.setForeground(Color.RED);
                }
                else {
                    btn1.setForeground(Color.blue);
                }
                choosePlayer();
            }
        });
        btn1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        panel_1.add(btn1, BorderLayout.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        JButton btn2 = new JButton("");
        btn2.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.BLACK);
        panel_2.add(btn2, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        JButton btn3 = new JButton("");
        btn3.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.BLACK);
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
        btn4.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn4.setForeground(Color.BLACK);
        btn4.setBackground(Color.BLACK);
        panel_6.add(btn4, BorderLayout.CENTER);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));

        JButton btn5 = new JButton("");
        btn5.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn5.setForeground(Color.BLACK);
        btn5.setBackground(Color.BLACK);
        panel_7.add(btn5, BorderLayout.CENTER);

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));

        JButton btn6 = new JButton("");
        btn6.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn6.setForeground(Color.BLACK);
        btn6.setBackground(Color.BLACK);
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
        btn7.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn7.setForeground(Color.BLACK);
        btn7.setBackground(Color.BLACK);
        panel_11.add(btn7, BorderLayout.CENTER);

        JPanel panel_12 = new JPanel();
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));

        JButton btn8 = new JButton("");
        btn8.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn8.setForeground(Color.BLACK);
        btn8.setBackground(Color.BLACK);
        panel_12.add(btn8, BorderLayout.CENTER);

        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));

        JButton btn9 = new JButton("");
        btn9.setFont(new Font("Lucida Grande", Font.BOLD, 40));
        btn9.setForeground(Color.BLACK);
        btn9.setBackground(Color.BLACK);
        panel_13.add(btn9, BorderLayout.CENTER);

        JPanel panel_14 = new JPanel();
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_14);
        panel_14.setLayout(new BorderLayout(0, 0));

        JButton btnReset = new JButton("RESET");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn1.setText(null);
                btn2.setText(null);
                btn3.setText(null);
                btn4.setText(null);
                btn5.setText(null);
                btn6.setText(null);
                btn7.setText(null);
                btn8.setText(null);
                btn9.setText(null);
            }
        });
        btnReset.setBackground(Color.BLACK);
        btnReset.setFont(new Font("Lucida Grande", Font.BOLD, 19));
        panel_14.add(btnReset, BorderLayout.CENTER);

        JPanel panel_15 = new JPanel();
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.add(panel_15);
        panel_15.setLayout(new BorderLayout(0, 0));

        JButton bbtnExit = new JButton("EXIT");
        bbtnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame, "Confirm you want to exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
                {
                    System.exit(0);
                }

            }
        });
        bbtnExit.setFont(new Font("Lucida Grande", Font.BOLD, 19));
        bbtnExit.setBackground(Color.BLACK);
        panel_15.add(bbtnExit, BorderLayout.CENTER);
    }

}