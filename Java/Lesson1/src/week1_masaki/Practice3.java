package week1_masaki;

public class Practice3 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] array = {5, 3, 9, 1, 7};
		// メソッドの呼び出し
		int max = findMax(array);
		System.out.println("Maximum value in the array: " + max);
	}
	
	// 最大値を求めるメソッド
	public static int findMax(int[] array) {
		// 最大値の初期値を設定する
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			// もし、array[i]の値がmaxの値よりも大きい場合
			if(array[i] > max) {
				// maxの値をarr[i]の値で上書きをしてmaxの値を更新する
				max = array[i];
			}
		}
		
//		for(int data : array) {
//			if(data > max) {
//				max = data;
//			}
//		}
		
		return max;
	}

}
