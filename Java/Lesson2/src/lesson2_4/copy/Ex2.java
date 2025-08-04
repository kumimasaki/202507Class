package lesson2_4.copy;

public class Ex2 {

	public static void main(String[] args) {
		// 文字列の比較
		String a = "Hello";
		String b = new String("Hello");

//		int[] test = { 1, 2, 3 };
//		System.out.println(test[7]);

		// 住所の比較
		System.out.println(a == b); // false
		// 値の比較★
		System.out.println(a.equals(b)); // true

		String name = "Taro";
		String userName = "Taro";
		// 住所の比較
		System.out.println(name == userName);
		// 値の比較★
		System.out.println(name.equals(userName));

		if (name.equals(userName)) {
			// ログイン
		} else {
			// ログインしない
		}
	}

}
