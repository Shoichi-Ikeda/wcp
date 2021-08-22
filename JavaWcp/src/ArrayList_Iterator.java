//Iteratorを使ったArrayListの繰り返し処理
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("優海");
		names.add("蓮丞");
		names.add("翔一");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) { //矢印を次に進められるなら繰り返す
			String e = it.next(); //矢印を次に進め繰り返す
			System.out.println(e);
		}
	}
}
