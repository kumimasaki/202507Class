package lesson2_4.this_and_super;

// 親クラス
public class Person {
	// メンバ変数
	protected String name;
	protected int age;

	// コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// コンストラクタ2
	public Person() {
		// 別のコンストラクタの呼び出し
		this("noname", 0);
//		System.out.println("person");
	}
	
	// メソッド
	// display 戻り値無し、引数なし
	// 処理内容："person"をコンソールに出力
	public void display() {
		System.out.println("person");
	}

}
