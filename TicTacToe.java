import java.util.Scanner; 
import java.util.Arrays;

public class TicTacToe{
// build an array to hold numbers and assign a pointer to where someone can place an x or an o

//set up a gui in order to make the game run like a typical tic tac toe game

static void Array(){
Integer[] newarr = {1,2,3,4,5,6,7,8,9}; //put 9 different sections in here

System.out.println(newarr[0] + " " + newarr[1] + " " + newarr[2]); 
System.out.println(newarr[3] + " " + newarr[4] + " " + newarr[5]);
System.out.println(newarr[6] + " " + newarr[7] + " " + newarr[8]);

System.out.println(newarr);

System.out.println("Player 1, select which number you would place your move: ");

Scanner scan1 = new Scanner(System.in);
int Player1Input = scan1.nextInt();

System.out.println("Player 2, select which number you would like to place your move: ");

Scanner scan2 = new Scanner(System.in);
int Player2Input = scan1.nextInt();

if (Player1Input == 0){
    System.out.println(newarr[0] + " " + newarr[1] + " " + newarr[2]); 
    System.out.println(newarr[3] + " " + newarr[4] + " " + newarr[5]);
    System.out.println(newarr[6] + " " + newarr[7] + " " + newarr[8]);
}

System.out.println(newarr);
}

static void Board(){ //create a 3x3 board, first step
    char[][] board = new char[3][3]; 

    for (int i = 0; i <= board.length; i++){
        System.out.println(board[]); 
    }
}

public static void main(String[] args){
//Array();
Board();
}
}