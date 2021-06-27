
public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 1234567890123456789L;
		double double1 = 1234567.89;
		double double2 = 1234567.89d;
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(double2);
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		Float float1 = 0.123f;
		Integer integer1 = 2147483647;
		Character chara1 = 'キ';
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(chara1);
		
		int[] array = new int[5]; // 配列の宣言と生成
		array[0] = 10; // インデックス番号「0」を指定して１番目の要素にデータを代入
		array[4] = 20;
		array[1] = 30;
		array[3] = 40;
		array[2] = 50;
		System.out.println(array[3]);
	}
}
