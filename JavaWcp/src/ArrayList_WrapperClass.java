import java.util.ArrayList;

public class ArrayList_WrapperClass {
	public static void main(String[] args) {
		//Integer型でArrayListを宣言
		ArrayList<Integer> points = new ArrayList<Integer>();
		//追加されたpointsは自動的にIntegerに変換・格納される
		points.add(10);
		points.add(80);
		points.add(75);
		
		for (int i : points) { //拡張for文も利用可能
			System.out.println(i);
		}
	}
}
