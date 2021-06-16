package practice;

public class Basket01<E> {
	private E elem;
		
	Basket01(E e) {
		elem = e;
	}
	void replace(E e) {
		elem = e;
	}
	E get() {
		return elem;
	}
	public static void main(String[] args) {
		Basket01<Apple> appleBasket = new Basket01<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());
	}
}
