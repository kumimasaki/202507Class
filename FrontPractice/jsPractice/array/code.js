// 配列の初期化
let arr = [1, 2, 3, "Alice", 12.5];
// 中身の確認
console.log(arr);

// 配列に値を追加
arr.push("追加しました");
console.log(arr);
console.log(arr.length);
// 配列の一番最後のデータを削除
arr.pop();
console.log(arr);

// 配列の作成
let arr2 = new Array(5);
// 0番目の要素を「12」で上書き
arr2[0] = 12;
// 1番目の要素を「"hello"」で上書き
arr2[1] = "hello";
// コンソールに出力
console.log(arr2);