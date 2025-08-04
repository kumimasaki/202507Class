package lesson3_2.practice3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// マップの宣言
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Alice", 80);
		scores.put("Bob", 65);
		scores.put("Carol", 90);
		scores.put("Dave", 55);
		scores.put("Eve", 70);

		// 平均点の計算
		int total = 0;
		for (String name : scores.keySet()) {
			total += scores.get(name);
		}
		int average = total / scores.size();

		// 結果の出力
		System.out.println("平均点：" + average);
		System.out.println("平均点以上の生徒：");

		// 平均点以上の生徒の名前を表示
		for (String name : scores.keySet()) {
			if (scores.get(name) >= average) {
				System.out.println(name);
			}
		}
	}
}
