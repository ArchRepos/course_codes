package com.mycompany;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExcersises2 {

    public static void main(String[] args){

        int[] array = {1,2,2,3,5,6,7,3,7,8,10,10};
        Integer[] array1 = {1,2,2,3,5,6,7,3,7,8,10,10};
        SetExcersises2 setExcersises2 = new SetExcersises2();
        Integer[] result = setExcersises2.removeDuplicatesUpdated(array1);
        System.out.println("before "+ Arrays.toString(array1));
        System.out.println("after "+ Arrays.toString(result));
    }

    /*
    * 1. method accepts array of int and returns array of int
    * 2. define hashset add elements of array into it to remove duplicates
    * 3. define an array to contain final result(numbers duplicates removed)
    * 4. populate it with the elements from hashset
    * 5. return it
    * */


    public int[] removeDuplicates(int[] arr){
        Set<Integer> noDupSet = new HashSet<>();

        for (int i = 0; i< arr.length; i++){
            noDupSet.add(arr[i]);
        }

        int[] finalArray = new int[noDupSet.size()];

        int counter = 0;
        for (Integer element: noDupSet){
            finalArray[counter++] = element;
        }

        return finalArray;
     }

    public Integer[] removeDuplicatesUpdated(Integer[] arr){
        HashSet<Integer> noDupSet = new HashSet<>(Arrays.asList(arr));
        return noDupSet.toArray(new Integer[0]);
    }
}
