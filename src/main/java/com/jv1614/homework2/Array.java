package com.jv1614.homework2;

public class Array {
       
    public static void main (String [] args){
                                        
        int [][] ar = {{2,3,3,9,0},{3,7,9,49,14}};
        printAr(ar);  // метод реализующий вывод массива в прямом и обратном порядке
        print2Ar(ar);  //метод выводящий все четные элементы во всех четных строках
        print3Ar(ar);  //метод выводящий все нечетные элементы в нечетных строках
        sumPrint2Ar(ar);  //Вывод суммы всех элементов, кратных 7 в четных строках
        prPrint3Ar(ar);  //Вывод произведения элементов, кратных 3 в нечетных строках
    }
    
        public static void printAr (int[][]ar){
        
        System.out.println ("Вывод массива в прямом порядке:");    
        for (int i = 0; i < 2; i++){
            
                for (int j = 0; j < 5; j++){                   
                    
                System.out.print(ar [i][j] + " ");     // вывод массива на экран
                
                }
                System.out.println();
            }
            System.out.println();
            System.out.println ("Вывод массива в обратном порядке:"); 
            for (int i = 0; i < 2; i++){
                for (int j = 4; j < 6 && j>=0; j--){                
                    System.out.print(ar[i][j] + " ");       // вывод массива в обратном порядке
                }                
               System.out.println();
               
            }
            System.out.println();
            
            
        }
        
        public static void print2Ar (int[][]ar){
            System.out.println ("Для каждой четной строки вывод всех четных элементов массива:"); 
            for (int i = 0; i < 2; i++) {
               // System.out.println();
                for (int j = 0; j < 5; j++){
                    if (i%2 != 0 && ar[i][j]%2 ==0){
                        System.out.print (ar[i][j] + " ");
                    }
             
             
            }
            }
        }
        
        public static void print3Ar (int[][]ar){
            System.out.println();
            System.out.println ("Для каждой нечетной строки вывод всех нечетных элементов массива:"); 
            for (int i = 0; i < 2; i++) {
               // System.out.println();
                for (int j = 0; j < 5; j++){
                    if (i%2 == 0 && ar[i][j]%2 !=0){
                        System.out.print (ar[i][j] + " ");
                    }
             
             
            }
            }
        }
        
        public static void sumPrint2Ar (int[][]ar) {
            System.out.println();
        System.out.println ("Вывод суммы всех элементов, кратных 7 в четных строках:"); 
            for (int i = 0; i < 2; i++) {               
               int sum = 0; 
               for (int j = 0; j < 5; j++){
                    if (i%2 != 0 && ar[i][j]%7 == 0){
                        sum += ar[i][j];                       
                    }              
               }
               if (sum != 0){
               System.out.println(sum);
               }
            }
        }
        
        public static void prPrint3Ar (int[][]ar) {
            System.out.println();
        System.out.println ("Вывод произведения элементов, кратных 3 в нечетных строках:"); 
            for (int i = 0; i < 2; i++) {               
               int prd = 1;
               int m = 0;
               for (int j = 0; j < 5; j++){
                    if (i%2 == 0 && ar[i][j]%3 == 0){
                        
                        m = prd*ar[i][j];
                        prd = ar[i][j];
                        if (m != prd && m!=0){
                        System.out.print(m);}
                    }              
               }
              // if (prd != 0){
               //System.out.println(m);
               }
            }   // работает неверно,в процессе исправления...
        
}
