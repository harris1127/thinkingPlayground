//**********************************************************************
// Property of Lowe's Companies, Inc.
//*********************************************************************

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rharris
 */
public class RegularExpressions {

    public static void main(String[] args) {

        String s1 = "My name is Ryan Harris";

        Pattern pattern = Pattern.compile("\\w+"); //in java slash is escape character and \\w says a word character, + has one or more occurrences

        Matcher matcher = pattern.matcher(s1); // finds match with one or more grouping of word characters

        while(matcher.find()){

            System.out.println(matcher.group());
        }

    }



}
