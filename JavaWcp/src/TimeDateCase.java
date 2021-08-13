//現在日時を表示する
import java.util.Date;

public class TimeDateCase {
	public static void main(String[] args) {
		Date now = new Date(); //現在の日時を取得
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
	}
}
