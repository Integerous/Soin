window.addEventListener("load", function () {
    
    var agrPop01 = document.getElementById("agree-cln-01");
    var agrPop02 = document.getElementById("agree-cln-02");
    var agrPop03 = document.getElementById("agree-cln-03");
	
    agrPop01.onclick = function () {

        window.open("../../Member/Common/Popup/agree-cln01","동의창1", "width=540, height=600");
        
    };

    agrPop02.onclick = function () {

        window.open("../../Member/Common/Popup/agree-cln02","동의창2", "width=540, height=600");
        
    };

    agrPop03.onclick = function () {

        window.open("../../Member/Common/Popup/agree-cln03","동의창3", "width=540, height=600");
        
    };
    
});