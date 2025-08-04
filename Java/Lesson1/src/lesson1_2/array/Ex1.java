package lesson1_2.array;

public class Ex1 {

	public static void main(String[] args) {
		// 配列変数の宣言と代入を同時に行う
		int[] scores = new int[5];
		// 要素0番目の箱に値を入れる
		scores[0] = 70;
		System.out.println(scores[0]);
		// 要素3番目の箱に値:30を入れる
		scores[3] = 30;
		System.out.println(scores[3]);
	}

}
