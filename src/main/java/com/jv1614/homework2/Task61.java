package com.jv1614.homework2;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число уровней треугольника: ");
        int x = sc.nextInt();
                        
        int [][] a = new int [x][];
        
        for (int i=0; i<x; i++){
            a[i] = new int[i+2];
            for(int j=0; j<a[i].length; j++){
                a[i][j] = (int) (Math.random() * 9);
            System.out.print(a[i][j] + " ");
            }
        System.out.println();        
        }
        System.out.println();
                
        for(int k=a.length-1; k>-1; k--){
             for (int j=0; j<a[k].length; j++){
                 System.out.print(a[k][j] + " ");
             }
                        
            System.out.println();        
        }
    }    
}
