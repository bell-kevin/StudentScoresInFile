/** ****************************************************************************
 * Scores.java
 * Kevin Bell
 *
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package studentscoresinfile;

import java.util.*;
import java.io.*;

public class Scores implements Serializable {

    static double getLowScore(double lowScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static double getHighScore(double highScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   ArrayList<String> students = new ArrayList<>();

//******************************************************************************
    public Scores(String[] names) {
        for (int i = 0; i < names.length; i++) {
            students.add(names[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " ");
        } // end for loop
        System.out.println();
    } // end display method
//******************************************************************************

    public void removeStudent(int index) {
        students.remove(index);
    } // end removeStudent method
//******************************************************************************

    public void addStudent(String name) {
        students.add(name);
    } // end removeStudent method
//******************************************************************************
} // end StudentList class
