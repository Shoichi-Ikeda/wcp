import java.util.ArrayList;

public class ArrayList_Exmple {
	public static void main(String[] args) {
		//ArrayListを準備
		ArrayList<String> names = new ArrayList<String>();
		//3人を追加
		names.add("池田");
		names.add("藤村");
		names.add("安部");
		System.out.println(names.get(1));
	}
}
