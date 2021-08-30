// webページの取得
import java.io.InputStream;
import java.net.URL;

public class GetWebpage {
	public static void main(String[] args) throws Exception {
		URL u = new URL("https://google.com/");
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}
	}
}
