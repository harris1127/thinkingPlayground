package DesignPatterns.GangOfFour.Structural.Composite;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        /*
            Very simple example: combining types into the same type
         */

        Map<String, String> personAttributes = new HashMap<>();

        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();

        groupAttributes.put("group_role", "claims");

        Map<String, String> secAttributes = new HashMap<>();
        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);
    }
}
