//String型とDate型の相互変換
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSimpleDateFormat {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	//文字列からDateインスタンスを生成
	Date d = f.parse("1989/07/19 07:19:07");
	System.out.println(d);
	//Dateインスタンスから文字列を生成
	Date now = new Date();
	String s = f.format(now);
	System.out.println("現在は" + s + "です。");
	}
}