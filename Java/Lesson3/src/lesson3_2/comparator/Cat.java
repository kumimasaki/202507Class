package lesson3_2.comparator;

public class Cat {
	// メンバ変数
	// 名前
	private String name;
	// 体重
	private double weight;
	
	// コンストラクタ
	public Cat(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// toStringのオーバーライド
	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + "]";
	}
}
