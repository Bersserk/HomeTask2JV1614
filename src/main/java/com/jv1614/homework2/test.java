package com.jv1614.homework2;

public class test {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 7777, bin = 15L; // Программа перевода числа из десятичной системы 
		int m;                                     // исчисления в шестнадцатеричную систему !!! Доработанный вариант !!!
		String text = "Число в десятичной системе:        ";
		System.out.println(text+n+"\n");
		// Преобразование целой части в двоичную систему
		text = "Число в шестнадцатеричной системе:   ";
		for (int i = 15; i>=0;i--) {
			m = (int) ((n>>>(i*4))&bin);
			switch (m) {
			case 0:                           text += '0'; break;
			case 1:                           text += '1'; break;
			case 2:                           text += '2'; break;
			case 3:                           text += '3'; break;
			case 4:                           text += '4'; break;
			case 5:                           text += '5'; break;
			case 6:                           text += '6'; break; 
			case 7:                           text += '7'; break;
			case 8:                           text += '8'; break;
			case 9:                           text += '9'; break;
			case 10:                          text += 'A'; break;
			case 11:                          text += 'B'; break;
			case 12:                          text += 'C'; break;
			case 13:                          text += 'D'; break;
			case 14:                          text += 'E'; break;
			case 15:                          text += 'F'; break;
			}
		}
		System.out.println(text);
    }
}
