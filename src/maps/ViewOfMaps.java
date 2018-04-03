package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewOfMaps {

    public static void main(String[] args) {

        final Map<Integer, String> idProduct = new HashMap<>();
        idProduct.put(1, "Door");
        idProduct.put(2, "Window");
        idProduct.put(3, "Floor");

        System.out.println(idProduct);

        final Set<Integer> ids = idProduct.keySet();
        System.out.println(ids);

        final Set<Map.Entry<Integer, String>> entries = idProduct.entrySet();

        for(Map.Entry<Integer, String> entry: entries){

            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        //SortedMap was introduced in Java 6 then superseded by Navigable Maps
        //Sorted mpas defined an interface for a map with ordering





    }


}
