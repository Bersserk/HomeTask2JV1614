package com.jv1614.homework2;

import java.util.Scanner;

public class Task62 {
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
            int z = a[x-1].length;
            for(int m = z; m > 0; m--){
                                
                if (z-a[k].length>0){
                    System.out.print("  ");
                }else{
                    System.out.print(a[k][z-1] + " ");
                }
            z--;    
            }            
            System.out.println();        
        }
    }    
}
