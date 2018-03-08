window.addEventListener("load", function () {

    var findId = document.querySelector(".login-etc a:first-child");
    var findPassword = document.querySelector(".login-etc a:nth-child(2)");

    findId.onclick = function() {

        window.open("Popup/find-id", "아이디찾기", "width=500, height=350, location:no");
    };

    findPassword.onclick = function() {

        window.open("Popup/find-password", "비밀번호찾기", "width=350, height=400");
    };

});