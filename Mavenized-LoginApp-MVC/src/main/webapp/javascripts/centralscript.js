/**
 * Central/Main script for the Application.
 */

function checkKey(event) {
	event=(event)?event:window.event;
	var charCode=(event.which)?event.which:event.keyCode;
	
	if(charCode>31 && (charCode < 48 || charCode > 57))
	{
		return false;
	}	
	else
		return true;
}

