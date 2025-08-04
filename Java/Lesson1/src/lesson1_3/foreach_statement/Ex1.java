package lesson1_3.foreach_statement;

public class Ex1 {

	public static void main(String[] args) {
//		// 配列の初期化
//		int[] scores = { 30, 40, 50 };
//		// 拡張for文
//		for (int score : scores) {
//			System.out.println(score);
//		}
		
//		String name = null;
//		System.out.println(name);
		
		// 文字列配列を作成
		// 配列名「names」
		// 拡張for文で全ての名前を表示
		String[] names = {"Alice", "Bob","Carol"};
		names[1] = null;
		for (String name : names) {
			System.out.println(name);
		}
	}

}
