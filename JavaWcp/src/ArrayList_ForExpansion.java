//拡張for文を使ったArrayListの繰り返し処理
import java.util.ArrayList;

public class ArrayList_ForExpansion {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("優海");
		names.add("蓮丞");
		names.add("翔一");
		
		for (String s : names) {
			System.out.println(s);
		}
	}
}
