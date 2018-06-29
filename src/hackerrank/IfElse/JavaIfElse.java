package hackerrank.IfElse;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        whatIsN(N);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

    }

    static void whatIsN(int n) {

        /*            N modulus 1 equals 0 decides if a number is odd
         */
        if(n % 2 == 1) {

            System.out.println("Weird");
        }

        /*
            N modulus 2 equals 0 decides if a number is even
         */
        if(n % 2 == 0 && (n >= 2 && n <= 5)) {

            System.out.println("Not Weird");

        }

        if(n % 2 == 0 && (n >= 6 && n <= 20)) {

            System.out.println("Weird");

        }

        if(n % 2 == 0 && (n > 20)) {

            System.out.println("Not Weird");

        }
    }
}
