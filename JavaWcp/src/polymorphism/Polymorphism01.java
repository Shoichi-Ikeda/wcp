package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism01 {
	public static void main(String[] args) {
		Human human01 = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + human01.getProfile());
		
		Human human02 = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド:プロフィールを紹介します。" + human02.getProfile());
	}
}
