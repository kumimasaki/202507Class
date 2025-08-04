package lesson1_3.method.practice;

public class Practice3 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] array = { 5, 10, 15, 20 };
		// メソッドの呼び出し
		double average = calculateAverage(array);
		// 結果表示
		System.out.println("平均値: " + average);
	}

	// 配列のすべての要素の平均値を計算するメソッド
	public static double calculateAverage(int[] arr) {
		// 変数を初期化
		int sum = 0;
		// 合計を計算
		for(int i= 0;i< arr.length;i++) {
			sum = sum + arr[i];
		}
		// 平均を計算
		double result = (double)sum / arr.length;
		return result;
	}

}
