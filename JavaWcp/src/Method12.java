public class Method12 {
	public static void main(String[] args) {
		double triangleArea = calcTriangkeArea(12.3, 4.5);
		System.out.println("三角形の面積は：" + triangleArea + "平方cm");
		double circleArea = calcCircleArea(6.7);
		System.out.println("円の面積は：" + circleArea + "平方cm");
	}
	public static double calcTriangkeArea(double bottom, double height) {
		double TriangkeAreaAns = (bottom * height) / 2;
		return TriangkeAreaAns;
	}
	public static double calcCircleArea(double radius) {
		double CircleAreaAns = radius * radius * 3.14;
		return CircleAreaAns;
	}
}
