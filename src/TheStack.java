import java.util.*;
import java.util.Arrays;

/**
 * Created by 23rharris on 6/27/17.
 */
//Allows a single item to be added or removed
//Stacks are FILO
//Stack used to complete a task
public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    public TheStack(int size) {

        stackSize = size;

        stackArray = new String[size];

        Arrays.fill(stackArray, "-1");

    }

    //Pushing item on the stack
    public void pushOnToStack(String input) {

        if(topOfStack + 1 < stackSize) {

            topOfStack++;
            stackArray[topOfStack] = input;

        } else {

            System.out.println("Stack is full");
            displayTheStack();
        }

        displayTheStack();
        System.out.println("Push was added to stack");
    }

    public String pop(){

        if(topOfStack >= 0){

            displayTheStack();

            System.out.println("POP");

            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];

        } else {

            displayTheStack();
            System.out.println("Sorry but the stack is empty");
            return "-1";

        }
    }

    public void displayTheStack() {

        for(int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++) {
            System.out.format("| %2s " + " ", n);

        }
        System.out.println("|");

        for(int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();
        for(int n = 0; n < stackSize; n++) {


            if(stackArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s " + " ", stackArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

    }

    public static void main(String[] args) {

        TheStack theStack = new TheStack(10);

        theStack.pushOnToStack("10");
        theStack.pushOnToStack("14");

    }


}
