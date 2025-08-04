package lesson3_2.lamda_ex;

public class Ex2 {

	public static void main(String[] args) {
		// ラムダ式の書き方
//		Introduce i = (String name, String hobby) -> {
//			String hello = "name:" + name + " hobby:" + hobby;
//			return hello;
//		};
		// ①定数として認識
		int num = 0;
		// ②引数と同名の定数は定義できない
//		String name = "";
		// ラムダ式の省略形
		Introduce i = (name, hobby) -> {
//			num = 2;
			String hello = "name:" + name + " hobby:" + hobby;
			return hello;
		};

		// 呼び出し
		System.out.println(i.intro("Alice", "Game"));
	}
}
