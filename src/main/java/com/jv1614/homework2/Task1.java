
package com.jv1614.homework2;

public class Task1 {
    
    public static void main (String [] args) {
        
        number ();
        System.out.println();
        numberSum ();
       // raznostSum();
       
       double a = Math.random()*10;
       int b = (int) a;
       System.out.println(b+1);
        
    }
    
        static void number () {
        
            int i;
            
            for (i=0; i <= 100; i++) {
                if (i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0) System.out.print (i + " ");                                                  
            }
         
        }
        
        public static void numberSum () {
        
             int i;
             int x = 0;
             int y = 0;
             double z = 0;
             double k = 0;
                        
             for (i=0; i <= 100; i++) {                
                if (i%2 == 0)                     
                    x = x + i;                                                                         
             }            
                      System.out.println ("Сумма чисел кратных 2 = " +x); 
                      
              for (i=0; i <= 100; i++) {                
                if (i%3 == 0)                     
                    z = z + i;                                                                         
             }            
                      System.out.println ("Сумма чисел кратных 3 = " +z); 
                      
                      for (i=0; i <= 100; i++) {                
                if (i%5 == 0)                     
                    k = k + i;                                                                         
             }            
                      System.out.println ("Сумма чисел кратных 5 = " +k); 
                      
                      for (i=0; i <= 100; i++) {                
                if (i%7 == 0)                     
                    y = y + i;                                                                         
             }            
                      System.out.println ("Сумма чисел кратных 7 = " +y);
                      System.out.println ("Разность сумм чисел кратных 7 и 2 = " +(y-x));
                      System.out.println ("Отношение сумм чисел кратных 5 и 3 = " +(k/z));
                                          
        }
        
        //static void raznostSum () {
            
            
            
           // System.out.println(x);
        
        
       // }
    
}
