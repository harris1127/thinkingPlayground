//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************

import java.util.*;
import java.util.Arrays;

/**
 * Created by rharris
 */
//Allows you to access the first item FIFO
public class Queue {

    private String[] queueArray;

    private int queueSize;

    private int front;
    private int rear;
    private int numberOfItems = 0;

    public Queue(int size) {

        queueSize = size;
        queueArray = new String[size];

        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {

        if(numberOfItems + 1 <= queueSize) {

            queueArray[rear] = input;

            rear++;

            numberOfItems++;

            System.out.println("Insert");

        } else {

            System.out.println("Sorry the queue is full!");
        }

        displayTheQueue();
    }

    public void remove() {

        if(numberOfItems > 0) {

            System.out.println("Remove from queue");

            queueArray[front] = "-1";

            front++;

            numberOfItems--;

        } else {

            System.out.println("Sorry but queue is empty");
        }
    }

    public void displayTheQueue() {

        for(int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++) {

            if(queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s " + " ", queueArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        // Number of spaces to put before the F

        int spacesBeforeFront = 3 * (2 * (front + 1) - 1);

        for(int k = 1; k < spacesBeforeFront; k++) System.out.print(" ");

        System.out.print("F");

        // Number of spaces to put before the R

        int spacesBeforeRear = (2 * (3 * rear) - 1) - (spacesBeforeFront);

        for(int l = 0; l < spacesBeforeRear; l++) System.out.print(" ");

        System.out.print("R");

        System.out.println("\n");

    }

    public static void main(String[] args) {

        Queue theQueue = new Queue(10);
        theQueue.insert("10");
    }


}
