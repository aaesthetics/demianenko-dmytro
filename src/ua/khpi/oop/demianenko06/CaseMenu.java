package ua.khpi.oop.demianenko06;
import  ua.khpi.oop.khristoforov03.Helper;

import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.Scanner;
 
public class CaseMenu {
    private final Scanner scanner;
 
    public CaseMenu(Scanner scanner) {
        this.scanner = scanner;
    }
    Serializator serializator = new Serializator();
	
	Container s = new Container();
 
    private void printMenu() {
        System.out.println("1. Сериализация начальных даных;");
        System.out.println("2. Сериализация даных после удаления элемента;");
        System.out.println("3. Использовать сравнение даных (если true то одинаковые - false разные;");
        System.out.println("4. Использовать сортировку даных;");
        System.out.println("5. Использовать поиск элементов;");
        System.out.println("6. Использовать даные 3 лаб. K. Христофорова;");
        System.out.println("7. Выход из приложения;");
    }

    
    
    public void start() {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                     s.add("The");
                     s.add("weather");
                     s.add("very");
                     s.add("good");
               		 serializator.serialization(s);
						 try {
					     Container s = serializator.deserialization();
						 System.out.println(s.toString()); } catch (InvalidObjectException e) {
						 e.printStackTrace();
						 }
                        break;
                    case 2:
                    	s.remove("The");
                    	 serializator.serialization(s);
						 try {
					     Container s = serializator.deserialization();
						 System.out.println(s.toString()); } catch (InvalidObjectException e) {
						 e.printStackTrace();
						 }
                        break;
                    case 3:
                    	System.out.print("Введите слово: ");
                    	String request = "";
                    	Scanner scann = new Scanner(System.in);
                		request = scann.nextLine();
                        System.out.println(s.contains(request));
                        break;
                    case 4:
                        System.out.println(s.sort());
                        break;
                    case 5:
                    	System.out.print("Введите слово: ");
                    	String str = "";
                    	Scanner scanner = new Scanner(System.in);
                		str = scanner.nextLine();
                    	System.out.println(s.contains(str));
                        break;
                    case 6:
                    	StringBuilder a = new StringBuilder("The weather@ very #good");
                		System.out.println(a);
                    	Helper.Symbols.delete_symbols(a);
                		Helper.MakeChanges.make_changes(a);
                		System.out.println(Helper.Delimetrs.make_separation(a));
                       break;
                    case 7:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\\n");
                }
            } while (key != 7);
        }
    }
}
