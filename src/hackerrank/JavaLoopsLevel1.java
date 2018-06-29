package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoopsLevel1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int loopAmount = 11;
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 1; i < loopAmount; i++){

            System.out.println(N + " x " + i + " = " + N * i);

        }


        scanner.close();
    }
}