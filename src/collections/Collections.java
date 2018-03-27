package collections;//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Created by rharris
 */
public class Collections {

    /**
     * Collections classes are implementing data structures (Trees, hash tables, hash maps, buffers)
     * <p>
     * All collections interfaces extend the collections
     * List( Most commonly used collections - they have order, indexing
     * Set/SortSet - a collection that has distinct elements it can only be in the collection once
     * Queue - things that have in order FIFO / Deque support FIFO and LIFO
     * Map - Keyed collections keys are unique
     *
     * @param args
     */

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        TreeSet<String> treeSetString = new TreeSet<>();

        String s1 = "Test 1";
        String s2 = "Test 2";
        String s3 = "Test 3";

        stringArrayList.add(s1);
        stringArrayList.add(s2);
        stringArrayList.add(s3);

        treeSetString.add(s1);
        treeSetString.add(s2);
        treeSetString.add(s3);

        stringArrayList.forEach(item -> System.out.println(item.toString()));

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 20);

        /**
         * Collections and Iterator
         * Using an iterator is not a common practice
         */

        Collection<Product> productCollection = new ArrayList<>();
        productCollection.add(floorPanel);
        productCollection.add(door);

        for(Product product : productCollection) {

            if(product.getWeight() < 15) {

                productCollection.remove(product);
            }

            System.out.println(product);
        }

        System.out.println(productCollection.size());


    }
}
