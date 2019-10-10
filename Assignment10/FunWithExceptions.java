//----------------------------------------------------
// Programmer: 		Mohammed Zayed
// Course: 		    COSC 1437 Section 009
// Semester: 		Fall 2019
// Assignment #: 	Assignment 08
// Due Date: 		10-09-19
//----------------------------------------------------


import javax.swing.*;
import java.util.Random;

public class FunWithExceptions
{
    public static void main (String[] args) throws
            StringTooLonngException, NoEvenNumberException
    {
        // declare variables to be used in program
        final int MAX = 20;
        int num;
        String input, name = "Dr. Castaneda";

        // instantiate an object from the
        // Random class so we can
        // generate random numbers
        Random rand = new Random();


        // set up exceptions to
        // be caught if raised
        StringTooLonngException lengthException =
                new StringTooLonngException("String has too many characters.");

        NoEvenNumberException noEvenNumberException =
                new NoEvenNumberException("No even numbers are allowed!");

        // process string
        // and number
        do
        {
            input = JOptionPane.showInputDialog(null,
                    "Please enter a string. Enter DONE " +
                    "when finished");
            if(!input.equalsIgnoreCase("DONE"))
                try{

                    //String too long
                    //Throw exception!
                    if(input.length() > MAX)
                        throw lengthException;
                    else //String is okay to process
                    {
                        JOptionPane.showMessageDialog(null,
                                "You entered: \"" +
                                input +
                                "\", its length was " +
                                input.length(),
                                "String info",
                                JOptionPane.INFORMATION_MESSAGE);
                    } //end else statement

                    // generate a random number
                    // between 0 and 99
                    num = rand.nextInt(100);
                    System.out.println("num is: " + num);

                    if(num % 2 == 0)
                    {
                        throw noEvenNumberException;
                    }
                } // end try clause

                //Catch long string exception
                //that was raised!
            catch (StringTooLonngException e)
            {
                JOptionPane.showMessageDialog(null,
                        e.getMessage() +
                        "\nPlease try again!",
                        "Invalid string input",
                        JOptionPane.ERROR_MESSAGE);
            }

            catch (NoEvenNumberException e)
            {
                JOptionPane.showMessageDialog(null,
                        e.getMessage() +
                                "\nOops!",
                        "Invalid even number",
                        JOptionPane.ERROR_MESSAGE);
            }
        }while(!input.equalsIgnoreCase("DONE"));

        JOptionPane.showMessageDialog(null,
                "This program was written by " +
           name +
                "\nEnd of program.",
                "Good bye!",
                JOptionPane.INFORMATION_MESSAGE);

    }	// end method main
}	// end class FunWithExceptions
