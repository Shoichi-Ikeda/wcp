//LocalDateTimeの利用例
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTime_Exmple {
	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now(); //現在日時を取得
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		
		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(z1);
		System.out.println(l3);
	}
}
