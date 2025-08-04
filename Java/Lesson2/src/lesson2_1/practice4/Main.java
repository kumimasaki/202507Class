package lesson2_1.practice4;

public class Main {

	public static void main(String[] args) {
		// 配列を宣言
		Student[] students = new Student[2];
		// インスタンス作成
		students[0] = new Student("タロウ", 80, 75, 90);
		students[1] = new Student("ハナコ", 90, 70, 80);
		// 結果を表示
		System.out.println("成績表");
		for(int i = 0; i < students.length; i++) {
			students[i].show();
		}
		
		for(Student student : students) {
			student.show();
		}
	}
}
