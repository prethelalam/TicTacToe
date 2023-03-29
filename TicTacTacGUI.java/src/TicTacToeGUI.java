import java.util.Scanner;
import java.util.Arrays;

public class TicTacToeGUI {
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



        // maybe do if lines 20 - 21 have a letter, then you have to choose another space.. go witht his idea for now

        for (int i = 0; i <= 4; i++){ // i feel like I have to change the condition for the for loop. 3 is not enough but 4 is too much??
            //Player 1 input and switch statements
            System.out.println("Player 1, where would you like your X to be placed (1-9):");

            Scanner scan1 = new Scanner(System.in);
            int Player1Input = scan1.nextInt();
            System.out.println();

            switch (Player1Input){ //need to have this put x or o depending on if player 1 or 2 selects this spot
                case 1:
                    //EDIT THIS, this WORKs

                    gameBoard[0][0] = 'X'; //top left
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row. this is an enhanced loop
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();


                    // else {
                    //     System.out.println("try agoooin");
                    // }
                    break;



// trying out something else for tying
                //     if (gameBoard[0][0] = 'X'){
                //         System.out.println("Try again matey");
                //     }
                //     else if (gameBoard[0][0] = 'O'){
                //         System.out.println("try again matrey pt 2.");
                //     }
                //     else{
                //         gameBoard[0][0] = 'X'; //top left
                //                 for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row. this is an enhanced loop
                //                 for (char c: row){ //this loops each character in the current row
                //                 System.out.print(c);
                //                 }
                //                 System.out.println();
                //     }
                //     System.out.println();
                // }
                // break;


                case 2:
                    gameBoard[0][2] = 'X'; //top middle
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    gameBoard[0][4] = 'X'; //top right
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 4:
                    gameBoard[2][0] = 'X'; //middle left
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 5:
                    gameBoard[2][2] = 'X'; //middle middle
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 6:
                    gameBoard[2][4] = 'X'; //middle right
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 7:
                    gameBoard[4][0] = 'X'; //bottom left
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 8:
                    gameBoard[4][2] = 'X'; //bottom middle
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 9:
                    gameBoard[4][4] = 'X'; //bottom right
                    for (char [] row: gameBoard){ //so here we are pulling an element from the gameboard and storing each one in row. this for loop is set up to create each row
                        for (char c: row){ //this loops each character in the current row
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
            }



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


            if (i == 4){
                break;
            }

            //Player 2 input and switch statements

            System.out.println("Player 2, where would you like your X to be placed (1-9):");
            int Player2Input = scan1.nextInt();
            System.out.println();


            switch(Player2Input){
                case 1:
                    //EDIT THIS, DOESNT WORK

                    gameBoard[0][0] = 'O'; //top left
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
    }





//2. create a interface for it (GUI)


    public static void main(String[] args){
        Board();
        System.out.println("It's a tie! Better luck next time!");

    }

}
