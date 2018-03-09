window.addEventListener("load", function () {

		var idCkBtn = document.getElementById("id-check");
		var idInput = document.querySelector("input[name='id']")
		//var NameCkBtn = document.getElementById("name-check");
		var imageButton = document.getElementById("image-button");
		var imageFileButton = document.getElementById("image-file-button");


		/*imageButton.onclick = function(){

			var event = new MouseEvent("click", { 
				view: window,
				bubbles: true,
				cancelable: true
			});

			imageFileButton.dispatchEvent(event);

		};

		imageFileButton.onchange = function(e)
		{
			var images = imageFileButton.files;
			
			var typeParts = images[0].type.split("/");
			
			if(typeParts[0] != "image" || typeParts[0] == undefined)
			{
				alert("이미지 파일만 업로드할 수 있습니다.");
				return;
			}
			
			if(images[0].size > 1024*1024*3)
			{
				alert("3MB 이하의 파일만 올릴 수 있습니다.");
			}
			
		};
*/


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