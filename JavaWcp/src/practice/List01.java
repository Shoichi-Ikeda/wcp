package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		// ArrayListを生成する場合
		//インデックス指定で要素を取り出すのはArrayListの方が速い
		//先頭から順に処理をするのはArrayListの方が速い
		List<String> list1 = new ArrayList<String>();
		// LinkedListを生成する場合
		//要素の挿入はLinkedListの方が速い
		//要素の削除はLinkedListの方が速い
		List<Integer> list2 = new LinkedList<Integer>();
		// 要素を追加する
		list1.add("りんご");
		list1.add("みかん");
		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");
			System.out.println(list1);
		
		// 要素を取得する
		list1.get(0);
		
		//拡張for文
		list2.add(123);
		list2.add(456);
		list2.add(789);
		
		for (Integer num : list2) {
			System.out.println(num);
		}
		
		// 存在チェック (trueを返す)
		list1.contains("バナナ");
		// 存在チェック (falseを返す)
		list1.contains("なし");
		
		//要素数の取得
		list1.size();
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ");
		// 位置を指定して要素を削除する
		list1.remove(0);
		
			System.out.println(list1);

	}
}
