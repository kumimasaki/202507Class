package lesson1_3.overload;

public class Ex1 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		int result = add(2, 3);
	}
	
	// 2つの整数の値の合計を計算
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 1つの整数の値に1を加算
	public static int add(int num) {
		return num++;
	}
	
	// 2つの小数の値の合計を計算
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

}
