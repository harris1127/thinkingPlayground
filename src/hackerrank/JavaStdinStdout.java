package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class JavaStdinStdout {

   /* In this challenge, you must read an integer, a double,
   and a String from stdin,
   then print the values according to the instructions in the Output Format section below.
   To make the problem a little easier, a portion of the code is provided for you in the editor.

    Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

            Input Format

    There are three lines of input:

    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.
    Output Format

    There are three lines of output:

    On the first line, print String: followed by the unaltered String read from stdin.
    On the second line, print Double: followed by the unaltered double read from stdin.
    On the third line, print Int: followed by the unaltered integer read from stdin.
    To make the problem easier, a portion of the code is already provided in the editor.

            Note: If you use the nextLine() method immediately following the nextInt() method,
    recall that nextInt() reads integer tokens;
    because of this, the last newline character for that
    line of integer input is still queued in the input
    buffer and the next nextLine()
    will be reading the remainder of the integer line (which is empty).*/

    /*suggest to use BufferedReader for reading text. Scanner hides IOException while BufferedReader throws it immediately.*/

    public static void main(String[] args) {
        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine();
            String s2 = br.readLine();
            String s3 = br.readLine();
            System.out.println("String: " + s3);
            System.out.println("Double: " + Double.parseDouble(s2));
            System.out.println("Int: " + Integer.parseInt(s1));

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }


}

