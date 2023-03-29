import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeInterface {
    private JButton buttonMSG;
    private JPanel panelMain;
public TicTacToeInterface() {
    buttonMSG.addActionListener(new ActionListener() { //this overrides actionPerformed function
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hello World"); //so JOptionPane is how to display a message.
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToeInterface"); //we are creating a JFrame and then we are naming our app. here we are defining the JFrame
        frame.setContentPane(new TicTacToeInterface().panelMain); //here we are calling the panelMain from the class. we are calling the panel here
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
