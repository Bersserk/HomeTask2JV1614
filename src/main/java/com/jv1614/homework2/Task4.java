package com.jv1614.homework2;

import java.util.Arrays;


public class Task4 {
    
    public static void main (String [] args) {
    
        int [] array = {1, 3 ,23, 54, 8, 12, 18, 21, 34, 46, 6, 4, 17, 33, 65} ; 
        
        
        straight(array);
        
        
        
    }
    
    public static void straight(int [] array) {              // метод вывода чисел массива в прямом порядке;
        
        for (int i=0; i < array.length; i++){
            System.out.print (array[i]+" ");
            Arrays.sort(array);
        }
    
    }
    
//    int back() {                                                                              // метод вывода чисел массива в обратном порядке;
//    
//    }
//    
//    int even() {                                                                             // метод вывода всех четных числе массива;
//    
//    }
//    
//    int odd () {                                                                              // метод вывода всех нечетных чисел;
//    
//    }
//    
//    int summ7 () {                                                                        // метод вывода суммы числе кратных 7;
//    
//    }
//    
//    int multiplication () {                                                             // метод произведения чисел кратных 3;
//    
//    }
    
    
}
