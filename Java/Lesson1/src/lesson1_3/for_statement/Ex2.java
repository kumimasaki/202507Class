package lesson1_3.for_statement;

public class Ex2 {

	public static void main(String[] args) {
		// 一次元配列の初期化
		int[] array = { 10, 20, 30, 40 };

		// for文
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 二次元配列の初期化
		int[][] allScores = { { 1, 2, 3 }, { 4, 5, 6 } };
		for(int i = 0; i < allScores.length; i++) {
			for(int j = 0; j < allScores[i].length; j++) {
				System.out.println(allScores[i][j]);
			}
		}
		
		for (int[] score : allScores) {
		    for (int value : score) {
		        // 結果を表示
		        System.out.println(value);
		    }
		}

	}

}
