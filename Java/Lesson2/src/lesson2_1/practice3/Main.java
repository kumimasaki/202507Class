package lesson2_1.practice3;

public class Main {

	public static void main(String[] args) {
		// 2つインスタンスを作成する。下記を引数として渡す。
		// 1つ目のインスタンス作成：半径 = 2.0
		Circle circle1 = new Circle(2.0);
		// 2つ目のインスタンス作成：半径 = 10.0
		Circle circle2 = new Circle(10.0);
		// 円の面積を求めた結果をコンソールに2つ表示してください。
		// 実行結果
		// 12.56
		// 314.0
		double result1 = circle1.area();
		System.out.println(result1);
		System.out.println(circle2.area());
		
		Circle[] circles = new Circle[2];
		circles[0] = new Circle(10.5);
		circles[1] = new Circle(5.5);
		
	}

}
