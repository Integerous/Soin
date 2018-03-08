window.addEventListener("load", function () {

		var idCkBtn = document.getElementById("id-check");
		var idInput = document.querySelector("input[name='id']")
		//var NameCkBtn = document.getElementById("name-check");

		idCkBtn.onclick = function() {
			
			var ckId = idInput.value;
			

			if(ckId=="")
			{
				alert("내용을 먼저 입력하셔야 합니다.");
				return;
			}
			
			var request = new XMLHttpRequest();
			
			request.open("GET", "idcheck?ckId="+ckId, false);
			request.send();

			alert(request.responseText);

		};

});