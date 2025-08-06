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