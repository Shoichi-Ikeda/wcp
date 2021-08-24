//HashMapクラスの利用
import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		//ペアで値を格納
		prefs.put("山口県", 138);
		prefs.put("東京都", 1396);
		prefs.put("福岡県", 511);
		prefs.put("大阪府", 882);
		prefs.put("北海道", 528);
		prefs.put("沖縄県", 146);
		
		int Yamaguchi = prefs.get("山口県"); //キーを指定し値を取得
		System.out.println("山口県の人口は" + Yamaguchi);
		prefs.remove("東京都");
		prefs.put("福岡県", 510); //値を510に上書き
		int Fukuoka = prefs.get("福岡県");
		System.out.println("福岡県の人口は" + Fukuoka);
	}
}
