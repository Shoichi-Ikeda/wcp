package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		// HashMapを生成する場合
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// TreeMapを生成する場合
		Map<String, String> map2 = new TreeMap<String, String>();
		
		//要素を追加する
		map1.put(0, "ぶどう");
		map1.put(2, "いちご");
		map1.put(3, "もも");
		//登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		
			System.out.println(map1);
		
		//要素を取得する
		map1.get(0);
		map1.get(1);
		map1.get(2);
		
		//キーの存在チェック
		map1.containsKey(0);
		map1.containsKey("ぶどう");
		
		//要素数の取得
		map1.size();
		
		//キーを指定して要素を削除する
		map1.remove(0);
		//キーと値を指定して要素を削除する
		map1.remove(3, "もも");
		
			System.out.println(map1);
	}

}
