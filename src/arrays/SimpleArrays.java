//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************
package arrays;

import java.util.Arrays;

/**
 * Created by rharris
 */
public class SimpleArrays {

    /**
     * Arrays are a very low level complex they dont give us alot of features like collections
     * Arrays allow for duplicates and don't allow for uniqueness (collections.Collections helps solve this problems)
     * @param args
     */

    public static void main(String[] args) {

        String[] products = {"Supreme", "Nike"};

        System.out.println(Arrays.toString(products));

        //Add to an array - you have to make your code to add to the array
        products = add("Adidas", products);
        System.out.println(Arrays.toString(products));

        //Remove an array - once again you have to make code to remove the array
        products = remove(products, 2);
        System.out.println(Arrays.toString(products));

    }

    private static String[] add(String object, String[] array) {

        int length = array.length;
        String[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = object;
        return newArray;
    }

    private static String[] remove(String[] array, int removeAmount) {

        int length = array.length;
        String[] newArray = Arrays.copyOf(array, length - removeAmount);
        return newArray;

    }
}
