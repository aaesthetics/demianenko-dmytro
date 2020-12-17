package ua.khpi.oop.demianenko03;

public class Main {

	public static void main(String[] args) {
		System.out.print("Первоначальный текст: ");
		String text = "the weather is very good today also";
		System.out.println(text);
		//UtilityClass.Split(text);
		System.out.print("Результат: ");
		System.out.println(UtilityClass.FormatText(text));
		
		
	}

}

