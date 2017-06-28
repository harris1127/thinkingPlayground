/**
 * Created by 23rharris on 6/27/17.
 */
//Allows a single item to be added or removed
public class TheStack {

    private String [] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    public TheStack(int size){

        stackSize = size;

        stackArray = new String[size];


    }

    public void pushOnToStack(String input){

        if(topOfStack + 1 < stackSize){

            topOfStack++;
            stackArray[topOfStack] = input;
        } else {

            System.out.println("Stack is full");
        }
    }


}
