public class Method10 {
	public static void email(String title, String address, String text) {
		System.out.println(address + "宛てに以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	public static void main(String[] args) {
		String title = "御礼";
		String address = "thanks@com";
		String text = "ありがとうございました。";
		email(title, address, text);
	}
}
