package lesson2_1.practice4;

public class Student {
	// メンバ変数
	// 名前
	String name;
	// 国語
	int japanese;
	// 数学
	int math;
	// 英語
	int english;

	// コンストラクタ
	public Student(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	// 結果を表示するメソッド
	void show() {
		System.out.println(name + ":" + japanese + "," + math + "," + english);
	}
}
