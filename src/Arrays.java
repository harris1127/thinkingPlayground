/**
 * Created by 23rharris on 6/27/17.
 */
public class Arrays {

    private int [] theArray = new int[50];
    private int arraySize = 10;

    //Generates random values for an array
    public void generateRandomValues() {

        for(int i = 0; i < arraySize; i++){

            theArray[i] = (int)(Math.random() * 10) + 10;
            System.out.println(theArray[i]);
        }
    }

    //Get the values at a certain index
    public int getValueAtIndex(int index){

        //Cant add an index which is greater than the array
        if(index < arraySize){

            System.out.println("Get value at " + theArray[index]);
            return theArray[index];

        } else {

            return 0;
        }
    }

    //Find the value in the array
    public boolean doesArrayContainValue(int value){

        boolean valueInArray = false;

        //Cant delete an index
        for(int i = 0; i < arraySize; i++){

            if(theArray[i] == value){

                valueInArray = true;
            }
        }

        return valueInArray;
    }

    //Delete index in array
    public void deleteIndexInArray(int index){

        //Cant delete an index whose size is greater than the array
        if(index < arraySize){

            for(int i = index; i < (arraySize - 1); i++){

                theArray[i] = theArray[i +1];
            }
        }
    }

    //Insert value in array
    public void insertValue(int value){

        if(arraySize < value){

            theArray[arraySize] = value;
            arraySize++;
        }
    }

    //Linear search in a array
    public String linearSearch(int value){

        boolean valueInArray = false;
        String indexWithValue = "";

        for(int i = 0; i < arraySize; i ++){
            if(theArray[i] == value){

                valueInArray = true;
                indexWithValue += i + " ";
                System.out.println("Found value " + indexWithValue);
            }
        }

        if(!valueInArray){
            indexWithValue = "none";
            System.out.println(indexWithValue);
        }

        return indexWithValue;
    }

    //Bubble Sort
    public void bubbleSort(){

        for(int i = arraySize - 1; i > 1; i--){

            for(int j = 0; j < i; j++){

                if(theArray[j] > theArray[j + 1]){

                    swapValues(j , j +1);
                }
            }
        }
    }

    private void swapValues(int indexOne, int indexTwo){

        int temp = theArray[indexOne];
        //Swap with the first index
        theArray[indexOne] = theArray[indexTwo];
        //swap with the second index
        theArray[indexTwo] = temp;

    }

    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        arrays.generateRandomValues();
        arrays.getValueAtIndex(1);
        arrays.linearSearch(16);


    }

}
