package lesson1_3.method;

public class Ex3 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		int result = calculatingChange(300, 1000);
		System.out.println(result);
		
		// エスケープシーケンス
		System.out.println("お釣りは\"1000円\"です");
		
//		System.out.println(calculatingChange(300, 1000));
		
	}

	// お釣りを計算するメソッド
	public static int calculatingChange(int totalPrice, int payment) {
		int change = payment - totalPrice;
		return change;
		
//		return payment - totalPrice;
	}

}
