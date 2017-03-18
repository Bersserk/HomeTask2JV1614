package com.jv1614.homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число уровней треугольника: ");
        int x = sc.nextInt();
                
        int y = 0;
        int [][] a = new int [x][y];
        
        for (int j=0; j<x; j++){
            
            if ((j+1)%2 == 0){
                y = y+(int) (Math.random()*4)+1;
            }else {            
                y = y+(int) (Math.random()*2)+1;
            }
            a = new int [x][y];
            for (int i=0; i<y; i++){
                a[j][i] = (int) (Math.random()*9);
                System.out.print(a[j][i] + " ");
            }        
            System.out.println("");
        }
        
        int []b = new int [y+3];        
        for (int k = 0; k < b.length; k++) {
            b[k] = (int)(Math.random()*9)+1;
            System.out.print(b[k] + " ");
        }
                
    }    
}
