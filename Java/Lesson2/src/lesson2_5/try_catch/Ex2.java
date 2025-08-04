package lesson2_5.try_catch;

public class Ex2 {

	public static void main(String[] args) {
		try {
			test();
		} catch (NullPointerException e) {
			System.out.println("エラーが発生しました");
		}
	}

	public static void test() throws NullPointerException {
		// 無理やりエラーを発生させる
		throw new NullPointerException();
	}

}
