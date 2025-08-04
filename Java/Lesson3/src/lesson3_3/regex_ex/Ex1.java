package lesson3_3.regex_ex;

import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {

		String str = "Aoasle";

		// Stringクラスのmatchesメソッド
		System.out.println(str.matches("A.*le"));

		// Patternクラスのmatchesメソッド
		System.out.println(Pattern.matches("A[pqr]+le", str));

		// 呼び出し
		if (valid("Apple")) {
			System.out.println("一致しました");
		} else {
			// エラー処理
		}

	}

	// 正規表現チェックメソッド
	public static boolean valid(String str) {
		return str.matches("A.*le");
	}

}
