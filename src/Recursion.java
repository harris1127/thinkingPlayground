//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************

import java.util.Scanner;

/**
 * Created by rharris
 */
//Is a method that calls itself
    //Each method call becomes simpler and simpler
public class Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int triNum = 0;

        if(m == 1){

            System.out.println("1");
        } else {

            triNum = (m + getTriNum(m -1));
            System.out.println(triNum);
        }
    }

    /*
        Trianuglar number can be seen as triangles
        Equals itself plus every number before it to 1
        Ex. 5 = 5+4+3+2+1
     */
    public static int getTriNum(int num){

        int triangularNumber = 0;

        while(num > 0){

            triangularNumber = triangularNumber + num;
            num--;
        }

        return triangularNumber;
    }

    /**
     * Ex. 5 = 5 * 4 * 3 * 2 * 1
     * @return
     */
    public static int getFactorial(int num){

        System.out.println("Method" + num);

        if(num == 1){

            System.out.println("Returned 1");

            return 1;

        } else {

            int result = num * getFactorial(num - 1);

            System.out.println("Return" + result);

            return result;
        }

    }
}
