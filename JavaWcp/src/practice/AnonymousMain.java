package practice;

public class AnonymousMain {
    public static void main(String[] args) {
    	// 匿名クラス作成（クラスの継承）
    	AnonymousClass ac = new AnonymousClass(){
    		public void print() {
    			System.out.println("Anonymous:" + getSTR());
            }
        };
        ac.print();
        // 匿名クラス作成（インターフェースの実装）
        AnonymousInterface ai = new AnonymousInterface() {
        	public void print() {
        		System.out.println("Anonymous:Hello Interface!");
            }
        };
        ai.print();
    }
}
