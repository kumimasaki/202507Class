package lesson2_3.capsule;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Bank bank = new Bank("Alice", 10000, 1234);
		// ユーザー名を表示
		System.out.println(bank.userName);
		// 残高を表示
//		System.out.println(bank.balanceOfBank);
		
		// 残高を取得して表示
		System.out.println(bank.getBalanceOfBank());
		// 残高に「50000」を再設定
		bank.setBalanceOfBank(50000);
		System.out.println(bank.getBalanceOfBank());
		
		// パスワードに「12345678」を再設定
		bank.setPassword(12345678);
		// パスワードを取得して表示
		System.out.println(bank.getPassword());
	}

}
