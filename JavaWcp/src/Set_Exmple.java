//Setに重複した値を追加しようとすると…
import java.util.HashSet;
import java.util.Set;

public class Set_Exmple {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黃");
		colors.add("赤"); //重複して「赤」を収納しようとしても無視される
		System.out.println("色は" + colors.size() + "種類");
		
		//Setから要素を取り出すと…
		for (String s : colors) {
			System.out.print(s + "→");
		}
	}
}
