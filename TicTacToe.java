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

static void Board(){ 
    System.out.println("Welcome to tic tac toe. Player 1 will be X and player 2 will be O. Good luck!");
    System.out.println();

    char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '}};
    //im trying to understand why this is a array though. I think because each section might have a specfic index... not sure

        for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
            for (char c: row){ //this loops each character in the current row
                System.out.print(c);
            }
            System.out.println();
        }
    // now I have to figure out how to like place a certain x or o in the correct part of the board
    

    // while (counter <= 5) /*|| need another condition for winner*/{
    // System.out.print("Player 1, where would you like your X to be placed: top left = 00, top middle = 01, top riddle = 02, middle left = 10, etc.. ");

    // Scanner scan1 = new Scanner(System.in);
    // int input = scan1.nextInt();

    // //this is where you update the gameboard

    // System.out.print("Player 2, where would you like your X to be placed: top left, top middle, top riddle, etc.. ");
    // input = scan1.nextInt();

    // counter++;
    // }
    int counter = 0;

    for (int i = 0; counter <= 4; i++){

        System.out.print("Player 1, where would you like your X to be placed: top left = 00, top middle = 01, top riddle = 02, middle left = 10, etc.. ");

        Scanner scan1 = new Scanner(System.in);
        int input = scan1.nextInt();

        System.out.print("Player 2, where would you like your X to be placed: top left, top middle, top riddle, etc.. ");
        int input2 = scan1.nextInt();

        switch (input){ //need to have this put x or o depending on if player 1 or 2 selects this spot
            case 00: gameBoard[0][0] = 'X';
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                    System.out.print(c);
                }
                System.out.println();
        }
    }
        switch(input2){ //this worked!!!!!
            case 00: gameBoard[0][0] = 'O';
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                    System.out.print(c);
                }
                System.out.println();
        }
            
        }
        
    
    counter++;
}
}


// static void turns(){
//     int counter = 0;

//     while (counter <= 5) /*|| need another condition for winner*/{
//     System.out.print("Player 1, where would you like your X to be placed: top left = 00, top middle = 01, top riddle = 02, middle left = 10, etc.. ");

//     Scanner scan1 = new Scanner(System.in);
//     int input = scan1.nextInt();

//     //this is where you update the gameboard

//     System.out.print("Player 2, where would you like your X to be placed: top left, top middle, top riddle, etc.. ");

//     input = scan1.nextInt();

//     counter++;
//     }
//     }
    

// static void Options(char [][] gameBoard){
// int counter = 0;
//     for (int i = 0; counter <= 5; i++){
//         switch (counter){
//             case 00: gameBoard[0][0] = "X";
            
//         }
//         counter++;
//     }
// }

    //this is where you update the gameboard

    //MAYBE MAKE A WHILE LOOP FOR taking turns? and we can set the condition until someone wins or loses or ties

//1. figure out where each index is, and be able to assign an X or O to that index in the gameboard array
//2. print that X or O to in the gameboard array
//3. Set up invalid games, such as O and X can't both win
//4. need to set up options for winning, losing, and tying
//5. create a interface for it (GUI)

//steps for gameboard:
/* 1. player 1 does a move
    2. gameboard reflects said move
    3. updated gameboard is shown to player 2
    4. player to selects a move
    5. updated gameboard is shown to player 1
    6. repeat
    */

//Questions:
        /*
        - how to use a switch with a 2d array  
	    - how to know where an index is in a 2d array 
	    - how to update a 2d array with new elements, hard code? literally manually do it your self (lots of hard coding tho)… check it out anyways 
	    - while loop with a counter till it reaches 9 or someone wins */


    // String row, column;
    // switch (input & input2){
    //     if (input | input2 == gameBoard[0][1]){
    //         case 1: gameBoard[0][1] = "X";
    //         System.out.println(gameBoard[0][1]);
    //     }
        
    // }







public static void main(String[] args){
//Array();
Board();
// System.out.println();
//turns();


int newarr[][] = {{1,2,3}, {4,5,6}};

System.out.print(newarr[0][1]); //prints 2
}
}