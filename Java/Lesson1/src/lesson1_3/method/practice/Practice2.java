package lesson1_3.method.practice;

public class Practice2 {

	public static void main(String[] args) {
		// メソッド呼び出し
		int length = calculateStringLength("Hello");
		System.out.println("文字列の長さ: " + length);
	}

	// 文字列の長さを返すメソッド
	public static int calculateStringLength(String str) {
		return str.length();
	}

}
