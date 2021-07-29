public class Main02 {
	public static void main(String[] args) {
		/*
	 	Hero h1 = new Hero();
		Hero h2 = new Hero();
		Thief t1 = new Thief();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
		//冒険開始
		//宿屋に泊まる
		h1.hp += 50;
		h2.hp += 50;
		t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;
		*/
		Character[] c = new Character[5]; //配列を使う
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		//宿屋に泊まる
		for (Character ch : c) { //1名ずつ順に取り出し
			ch.hp += 50;         //HPを50回復する
		}
	}
}
