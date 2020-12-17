package ua.khpi.oop.demianenko05;
import java.util.Iterator;

public class Main 
{
	public static void main(String[] args) 
	{
		Container container = new Container("The weather is very nice today.", 
				"I'm not going to school today.", 
				"Today is Saturday, which means I'm going to a picnic with my friends.", 
				"I hope the day goes well.");
		Iterator<String> it = container.iterator();
		System.out.println("While cycle:");
		it = container.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		
		System.out.println("\nToArray method and displaying using for each cycle:");
		it = container.iterator();
		Object[] array = container.toArray();
		for(Object arr : array)
			System.out.println(arr);
		
		System.out.println("\nSize of the container: " + container.size());
		
		System.out.println("\nRemove and toString methods:");
		System.out.println("String to remove: Today is Saturday, which means I'm going to a picnic with my friends.");
		container.remove("Today is Saturday, which means I'm going to a picnic with my friends.");
		System.out.println(container.toString());
		
		System.out.println("\nSize of the container: " + container.size());
		
		System.out.println("\nContains method:\nString: Today is Saturday, which means I'm going to a picnic with my friends.");
		System.out.println(container.contains("Today is Saturday, which means I'm going to a picnic with my friends."));
		
		System.out.println("\nAdd method:\nString to add: Today is Saturday, which means I'm going to a picnic with my friends.");
		container.add("Today is Saturday, which means I'm going to a picnic with my friends.");
		System.out.println(container.toString());
		
		System.out.println("\nCreating a second container:");
		Container container2 = new Container("The weather is very nice today.", 
				"I'm not going to school today.", 
				"Today is Saturday, which means I'm going to a picnic with my friends.", 
				"I hope the day goes well.");
		System.out.println(container2.toString());
		
		System.out.println("\nContainsAll method:\n"  + container.containsAll(container2));
		System.out.println("\nRemove string: The weather is very nice today. from the first container.");
		container.remove("The weather is very nice today.");
		
		System.out.println("\nContainsAll method:\n" + container.containsAll(container2));
		
		System.out.println("\nClearing the container.");
		container.clear();
	}
}
