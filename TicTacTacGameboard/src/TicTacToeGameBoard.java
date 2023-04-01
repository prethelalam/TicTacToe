import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout; //this is apart of the swing class

public class TicTacToeGameBoard extends JFrame{
    JPanel p = new JPanel(); //this is going to contain all the button for the gameboard
    XOButton buttons[] = new XOButton[9]; //this is going to store all of our buttons. so this at the moment doesn't have anything inside, its like an empty slot
    public static void main(String[] args) {
        new TicTacToeGameBoard();
    }

    public TicTacToeGameBoard(){
        super("TicTacToe"); //this is the construction method of jframe i think
        setSize(400,400); //this is the size of the board
        setResizable(false); //dont want to resize or we would get weird rectangles
        setDefaultCloseOperation(EXIT_ON_CLOSE); //this closes the window and program when it is done running
        p.setLayout(new GridLayout(3,3)); //this is a grid layout that is applied to the program. this is set to the panel. so anything added to the panel will be lined according to the layout
        //so if a layout isn't set then the default layout is a flow layout where it starts at top left and goes through each until then the next row and so on

        // now we're going to add the buttons
        for(int i = 0; i < 9; i++){
            buttons[i] = new XOButton(); //set it to take nothing. we have to set this up to change images when we click on it
            p.add(buttons[i]);//adding button to the panel
        }
        add(p); //adding panel to the grid?

        setVisible(true);
    }
}