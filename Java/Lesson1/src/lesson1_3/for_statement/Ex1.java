package lesson1_3.for_statement;

public class Ex1 {

	public static void main(String[] args) {
		// 0,1,2,3,4を表示させる
		// 初期値 i：0
		// 繰り返し条件 i < 5
		// 繰り返し時処理　iが1ずつ増える
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		// 2,4,6,8をコンソールに表示させる
		for (int i = 2; i < 9; i += 2) {
			if(i == 4) {
				System.out.println("通過しました！");
			}
			System.out.println(i);
		}
		
		// 1～10までの数字をコンソールに表示させる
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
	}

}
