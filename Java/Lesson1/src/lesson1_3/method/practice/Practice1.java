package lesson1_3.method.practice;

public class Practice1 {

	public static void main(String[] args) {
		// メソッドを呼び出し、戻り値をコンソールに表示してください。
		int result = calculateSum(5, 3);
		System.out.println("合計: " + result);
		
	}

	// 2つの整数（num1, num2）を引数として受け取り、
	// その合計を返すメソッド calculateSum を書いてください。
	public static int calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
