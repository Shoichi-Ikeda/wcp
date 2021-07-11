public class Method11 {
	public static void email(String address, String text) {
		System.out.println(address + "宛てに以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	//↓↓↓以下Method10.java↓↓↓
	public static void email(String title, String address, String text) {
		System.out.println(address + "宛てに以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	//↑↑↑ここまで↑↑↑
	public static void main(String[] args) {
		String address = "thanks@com";
		String text = "ありがとうございました。";
		email(address, text);
	}
}
