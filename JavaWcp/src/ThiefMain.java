public class ThiefMain {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	public static void main(String[] args) {
		int baseHP = 25;
		Thief t = new Thief("池田", baseHP);
		System.out.println(baseHP + ":" + t.hp);
		heal(baseHP);
		heal(t);
		System.out.println(baseHP + ":" + t.hp);
	}
}
