// 要素の取得
let result = document.getElementById("label");
let button1 = document.getElementById("change-text1");
let button2 = document.getElementById("change-text2");
let button3 = document.getElementById("change-text3");

// 「値：」を定数で保持
const BASE_TEXT = "値：";
// 計算結果を格納する変数
let resultValue = 0;

// 値を表示するメソッド
function display(){
    result.innerHTML = BASE_TEXT + resultValue;
}

// 値を計算するためのメソッド
function calc(value){
    resultValue = resultValue + value;
}

// リセットボタンをクリック
button1.addEventListener("click", () => {
    resultValue = 0;
    display();
});

//１を加算した時
button2.addEventListener("click", () => {
    calc(1);
    display();
});

//１を減算した時
button3.addEventListener("click", () => {
    calc(-1);
    display();
});