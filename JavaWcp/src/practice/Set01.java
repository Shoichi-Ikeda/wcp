package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {
	public static void main(String[] args) {
		//HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();
		//LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		//要素を追加する
		set1.add("スイカ");
		set1.add("メロン");
		
		//要素を取得する
		//Setには位置やキーなどの要素を特定する考え方がなく、あくまで集合。
		//要素を取り出したいときは繰り返し処理を用う。
		//拡張for文や、ラムダ式などを用いる。
		
		//要素の存在チェク
		set1.contains("スイカ");
		set1.contains("なし");
		
		//要素数の取得
		set1.size();
		
		//要素の削除
		set1.remove("スイカ");
		
			System.out.println(set1);
	}
}
