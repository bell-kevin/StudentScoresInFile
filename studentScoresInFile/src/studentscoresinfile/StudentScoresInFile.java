/** ****************************************************************************
 * StudentScoresInFile.java
 * Kevin Bell
 *
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package studentscoresinfile;

import java.io.*;
import java.util.*;

public class StudentScoresInFile {

    public static void main(String[] args) {
        System.out.println("Chapter 16 Objects in Files by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        double score = 0, lowScore = 0, highScore = 0, averageScore = 0;
        double[] scores = {};
        String name;
        String[] names = {};
        names = new String[5];
        scores = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            name = computerKeyboardInput.next();
            names[i] = name;
            System.out.print("Enter test score: ");
            score = computerKeyboardInput.nextDouble();
            scores[i] = score;
        } // end for loop
        System.out.println("Data written to file");
        Scores studentList = new Scores(names);
        String fileName = "studentScores.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(studentList);
            fileOut.reset();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            while (true) {
                studentList = (Scores) fileIn.readObject();
                studentList.display();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        System.out.println("Low score: " + lowScore);
        System.out.println("High score: " + highScore);
        System.out.println("Average score: " + averageScore);
    } // end main method
} // end Ch16writingAndReadingObjects class
