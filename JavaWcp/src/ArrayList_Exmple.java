import java.util.ArrayList;

public class ArrayList_Exmple {
	public static void main(String[] args) {
		//ArrayListを準備
		ArrayList<String> names = new ArrayList<String>();
		//3人を追加
		names.add("優海");
		names.add("蓮丞");
		names.add("翔一");
		System.out.println(names.get(1));
	}
}
