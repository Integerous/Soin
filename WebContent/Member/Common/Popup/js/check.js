window.addEventListener("load", function () {

	var idInput = document.querySelector("input[name='id']");
	var idCkBtn = document.getElementById("id-check");
	var pwInput = document.querySelector("input[name='password']");
	var pwCheckInput = document.getElementById("pw-check");
	var pwCheckMessage = document.getElementById("pw-check-message");
	var submitBtn = document.getElementById("submit-button");

	var regPattern = /^[a-zA-Z0-9]{5,10}$/;
	
	var dupCheck = false;
	var diffCheck = false;

	idCkBtn.onclick = function() {
		
		var id = idInput.value;
		
		if(id=="")
		{
			alert("내용을 먼저 입력하셔야 합니다.");
			return;
		}	
		else if(regPattern.test(id) == false)
		{
			alert("아이디 형식이 올바르지 않습니다.");
			return;
		}
		
		var request = new XMLHttpRequest();
		
		request.onreadystatechange = function () {
		
			if(request.readystate == 4)
			{
				if(request.responseText == "true")
				{
					alert("이미 사용중인 아이디입니다.");
				}
				else
				{
					alert("사용가능한 아이디입니다.");
					dupCheck = true;
				}
			}
		};
		
		request.open("GET", "idcheck?id="+id, true);
		request.send();
	};
	
	idInput.onchange = function (){

		dupCheck = false;
	};

	pwInput.onchange = diffPw;
	pwCheckInput.onchange = diffPw;

	function diffPw() {

		if(pwInput.value == pwCheckInput.value)
		{
			pwCheckMessage.textContent = "*비밀번호가 일치합니다.";
			pwCheckMessage.style['color'] = "#000";
			diffCheck = true;
		}
		else
		{
			pwCheckMessage.textContent = "*비밀번호가 일치하지 않습니다.";
			pwCheckMessage.style['color'] = "red";
			diffCheck = false;
		}

	}

	submitBtn.onclick = function (e){

		if(dupCheck == false)
		{
			e.preventDefault();
			
			alert("아이디 중복 검사를 해주십시오.");
			idInput.focus();
		}
		else if(pwInput == "")		
		{
			e.preventDefault();

			alert("비밀번호를 입력해주십시오.");
			pwCheckInput.focus();
		}
		else if(diffCheck == false)		
		{
			e.preventDefault();

			alert("비밀번호를 확인해주십시오.");
			pwCheckInput.focus();
		}
		
	};

	
});

window.addEventListener("load", function(){
	var check = document.querySelectorAll(".agree .ck");	
	var checkAll = false;

	check[0].onclick = function()
	{
		if(checkAll == false)
		{
			check[1].checked = true;
			check[2].checked = true;
			check[3].checked = true;
			
			checkAll = true;
		}
		
		else
		{
			check[1].checked = false;
			check[2].checked = false;
			check[3].checked = false;
			
			checkAll = false;
		}
	};
	
	for(var i=0; i<check.length-1; i++)
	{ check[i+1].onchange = checkChange; }

	function checkChange() 
	{
		check[0].checked = false;
		checkAll = false;
	}
});