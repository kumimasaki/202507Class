package lesson3_2.stream_ex.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Personのインスタンスを作成
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("tanaka", 28));
		personList.add(new Person("suzuki", 25));
		personList.add(new Person("izawa", 32));

		// for文
		for (Person data : personList) {
			System.out.println(data.getName() + "は" + data.getAge() + "歳");
		}

		// 1件目表示
		System.out.println("1件目は" + personList.get(0).getName() + "さんです。");

		// 並び替え
		System.out.println(
				personList.stream()
						.sorted((s1, s2) -> s1.getAge() - s2.getAge())
						.collect(Collectors.toList()));

		personList.stream()
				.sorted((s1, s2) -> s1.getAge() - s2.getAge()) // 小⇒大
				.forEach(e -> System.out.println(e.getName() + "は" + e.getAge() + "歳"));

	}

}
