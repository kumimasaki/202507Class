package lesson1_3.for_statement;

public class Practice {

	public static void main(String[] args) {
		// 合計を入れる変数を初期化
		int sum = 0; 
		for (int i = 1; i < 21; i++) {
			// sum に i を加算
		    sum += i; 
		}
		// 結果を表示
		System.out.println("合計: " + sum); 
	}

}
