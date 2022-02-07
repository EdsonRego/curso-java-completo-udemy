package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Edson");
		list.add("Eva");
		list.add("Camilly");
		list.add("Leonardo");
		list.add("Vastir");
		
		list.add(2, "Gabriel");
		
		System.out.println(list.size());
		
		for(String obj :list) {
			System.out.println(obj);
		}
		
		System.out.println("-------------------");
		//list.remove("Leonardo");
		//list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'E');
		
		for(String obj :list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Eva"));
		System.out.println("Index of Marco: " + list.indexOf("Edson"));
		
		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		for (String x : result) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		}

}
