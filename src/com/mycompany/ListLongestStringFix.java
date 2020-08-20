package com.mycompany;

import java.util.ArrayList;

public class ListLongestStringFix {

    public static String findLongest(ArrayList<String> list)
    {
        String longestString = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i).length() > longestString.length())
                longestString = list.get(i);
        }
        return longestString;
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile", "verylongstring"};
        for (int i = 0; i < words.length; i ++)
        {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
}
