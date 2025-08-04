package lesson3_2.practice5;

public class Main {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        // サンドイッチメニューの表示
        manager.showMenu("sandwich");
        // サンドイッチメニューにビッグバーガーを追加
        manager.setMenu("sandwich", "ビッグバーガー");
        // サンドイッチメニューの表示
        manager.showMenu("sandwich");
        // 「ホットミルク」をメニューから検索
        manager.searchMenu("ホットミルク");
        // 「オレンジジュース」をメニューから検索
        manager.searchMenu("オレンジジュース");
    }
}