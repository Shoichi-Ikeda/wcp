//TreeSetから文字列を取り出すと…
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("Dog");
		words.add("Cat");
		words.add("Fox");
		words.add("Wolf");
		words.add("Panda");
	
		for (String s : words) {
			System.out.print(s + "→");
		}
	}
}
