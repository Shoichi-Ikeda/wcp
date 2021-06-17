package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NoName02 {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("tiger");
		animals.add("jager");
		animals.add("leopard");
		
		System.out.println(animals);
		Collections.sort(
			animals,
			new Comparator<String>() {
				@Override
				public int compare(String x, String y) {
					return x.compareTo(y);
				}
			});
		System.out.println(animals);
	}
}
