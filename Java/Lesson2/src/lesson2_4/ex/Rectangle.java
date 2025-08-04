package lesson2_4.ex;

// 長方形（親クラス）
public class Rectangle {

	// 高さ height
	protected double height;
	// 幅 width
	protected double width;

	// コンストラクタ
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	// 面積を求めるメソッド「getArea」
	// 戻り値：double 引数：無し
	// 処理内容：高さ×幅を計算して結果を返す
	public double getArea() {
		return height * width;
	}

	// 周辺の長さを求めるメソッド「getPerimeterLength」
	// 戻り値：double 引数：無し
	// 処理内容：(高さ+幅)×2 を計算して結果を返す
	public double getPerimeterLength() {
		return (height + width) * 2;
	}
	
	// 面積と周辺の長さを出力するメソッド「display」
	// 戻り値、引数なし
	// 処理内容：下記のようにコンソールに表示する
	// 長方形の計算結果です。
	// 面積：○○ 、周辺の長さ：○○
	public void display() {
		System.out.println("長方形の計算結果です。");
		System.out.println("面積：" + this.getArea() + 
							"、周辺の長さ：" + getPerimeterLength());
	}
}
