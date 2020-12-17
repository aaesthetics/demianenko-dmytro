package ua.khpi.oop.demianenko04;
import java.util.Scanner;


public class Main {

	public static void main(final String[] args) {		
			boolean q = false;
			if (args[0].equals("-help")||args[0].equals("-h")){	
				System.out.println("Автор: Группа КИТ-119д, Демьяненко Дмитрий. \nЗадание: Номер 7. Ввести текст. "
	        			+ "З тексту видалити всі слова заданої довжини, що починаються на приголосну літеру. "
	        			+ "Вивести початковий текст та результат. ");	}
			if (args[0].equals("-debug")||args[0].equals("-d")){	
			q = true;
			}
			Scanner in = new Scanner(System.in);
	    	String text = null;
	    	boolean endProg = false;
	    	while(!endProg)
	    	{
	    		System.out.println("Меню");
	    		System.out.println("1. Ввести данные");
	            System.out.println("2. Посмотреть входные данные");
	            System.out.println("3. Выполнить задание");
	            System.out.println("4. Посмотреть результат");
	            System.out.println("5. Завершить программу");


	            System.out.print("Ваш выбор: ");
	            String a = in.nextLine();
	            String b = a.trim();
	    		
	        switch(b) {
	        case "1":
	        	System.out.print("Введите ваш текст: ");
	            text = in.nextLine();
	            break;
	        case "2":
	        	System.out.println(text);
	        	if(q == true) {
	        		System.out.println("Если слово имеет 4 буквы и начинается на согласную букву, то мы его удаляем.");
		    		UtilityClass.GetStrArr(text);
	        	}
	        	break;
	        case "3": 
	        	UtilityClass.FormatText(text);
	        	System.out.println("Задание выполнено!");
	        	if(q == true) {
		    		UtilityClass.GetStrArr(text);
	        	}
	        	break;
	        case "4": 
	        	System.out.println(UtilityClass.FormatText(text));
	        	
	        	break;
	        case "5":
	        	endProg = true;
	        	System.out.println("Программа завершена.");
	        	break;
	        default:
	        	System.out.println("Такой команды не существует. Попробуйте еще раз.");
	        	break;
	        	}
	    	}
				
	    }
		
	}

	
	
	
	
	
	
	
	