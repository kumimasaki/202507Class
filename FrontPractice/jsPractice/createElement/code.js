// 要素を取得
let list = document.getElementById("list");

// 新しいliを作成
let item = document.createElement("li");
list.append(item);
// 新しい要素の作成
let newItem = document.createElement("a");
// 内容を挿入
newItem.innerHTML = "developer.mozilla.org";
// 最後挿入
item.append(newItem);

// 削除したい要素を取得
let removeLink = document.getElementById("link-3");
// 要素の削除
// removeLink.remove();
// 子から見た親を消す
removeLink.parentNode.remove();

// ボタンをクリックしたら「ボタン1をクリックしました」をコンソールに表示
// 要素を取得
let btnEvent = document.getElementById("button-1");
// 書き方１
/**対象の要素.onclick = function() {
  // ここに#buttonをクリックしたら発生させる処理を記述する
}; */
// btnEvent.onclick = function(){
//     console.log("ボタン1をクリックしました")
// };
// btnEvent.onclick = function(){
//     console.log("ボタン1をクリックしました2")
// };

// 書き方２
// 対象の要素.addEventListener(種類, function() {
//    // 処理を記述
//  }, false);
// 対象の要素.addEventListener(種類, () => {
//   // 処理を記述
// });

btnEvent.addEventListener("click", () => {
    console.log("ボタン1をクリックしました");
});
btnEvent.addEventListener("click", () => {
    console.log("ボタン1をクリックしました2");
});

// helloメソッドの作成
// 処理内容：コンソールに「hello」を出力
function hello(){
    console.log("hello");
}

// クリックイベント
document.getElementById("btnClick").addEventListener("click", () => {
    console.log("クリックされました");
});

// ダブルクリックイベント
// イベント名「dblclick」
// 出力内容：「ダブルクリックされました」
document.getElementById("btnDblClick").addEventListener("dblclick", () => {
    console.log("ダブルクリックされました");
});

// 入力イベント（キーボード入力）
document.getElementById("textInput").addEventListener("input", (e) => {
    console.log("入力されました：", e.target.value);
});

// セレクトボックスの選択イベント
document.getElementById("selectMenu").addEventListener("change", (e) => {
    console.log("選択された値：", e.target.value);
});

// マウスが要素に乗ったとき
document.getElementById("hoverBox").addEventListener("mouseover", () => {
    console.log("マウスがのりました");
});

// マウスが要素から離れたとき
document.getElementById("hoverBox").addEventListener("mouseout", () => {
    console.log("マウスが離れました");
});