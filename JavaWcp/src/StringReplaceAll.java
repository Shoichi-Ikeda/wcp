//文字列の置換
public class StringReplaceAll {
	public static void main(String[] args) {
		String s = "rensuke,shoichi:yuuumi";
		String w = s.replaceAll("[sui]", "X");
		System.out.println(w);
	}
}