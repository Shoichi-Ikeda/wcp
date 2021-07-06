public class Hungry {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "Pizza";
		System.out.println("こんにちは！");
		/*
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです。");
		}
		else {
			System.out.println("はらぺこです。");
		}
		*/
		//書き換えると↓↓↓
		System.out.println(isHungry == 0 ? "お腹がいっぱいです。" : "はらぺこです。");
		if (isHungry == 1) {
			System.out.println(food + "をいただきます。");
		}
		System.out.println("ごちそうさまでした。");
	}
}
