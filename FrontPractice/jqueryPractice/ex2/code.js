$(function(){
    // <ol>の取得
    let list = $("#list");
    // 新しい<li>を作成
    let newLink = $("<li>");
    list.append(newLink);

    // 新しい<a>要素を追加
    let item = $("<a>");
    // 作成したaタグの中に文字を挿入
    item.html("developer.mozilla.org");
    // リストの末尾に追加
    newLink.append(item);

    // 要素の削除
    list.remove();

    // onClick
    // $("#button1").click(() => {
    //     console.log("ボタン１");
    // });

    // addEventListener
    $("#button1").on("click", () => {
        console.log("ボタン１");
        $("#text").css("color", "red");
    });

});