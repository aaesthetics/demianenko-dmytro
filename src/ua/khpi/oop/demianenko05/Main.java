package ua.khpi.oop.demianenko05;

public class Main {
	 public static void main(String[] args) {
		 Container<String> container = new Container<String>();
		 System.out.println("Добавление элементов команда add");
		 container.add("The");
		 container.add("weather");
		 container.add("very");
		 container.add("good");
		 System.out.println("Вывод с помощью команды toString");
		 System.out.println(container.toString());
		 System.out.println("Удаление элементов с помощью команды remove");
		 System.out.println(container.remove(1));
		 System.out.println("Количество элементов");
		 System.out.println(container.getSize());
		 System.out.println("Есть ли элемент в контейнере 1)The 2)weather");
		 System.out.println(container.contains("The"));
		 System.out.println(container.contains("weather"));
		 System.out.println("Использование итератора");
		 MyIterator<String> iterator = container.iterator();
		 while (iterator.hasNext())
		 {
		  String item = iterator.next();
		  System.out.println(item);
		 }
		 System.out.println("Удаление всех элементов.");
		 container.clear();
		 System.out.println(container.toString());
	 }
	}
