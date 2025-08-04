package week1_masaki;

public class Practice2 {

	public static void main(String[] args) {
		// メソッドの呼び出し
		// 三角形の面積を求めるメソッドの呼び出し
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println(triangleArea);

		// 円の面積を求めるメソッドの呼び出し
		System.out.println(calcCircleArea(5.0));
	}

	// 三角形の面積を求めるメソッド
	public static double calcTriangleArea(double base, double height) {
		double result = base * height / 2;
		return result;
	}

	// 円の面積を求めるメソッド
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
