//文字列の分割
public class StringSplit {
	public static void main(String[] args) {
		String s ="abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.println(w + "->");
		}
	}
}
