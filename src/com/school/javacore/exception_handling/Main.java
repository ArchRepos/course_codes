package com.school.javacore.exception_handling;

public class Main {

    public static void main(String[] args){
        //  Integer number1 = Integer.parseInt("Help!");
        int [] a = {1,2,3,4};
       try {
        int b = method2(a);
       } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please know your limits!");
            int b = a[1];
            System.out.println("We do not have what you want, but maybe you will like this: "+b);
       }

    }

    public static void method1() throws Exception{
        System.out.println("I am doing some calculations");
        throw new Exception("I am a sample Exception!");
    }

    public static void method2(){
        System.out.println("I am a backup method will be called of method1 fails!");
    }

    public static int method2(int[] array) throws ArrayIndexOutOfBoundsException {
        return array[5];
    }
}