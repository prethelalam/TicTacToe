import java.util.Scanner; 
import java.util.Arrays;

public class TicTacToe{
// build an array to hold numbers and assign a pointer to where someone can place an x or an o

//set up a gui in order to make the game run like a typical tic tac toe game

static void Board(){ 
    System.out.println("Welcome to tic tac toe. Player 1 will be X and player 2 will be O. Good luck!");
    System.out.println();

    char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '}};

    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
        for (char c: row){ //this loops each character in the current row
            System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();

    for (int i = 0; i < 4; i++){ // i feel like I have to change the condition for the for loop. 3 is not enough but 4 is too much??
        //Player 1 input and switch statements
        System.out.println("Player 1, where would you like your X to be placed (1-9):");

        Scanner scan1 = new Scanner(System.in);
        int input = scan1.nextInt();
        System.out.println();

        switch (input){ //need to have this put x or o depending on if player 1 or 2 selects this spot
            case 1: gameBoard[0][0] = 'X'; //top left
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row. this is an enhanced loop
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
                
        }
        System.out.println();
        break;

            case 2: gameBoard[0][2] = 'X'; //top middle
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 3: gameBoard[0][4] = 'X'; //top right
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 4: gameBoard[2][0] = 'X'; //middle left
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 5: gameBoard[2][2] = 'X'; //middle middle
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 6: gameBoard[2][4] = 'X'; //middle right
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 7: gameBoard[4][0] = 'X'; //bottom left
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 8: gameBoard[4][2] = 'X'; //bottom middle
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 9: gameBoard[4][4] = 'X'; //bottom right
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;
    }
        //set up conditions to win, lose, and tie. maybe also create and infinite loop(while loop) to play the game again once it ends
        //X winning: 

        if (gameBoard[0][0] == 'X'){ //this is winning top row across
            if (gameBoard[0][2] == 'X'){
                if (gameBoard[0][4] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[2][0] == 'X'){ //this is winning middle row across
            if (gameBoard[2][2] == 'X'){
                if (gameBoard[2][4] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[4][0] == 'X'){ //this is winning bottom row across
            if (gameBoard[4][2] == 'X'){
                if (gameBoard[4][4] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[0][0] == 'X'){ //this is winning top column down
            if (gameBoard[2][0] == 'X'){
                if (gameBoard[4][0] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[0][2] == 'X'){ //this is winning middle column down
            if (gameBoard[2][2] == 'X'){
                if (gameBoard[4][2] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[0][4] == 'X'){ //this is winning bottom column down
            if (gameBoard[2][4] == 'X'){
                if (gameBoard[4][4] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[0][0] == 'X'){ //diagnoal starting from top left to bottom right
            if (gameBoard[2][2] == 'X'){
                if (gameBoard[4][4] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[0][4] == 'X'){ //diagnoal starting from top right to bottom left
            if (gameBoard[2][2] == 'X'){
                if (gameBoard[4][0] == 'X'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }


    //Player 2 input and switch statements
        System.out.println("Player 2, where would you like your X to be placed: top left = 00, top middle = 02, top right = 04, middle left = 20, middle middle = 22, middle right 24, bottom left = 40, bottom middle = 42, and bottom right = 44.");
        int input2 = scan1.nextInt();
        System.out.println();

        switch(input2){ //this workish, overrides and prints 2 seperate game boards 
            case 1: gameBoard[0][0] = 'O'; //top left
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 2: gameBoard[0][2] = 'O'; //top middle
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 3: gameBoard[0][4] = 'O'; //top right
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 4: gameBoard[2][0] = 'O'; //middle left
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 5: gameBoard[2][2] = 'O'; //middle middle
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 6: gameBoard[2][4] = 'O'; //middle right
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 7: gameBoard[4][0] = 'O'; //bottom left
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 8: gameBoard[4][2] = 'O'; //bottom middle
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;

            case 9: gameBoard[4][4] = 'O'; //bottom right
                for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                for (char c: row){ //this loops each character in the current row
                System.out.print(c);
                }
                System.out.println();
        }
        System.out.println();
        break;
    }

    //O winning: set it up the same as X winning
        if (gameBoard[0][0] == 'O'){ //this is winning top row across
            if (gameBoard[0][2] == 'O'){
                if (gameBoard[0][4] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }      
            }
            }
        if (gameBoard[2][0] == 'O'){ //this is winning middle row across
            if (gameBoard[2][2] == 'O'){
                if (gameBoard[2][4] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }
            }
            }
        if (gameBoard[4][0] == 'O'){ //this is winning bottom row across
            if (gameBoard[4][2] == 'O'){
                if (gameBoard[4][4] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }
            }
            }
        if (gameBoard[0][0] == 'O'){ //this is winning top column down
            if (gameBoard[2][0] == 'O'){
                if (gameBoard[4][0] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }
            }
            }
        if (gameBoard[0][2] == 'O'){ //this is winning middle column down
            if (gameBoard[2][2] == 'O'){
                if (gameBoard[4][2] == 'O'){
                    System.out.println("Congrats player 1, you have won!");
                    System.out.println("Good try player 2!");
                    break; 
                }
            }
            }
        if (gameBoard[0][4] == 'O'){ //this is winning bottom column down
            if (gameBoard[2][4] == 'O'){
                if (gameBoard[4][4] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }
            }
            }
        if (gameBoard[0][0] == 'O'){ //diagnoal starting from top left to bottom right
            if (gameBoard[2][2] == 'O'){
                if (gameBoard[4][4] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }
            }
            }
        if (gameBoard[0][4] == 'O'){ //diagnoal starting from top right to bottom left
            if (gameBoard[2][2] == 'O'){
                if (gameBoard[4][0] == 'O'){
                    System.out.println("Congrats player 2, you have won!");
                    System.out.println("Good try player 1!");
                    break; 
                }
            }
            }
        }
        System.out.println("You have tied");
            //maybe create rows and columns variable and set indexes equal too it, then use the row to have it tie
}



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



public static void main(String[] args){
Board();
}
}