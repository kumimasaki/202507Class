package lesson2_2.extends_ex;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Cat alice = new Cat("Alice", 5, "bliack");
		System.out.println(alice.name);
		alice.eat("キャットフード");
		alice.sounds();
		alice.run();
		
		// Dogクラスのインスタンスを作成(引数は適当)
		Dog bob = new Dog("Bob", 10, "red");
		// Animalクラスの振る舞い(eatメソッド)を呼び出し
		bob.eat("ドッグフード");
		// Dogクラスの色を表示
		System.out.println(bob.color);
		bob.run();
		
		// ポリモーフィズム（多態性）
		Animal kitty = new Cat("Kitty", 4, "white");
		// Animalしか見れない + 猫独自のものなので使うことはできない
//		System.out.println(kitty.color);
		
		System.out.println(kitty.age);
		kitty.sounds();
		
		// ポリモーフィズムのメリット
		Animal[] animals = {
				new Cat("Alice", 1, "white"),
				new Dog("Bob", 2, "black")
		};
		
		// for-each(拡張for文)
		for (Animal a : animals) {
			a.sounds();
		}
		
		// toStringの必要性
		System.out.println(kitty);
		
		// インターフェースはインスタンス化できない
//		Runnable run = new Runnable();
	}

}
