package lesson1_3.method;

public class Ex2 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		greeting("A", 20);
		greeting("B", 30);
	}

	// 挨拶をするメソッドの作成
	public static void greeting(String name, int age) {
		System.out.println(name + "さん、こんにちは！私は" + age + "歳です");
	}

}
