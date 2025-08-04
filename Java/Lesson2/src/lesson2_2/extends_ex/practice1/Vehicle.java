package lesson2_2.extends_ex.practice1;

public class Vehicle {
	//	Vehicleクラス（親クラス）
	//	・メンバ変数：String brand
	//	・コンストラクタを用意
	//	・メソッド
	//	　displayBrand：戻り値なし、パラメータなし
	//	　変数名(brand)に設定されたブランド名を コンソールに表示
	
	// メンバ変数
	String brand;

	// コンストラクタ
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	// ブランド名表示メソッド
	void displayBrand() {
		System.out.println(brand);
	}

}
