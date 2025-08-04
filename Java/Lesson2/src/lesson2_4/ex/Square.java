package lesson2_4.ex;

// 正方形（子クラス）
public class Square extends Rectangle{

	// コンストラクタ
	public Square(double height) {
		super(height, height);
	}
	
	// displayメソッドのオーバーライド
	// 戻り値、引数なし
	// 処理内容：下記のようにコンソールに表示する
	// 正方形の計算結果です。
	// 面積：○○ 、周辺の長さ：○○
	@Override
	public void display() {
		System.out.println("正方形の計算結果です。");
		System.out.println("面積：" + super.getArea() + 
							"、周辺の長さ" + getPerimeterLength());
//		super.display();
	}

	
}
