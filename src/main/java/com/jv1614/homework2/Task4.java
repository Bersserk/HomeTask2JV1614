package com.jv1614.homework2;

import java.util.Arrays;


public class Task4 {
    
    public static void main (String [] args) {
    
        int [] array = {1, 3 ,23, 54, 8, 13, 19, 21, 34, 46, 7, 4, 16, 37, 50} ; 
        
        
        System.out.println("вывод массива в прямом порядке");
        straight(array);
        System.out.println("\n"+"вывод массива в обратном порядке");
        back(array);
        System.out.println("\n"+"вывод четных чисел массива");
        even(array);
        System.out.println("\n"+"вывод нечетных чисел массива");
        odd(array);
        System.out.println("\n"+"вывод суммы чисел кратных 7");
        summ7(array);
        System.out.println("\n"+"вывод произведения чисел кратных 3");
        multiplication(array);                        
    }
    
    public static void straight(int [] array) {         // метод вывода чисел массива в прямом порядке;                
        
        for (int i=0; i < array.length; i++){
            System.out.print (array[i]+" ");
            Arrays.sort(array);
        }
    
    }
    
    public static void back(int [] array) {             // метод вывода чисел массива в обратном порядке;
        
        for (int i=array.length-1; i > -1; i--){
            System.out.print (array[i]+" ");
            Arrays.sort(array);
        }
    }
    
    public static void even(int [] array) {                                                                             // метод вывода всех четных числе массива;
        for (int i=0; i < array.length; i++){
            if (array[i]%2==0){
            System.out.print (array[i]+" ");
            }
        }
    }
    
    public static void odd (int [] array) {                                                                              // метод вывода всех нечетных чисел;
        for (int i=0; i < array.length; i++){
            if (array[i]%2!=0){
            System.out.print (array[i]+" ");
            }
        }
    }
    
    public static void summ7 (int [] array) {                                                                        // метод вывода суммы числе кратных 7;
        int n = 0;
        for (int i=0; i < array.length; i++){
            if (array[i]%7==0){                
                n += array[i];
            }
            if(i==array.length-1){                        
                System.out.println (n);
            }
        }
    }
    
    public static void multiplication (int [] array) {                                                             // метод произведения чисел кратных 3;
        int n = 1;
        for (int i=0; i < array.length; i++){
            if (array[i]%3==0){                
                n *= array[i];
            }
            if(i==array.length-1){                        
                System.out.println (n);
            }
        }
    }
       
}
