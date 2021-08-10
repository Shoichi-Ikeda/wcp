//文字列切り出しメソッドを利用
public class StringCutout {
	public static void main(String[] args) {
		String s1 = " Java programming ";
		System.out.println("文字列s1の4文字目は" + s1.charAt(4));
		System.out.println("文字列s1の4文字目以降は" + s1.substring(4));
		System.out.println("文字列s1の4から8文字目は" + s1.substring(4, 9)); //※位置指定9の文字は含まれない
		//文字列変換のメソッドを利用
		System.out.println("文字列s1の大文字を小文字に変換" + s1.toLowerCase());
		System.out.println("文字列s1の小文字を大文字に変換" + s1.toUpperCase());
		System.out.println("文字列s1の前後の空白を除去" + s1.trim());
	}
}
