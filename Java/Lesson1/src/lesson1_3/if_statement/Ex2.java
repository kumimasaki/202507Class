package lesson1_3.if_statement;

public class Ex2 {

	public static void main(String[] args) {
		// もし、scoreが90点より大きければ「A評価」
		// そうではなく、もし点数が60点より大きければ「B評価」
		// そうではなく、もし点数が30点より大きければ「C評価」
		// それ以外は「不合格」
		int score = 80;

		if (score > 90) {
			System.out.println("A評価");
		} else if (score > 60) {
			System.out.println("B評価");
		} else if (score > 30) {
			System.out.println("C評価");
		} else {
			System.out.println("不合格");
		}
		
		
		int a = 0;
		int b = 0;
		if (a++ > 0 || ++b > 0) {
			System.out.println(a); 
			System.out.println(b); 
		}
		
		if (score > 90) 
			System.out.println("A評価");
			System.out.println("B評価");
		
		if (true) {
			System.out.println("A");
		}
		
		if (false) {
			System.out.println("A");
		}
		
	}

}
