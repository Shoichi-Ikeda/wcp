//文字列切り出しメソッドを利用
public class StringCutout {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目は" + s1.charAt(3));
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4から8文字目は" + s1.substring(3, 8));
	}
}
