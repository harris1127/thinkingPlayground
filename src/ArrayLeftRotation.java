//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************

import java.util.Scanner;

/**
 * Created by rharris
 */
public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] tmp = new int[n];
        for(int i=0; i<k; i++) {
            tmp = a;
            int f = tmp[0];
            for(int j=0; j<n-1; j++) {
                a[j] = tmp[j+1];
            }
            a[n-1] = f;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
