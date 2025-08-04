package lesson2_3.capsule.practice1;

public class Vehicle {
	// メンバ変数
	private String brand;
	protected int speed;
	
	// コンストラクタ
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	// getter, setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// 速度を増やすメソッド
	public void accelerate(int amount) {
		speed = speed + amount;
		// speed += amount;
	}
	
	// 速度を減らすメソッド
	public void brake(int amount) {
		speed -= amount;
	}
	
}
