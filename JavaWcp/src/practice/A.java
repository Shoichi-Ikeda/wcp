package practice;

public class A {
	public String hello() {
		return "Hello A!";
	}
	public void main() {
		A b = new A() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}
}