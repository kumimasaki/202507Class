package lesson1_2.array;

public class Array2D {

	public static void main(String[] args) {
		// 二次元配列の宣言
		int[][] allScores = new int[2][3];
		
		allScores[0][0] = 30;
		allScores[1][2] = 50;
		
		System.out.println(allScores[0][0]);
		
		// 二次元配列の初期化
		int[][] array2D = {{2,4,6}, {8,10,12}};
		System.out.println(array2D[1][1]);
	}

}
