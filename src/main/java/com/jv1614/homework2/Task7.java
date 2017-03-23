package com.jv1614.homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Сдвиг вправо. Введите число смещений: ");
        int n = sc.nextInt();                
        
        int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                
                if (n>4){
                    int x = n%a[i].length;  // получаем кол-во смещений;
                    if ((j+x)>a[i].length-1){
                        int y = j + x - a[i].length;
                        System.out.print(a[i][y] + " ");
                    }else{
                        System.out.print(a[i][j+x] + " ");
                    }                                
                }else if(n>0){
                    
                    if ((j+n)>a[i].length-1){
                        int y = j + n - a[i].length;
                        System.out.print(a[i][y] + " ");
                    }else{
                        System.out.print(a[i][j+n] + " ");
                  
                    }
                }
            }
            System.out.println();
        }
        
        
        
        
    }    
}
