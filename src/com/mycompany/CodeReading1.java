package com.mycompany;

public class CodeReading1 {

    public static void main(String[] args){

        CodeReading1 cr1 = new CodeReading1();
        int[] array = {3,2,5,0};
        System.out.println("first try "+cr1.search(array, -1));
        System.out.println("second try "+cr1.search(array,  7));
        System.out.println("the minumum value of "+cr1.findMinimum(array));
    }

    public int search(int[] array, int element){
        int a = -1;
        for (int i=0; i< array.length; i++) {
            if (array[i] == element) {
                a = i;
                break;
            }
        }
        return a;
    }

    public int findMinimum(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}

