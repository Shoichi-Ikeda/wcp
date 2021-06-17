package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NoName01 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(-8);
		numbers.add(4);
		numbers.add(2);
		
		System.out.println(numbers);
		Collections.sort(
			numbers,
			new Comparator<Integer>() {
				@Override
				public int compare(Integer x, Integer y) {
					return Integer.compare(x, y);
				}
			});
		System.out.println(numbers);
	}
}
