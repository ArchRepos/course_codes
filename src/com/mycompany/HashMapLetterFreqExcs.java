package com.mycompany;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLetterFreqExcs {

  public static void main(String[] args) {
        HashMapLetterFreqExcs hashMapLetterFreqExcs = new HashMapLetterFreqExcs();
        String s = "we are learning programming language java . java is good programming language";
        System.out.println(hashMapLetterFreqExcs.calculateWordFrequencies(s).toString());
  }

  public HashMap<String, Integer> calculateWordFrequencies(String text){
    HashMap<String, Integer> resultMap = new HashMap<>();
    //"we are learning programming language java . java is good programming language"
    String[] words = text.split(" ");
    System.out.println(Arrays.toString(words));
    for (String word: words) {
      if (!resultMap.containsKey(word))
        resultMap.put(word, 1);
      else
        resultMap.put(word, resultMap.get(word) + 1);
    }
    return resultMap;
  }
}
