import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main05_2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(now);
		System.out.println(now.format(fmt1));
		System.out.println(future.format(fmt2));
	}
}
