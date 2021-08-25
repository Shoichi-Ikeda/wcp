// 例外処理を用意していないと…
import java.io.FileWriter;
import java.io.IOException;

public class Exception {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました。"); //例外的状況になあった時に備えて記述された代替処理
		}
	}
}
