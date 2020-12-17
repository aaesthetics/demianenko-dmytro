package ua.khpi.oop.demianenko01;

public class Main {

	public static void main(String[] args) {
		
		//task01
		
		final int A = 0xC9BA; //зачетная книжка 51642 в 16-системе
		final long B = 380501477411L; //в 10-системе
		final int C = 0b1011; //в 2-системе
		final int D = 016363; //в 8-системе
		final int E = ((7 - 1) % 26) + 1; // равно 7
		//char u = (char) E;
		final char F = 'G';// 7 буква в английском алфавите
		
		//task02
		
		System.out.println(A);
		int even = 0;
		int odd = 0;
		
		int a = 0xC9BA;
		while(a > 0)
		{
			if(a % 2 == 0)
			{
				even++;
				a/= 10;
			}
			else if(a % 2 != 0)
			{
				odd++;
				a/= 10;
			}
		}
		
		System.out.printf("Четные: %d\n", even);
		System.out.printf("Нечетные: %d\n", odd);

	
		System.out.println(B);
		even = 0;
		odd = 0;

		long b = 380501477411l;
		while(b > 0)
		{
			if(b % 2 == 0)
			{
				even++;
				b/= 10;
			}
			else if(b % 2 != 0)
			{
				odd++;
				b/= 10;
			}
		}
		
		System.out.printf("Четные: %d\n", even);
		System.out.printf("Нечетные: %d\n", odd);
		
		System.out.println(C);
		even = 0;
		odd = 0;
		
		int c = 11;
		while(c > 0)
		{
			if(c % 2 == 0)
			{
				even++;
				c/= 10;
			}
			else if(c % 2 != 0)
			{
				odd++;
				c/= 10;
			}
		}
		
		System.out.printf("Четные: %d\n", even);
		System.out.printf("Нечетные: %d\n", odd);
		
		System.out.println(D);
		even = 0;
		odd = 0;
		
		int d = 7411;
		while(d > 0)
		{
			if(d % 2 == 0)
			{
				even++;
				d/= 10;
			}
			else if(d % 2 != 0)
			{
				odd++;
				d/= 10;
			}
		}
		
		System.out.printf("Четные: %d\n", even);
		System.out.printf("Нечетные: %d\n", odd);
		
		
		System.out.println(E);
		even = 0;
		odd = 0;
		
		int e = 7;
		while(e > 0)
		{
			if(e % 2 == 0)
			{
				even++;
				e/= 10;
			}
			else if(e % 2 != 0)
			{
				odd++;
				e/= 10;
			}
		}
		
		System.out.printf("Четные: %d\n", even);
		System.out.printf("Нечетные: %d\n", odd);
		
		
		//task03
		
		int ones = 0;
		int exemple = 0b1;
		
		int a2 = 0b1100100110111010;
		
		System.out.println(Integer.toString(a2,2));

		while(a2 > 0)
		{
			if((a2 & exemple) != 0)
			{
				ones++;
				a2 = a2 >> 1;
			}
			else
			{
				a2 = a2 >> 1;
			}
		}
		
		System.out.printf("Количество единиц: %d\n", ones);

		
		long b2 = 0b101100010010111101001111100100000100011l;
		
		System.out.println(Long.toString(b2,2));
		ones = 0;
		
		while(b2 > 0)
		{
			if((b2 & exemple) != 0)
			{
				ones++;
				b2 = b2 >> 1;
			}
			else
			{
				b2 = b2 >> 1;
			}
		}
		
		System.out.printf("Количество единиц: %d\n", ones);

		
		int c2 = 0b1011; 
		System.out.println(Integer.toString(c2,2));
		ones = 0;
		
		while(c2 > 0)
		{
			if((c2 & exemple) != 0)
			{
				ones++;
				c2 = c2 >> 1;
			}
			else
			{
				c2 = c2 >> 1;
			}
		}
		System.out.printf("Количество единиц: %d\n", ones);

		int d2 = 0b1110011110011; 
		System.out.println(Integer.toString(d2,2));

		ones = 0;
		while(d2 > 0)
		{
			if((d2 & exemple) != 0)
			{
				ones++;
				d2 = d2 >> 1;
			}
			else
			{
				d2 = d2 >> 1;
			}
		}

		System.out.printf("Количество единиц: %d\n", ones);

		
		int e2 = 0b11; 
		System.out.println(Integer.toString(e2,2));
		ones = 0;
		while(e2 > 0)
		{
			if((e2 & exemple) != 0)
			{
				ones++;
				e2 = e2 >> 1;
			}
			else
			{
				e2 = e2 >> 1;
			}
		}
		
		System.out.printf("Количество единиц: %d\n", ones);

		//System.out.println(ones);
		
		
		
		
		//находит буквы под соответсвующее значение
		/*
		int j = 1;
		for (char i = 'A'; i <= 'Z'; i++) {
			
				if(j == E)
				 {
					 System.out.println(i);
					 break;
				 }
				else if(j != E)
				{
					j++;
				}
			}
		*/
		

	}

}
