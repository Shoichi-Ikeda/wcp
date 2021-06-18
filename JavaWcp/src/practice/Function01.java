package practice;

public class Function01 {
	//アノテーションをつけたインターフェイスを用意
    @FunctionalInterface
    interface FunctionPointer {
        void helloWorld(String subject, String name);
    }
    //用意したインターフェイスを使う
    public static void helloFromFunction(String subject, String name, FunctionPointer functionPointer){
        functionPointer.helloWorld(subject, name);
    }
    //インターフェイスの共通する関数を用意
    public static void hello(String subject, String name){
        System.out.println("Hello " + subject + ", I'm " + name + ". ");
    }
    public static void main(String[] args) {
    	//helloFromFunction関数へラムダ式を渡す
        helloFromFunction("world", "wrongwrong", (subject, name) -> System.out.println("Hello " + subject + ", I'm " + name + "."));
        helloFromFunction("world", "wrongwrong", Function01::hello);
    }
}