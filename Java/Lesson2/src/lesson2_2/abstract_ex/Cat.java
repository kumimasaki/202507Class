package lesson2_2.abstract_ex;

public class Cat extends Animal {
	// メンバ変数
	String color;

	// コンストラクタ
	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "を食べます");
	}

}
