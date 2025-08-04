package lesson3_2.list_ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
		List<Cat> cats = new ArrayList<Cat>();
		// データの挿入
		// Cat alice = new Cat("Alice", 2);
		cats.add(new Cat("Alice", 2));
		cats.add(new Cat("Kitty", 5));
		System.out.println(cats);
		
		// toStringを使わない方法
		// 名前と年齢を表示
		System.out.println("名前は：" + cats.get(0).getName());
		System.out.println(cats.get(0).getAge());
		
		for(Cat data : cats) {
			System.out.println(data.getName());
		}
	}
}
