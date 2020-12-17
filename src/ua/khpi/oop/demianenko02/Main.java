package ua.khpi.oop.demianenko02;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------");
	    System.out.println("|  number | first/last   | second/penult  |");
	    System.out.println("-------------------------------------------");
	    for(int i = 0; i < 10; i++) {
		int chislo = Random();
		int ch1 = First(chislo);
		int ch2 = Last(chislo);
		int ch3 = Penult(chislo, ch2);
		int ch4 = Second(chislo, ch1);
		char res1 = 0;
		char res2 = 0;
	      
		if(ch1 == ch2) {
			res1 = '+';
		}
		else {
			res1 = '-';

		}
		if(ch3 == ch4) {
			res2 = '+';
		}
		else {
			res2 = '-';
		}
		 
	    System.out.print("|  " + Integer.toString(chislo,8) + "   ");
	    System.out.print("|        "+res1+"     |");
	    System.out.println("\t "+res2+"        |");
	    System.out.println("-------------------------------------------");
	   }
	}
	
	public static int Random() {
		int min = 01000;
		int max = 07777;
		int diff = max - min;
		Random ran = new Random();
		int ch = ran.nextInt(diff + 1);
		ch += min;
		return ch;
	}
	public static int First(int chislo) {
		
		if(chislo < 010000) {
			chislo = chislo >> 3;
			chislo = chislo >> 3;
			chislo = chislo >> 3;
		}
		else {
			chislo = chislo >> 3;
			chislo = chislo >> 3;
			chislo = chislo >> 3;
			chislo = chislo >> 3;
		}
		return chislo;
	}
	
	public static int Last(int chislo) {
		int a;
		int b;
		a = chislo >> 3; 
		a = a << 3;
		b = chislo - a;
		
		return b;
	}
	
	public static int Penult (int chislo, int ch2) {
		int a;
		int b;
		a = chislo;
		chislo = chislo >> 3; 
		chislo = chislo	>> 3;
		chislo = chislo << 3;
		chislo = chislo	<< 3;
		
		b = ((a - chislo) - ch2);
		b = b >> 3;
		return b;
	}
	
	public static int Second(int chislo, int ch1) {
		if(chislo < 010000) {
			chislo = chislo >> 3;
			chislo = chislo >> 3;
			chislo -= (ch1 << 3);
		}
		else {
			chislo = chislo >> 3;
			chislo = chislo >> 3;
			chislo = chislo >> 3;
			chislo -= (ch1 << 3);
		}
		return chislo;
	}
	
}
