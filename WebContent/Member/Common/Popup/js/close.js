window.addEventListener("load", function()
{
	var closePopupButton = document.getElementById("button-close-popup");
	
	closePopupButton.onclick = function() 
	{
		 window.open("about:blank", "_self").close(); 
	}
});
