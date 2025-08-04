package lesson2_2.extends_ex.practice1;

public class Car extends Vehicle{

	//	Carクラス（子クラス）
	//	・Vehicleクラスを継承
	//	・メンバ変数は無し
	//	・コンストラクタ
	//	　親クラスのメンバ変数：brandにアクセスできるようにコンストラクタを記載
	//	・Carクラス独自のメソッド
	//	　drive：戻り値なし、パラメータなし
	//	　”car is driving” という文言をコンソールに表示
	
	// コンストラクタ
	public Car(String brand) {
		super(brand);
	}
	
	// 文字列表示メソッド
	void drive() {
		System.out.println("car is driving");
	}
}
