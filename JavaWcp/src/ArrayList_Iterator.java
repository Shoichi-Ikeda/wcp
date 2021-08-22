import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("優海");
		names.add("蓮丞");
		names.add("翔一");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
}
