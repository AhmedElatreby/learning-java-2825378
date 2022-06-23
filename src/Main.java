package src;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Can you guess how many stones in my hand?";
        String choiceOne = "2";
        String choiceTwo = "3";
        String choiceThree = "4";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("you can chose a number, is it " +  choiceOne + " or " + choiceTwo +
                        " or" + choiceThree + ".");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();


        // If the user's input matches the correctAnswer...
        if (correctAnswer.equals(input)) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congrats! your have the chose the correct answer");
        } else {
            System.out.println("This is incorrect answer, the correct answer is " + correctAnswer);
        }


        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
