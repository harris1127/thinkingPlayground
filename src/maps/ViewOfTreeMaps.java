package maps;

import java.util.Set;
import java.util.TreeMap;

public class ViewOfTreeMaps {

    /*
        Its the only implementation that implements a navigable and sorted map
     */

    public static void main(String[] args) {

        final String treeName = "treeName";
        final TreeMap<String, String> treeMap = new TreeMap<>();

        /*
                Refinances the tree based on the middle node (Based off their natural order)
                For integer, it would sort ascending order and for strings alphabetical order
                In order of having a linked list style while we have to go though each node the tree is balanced
                and its less work to search
             */

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        Integer highestKey = map.lastKey();
        Integer lowestKey = map.firstKey();
        Set<Integer> keysLessThan3 = map.headMap(3).keySet();
        Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();

        System.out.println(highestKey);
        System.out.println(lowestKey);

    }
}
