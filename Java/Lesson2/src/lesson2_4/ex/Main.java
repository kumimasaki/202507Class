package lesson2_4.ex;

public class Main {

	public static void main(String[] args) {
		// Rectangleクラスのインスタンス作成（10.0, 20.0）
		Rectangle rectangle = new Rectangle(10.0, 20.0);
		// displayメソッド呼び出し
		rectangle.display();
		
		// Squareクラスのインスタンス作成（10.0）
		Square square = new Square(10.0);
		// displayメソッド呼び出し
		square.display();
	}

}
