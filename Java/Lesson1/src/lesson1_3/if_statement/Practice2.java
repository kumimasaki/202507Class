package lesson1_3.if_statement;

public class Practice2 {

	public static void main(String[] args) {
		// 変数を初期化
		int side1 = 3;
		int side2 = 3;
		int side3 = 3;

		// 3辺の長さから三角形の種類を判定
		if (side1 == side2 && side2 == side3) {
			// すべての辺が等しい場合
			System.out.println("正三角形です");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			// 2辺が等しい場合
			System.out.println("二等辺三角形です");
		} else {
			// すべての辺が異なる場合
			System.out.println("不等辺三角形です");
		}
	}

}
