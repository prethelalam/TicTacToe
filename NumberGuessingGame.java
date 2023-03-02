import java.util.Scanner; 

public class NumberGuessingGame {
    static void GuessingGameWelcome(){
        System.out.println("Welcome to the number guessing game. The goal is to guess the correct number. Good luck!");
        System.out.println();
        System.out.print("Enter your guess (between 0 and 1000): ");     

        Scanner scan1 = new Scanner(System.in);
        int input = scan1.nextInt();
        System.out.println();

        int min = 0, max = 1000; //create a minimum and maxmimum range for the guessing game
        int random_value = (int)Math.floor(Math.random()* (max - min + 1) + min); //this allows to generate a random whole mumber between the min and max random

        while(input < random_value || input > random_value){ //while loop created to run loop infinite amount of times. set a condition where either option must occur to continue the loop
            if (input < random_value){
            System.out.println(input + " is lower than the correct number.");
            System.out.print("Enter a new guess: ");
            input = scan1.nextInt(); //reusing the scan to take in the new guess
            System.out.println();
            }
        
            if (input > random_value){
            System.out.println(input + " is higher than the correct number.");
            System.out.print("Enter a new guess: ");
            input = scan1.nextInt();
            System.out.println();
            }

            if (input == random_value){
            System.out.println("You have correctly guessed the number!");
            break; //breaks the loop once number is correctly guessed
            }
        }
    }

public static void main(String[] args) {
    GuessingGameWelcome();  
    }
}


