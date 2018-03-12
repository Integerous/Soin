window.addEventListener("load", function () {

    var findId = document.getElementById("find-id");
    var findPassword = document.getElementById("find-pw");

    findId.onclick = function() {

        window.open("Popup/find-id", "아이디찾기", "width=500, height=350, location:no");
    };

    findPassword.onclick = function() {

        window.open("Popup/find-password", "비밀번호찾기", "width=500, height=350, location:no");
    };

});