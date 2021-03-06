package ChapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

//6.35 (Computer-Assisted Instruction) The use of computers in education is referred to as computer
//        assisted instruction (CAI). Write a program that will help an elementary school student learn
//        multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
//        should then prompt the user with a question, such as
//        How much is 6 times 7?
//        The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
//        display the message "Very good!" and ask another multiplication question. If the answer is wrong,
//        display the message "No. Please try again." and let the student try the same question repeatedly
//        until the student finally gets it right. A separate method should be used to generate each new question.
//        This method should be called once when the application begins execution and each time the
//        user answers the question correctly.
public class RandomQuestion {
    public static SecureRandom rand = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static long UserAnswer;
    public static long Answer;
    public static String display;
    public static String input;

    public static void main(String[] args) {
        runRandomQuestion();
    }
    private static void runRandomQuestion() {


        DisplayOneQuestion();

    }


    private static void DisplayOneQuestion() {
       int firstDigit = rand.nextInt(10);
       int secondDigit = rand.nextInt(10);
        System.out.printf("How much is %d times %d ", firstDigit, secondDigit);
        UserAnswer = scanner.nextLong();
        Answer = firstDigit * secondDigit;
        CheckUserAnswer();


    }

    private static void CheckUserAnswer() {
        if (UserAnswer == Answer) {
            System.out.println("Very good!");
            System.out.println("Please Kindly try again");
            DisplayOneQuestion();


        }
        else {
            System.out.println("No. Please try again.");
            DisplayOneQuestion();
        }


    }


}
