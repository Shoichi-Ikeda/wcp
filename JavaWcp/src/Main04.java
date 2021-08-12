//StringBilderを利用し文字列を1万回連結
public class Main04 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
