public class Constants01 {
	public static class Cat {
		public static final String NAME = "猫";
		public static final int LEG_COUNT = 4;
	}
	public static class Octopus {
		public static final String NAME = "蛸";
		public static final int LEG_COUNT = 8;	
	}
	public static void main(String[] args) {
		System.out.println(Constants01.Cat.NAME);
		System.out.println(Constants01.Cat.LEG_COUNT);
		System.out.println(Constants01.Octopus.NAME);
		System.out.println(Constants01.Octopus.LEG_COUNT);
	}
}
