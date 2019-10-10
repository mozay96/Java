//----------------------------------------------------
// Programmer:		Mohammed Zayed
// Course:			COSC 1437 Section 009
// Semester:		Fall 2019
// Assignment #:	6
// Due Date:		September 25th, 2019
//----------------------------------------------------

// for GUI programming
import javax.swing.JFrame;

public class NumericKeypadTester
{

    public static void main (String[] args)
    {
        // create a frame and add pane to it and
        // make it visible

        JFrame numericFrame = new JFrame("Numeric Keypad");
        numericFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numericFrame.getContentPane().add(new NumericKeypadPanel());
        numericFrame.pack();
        numericFrame.setVisible(true);

    }	// end method main
}	// end class NumericKeypadTester
