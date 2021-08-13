//6つのint値とDate型の相互互換
import java.util.Calendar;
import java.util.Date;

public class TimeCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(1993, 7, 11, 17, 33, 30);
		c.set(Calendar.MONTH, 7); //月を7(8月)に変更
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です。");
	}
}
