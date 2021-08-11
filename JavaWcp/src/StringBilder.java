//StringBilderを利用し文字列を1万回連結
public class StringBilder {
	public static void main(String[] args) {
		StringBilder sb = new StringBilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
	}
}
