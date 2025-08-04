package lesson1_3.method.practice;

public class Practice4 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		String result = checkParity(3);
		System.out.println(result);
		System.out.println(checkParity(2));
	}
	
	// 整数のパリティを確定するメソッドを作成
	public static String checkParity(int num) {
		// 変数を初期化
//		String result = null;
		// 偶数か奇数かを判定
		if (num % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
//		return result;
	}

}
