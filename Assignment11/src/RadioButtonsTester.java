//----------------------------------------------------
// Programmer: 		Mohammed Zayed
// Course: 		    COSC 1437 Section 009
// Semester: 		Fall 2019
// Assignment #: 	Assignment 08
// Due Date: 		10-09-19
//----------------------------------------------------

import javax.swing.JFrame;

public class RadioButtonsTester {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // instantiate a frame
        // from the class JFrame
        JFrame frame = new JFrame("Fun with radio buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // the primary panel is added
        // to the frame and made visible
        frame.getContentPane().add(new RadioButtonsGUI());
        frame.pack();
        frame.setVisible(true);

    }	// end method main

}	// end class RadioButtonsTester

