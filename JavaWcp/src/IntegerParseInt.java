//文字列(String型)を数値(int型)に変換する命令
public class IntegerParseInt {
	public static void main(String[] args) {
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは今年の7月で、" + (n + 1) + "歳。");
		System.out.println("来年で、" + (n + 2) + "歳になりますね。");
	}
}
