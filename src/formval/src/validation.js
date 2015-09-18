/**
 * 
 */
	function formValidation()
{
    var uid = document.registration.userid;
    var passid = document.registration.passid;
    var uname = document.registration.username;
    var uadd = document.registration.address;
    var ucountry = document.registration.country;
    var uzip = document.registration.zip;
    var uemail = document.registration.email;
    var mgender = document.registration.msex;
    var fgender = document.registration.fsex; 
    
    if(validateUsername(uid,5,12))
    {
        if(validatePassword(passid,7,12))
        {
            if(allLetter(uname))
            {
                if(alphanumeric(uadd))
                {
                    if(countryselect(ucountry))
                    {
                        if(allnumeric(uzip))
                        {
                            if(ValidateEmail(uemail))
                            {
                                if(validgender(mgender,fgender))
                                {
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return false;
}
	function validgender(mgender,fgender)
	{
	    x=0;

	    if(mgender.checked)
	    {
	        x++;
	    } if(fgender.checked)
	{
	    x++;
	}
	    if(x==0)
	    {
	        alert('Select Male/Female');
	        return false;
	    }
	    else
	    {
	        alert('Form Successfully Submitted');
	        window.location.reload()
	        return true;}
	}
	
	function checkEmail() {

	    var email = document.getElementById('txtEmail');
	    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

	    if (!filter.test(email.value)) {
	    alert('Please provide a valid email address');
	    email.focus;
	    return false;
	 }
	}
	
	function allnumeric(uzip)
	{
	    var numbers = /^[0-9]+$/;
	    if(uzip.value.match(numbers))
	    {
	        return true;
	    }
	    else
	    {
	        alert('ZIP code must have numeric characters only');
	        return false;
	    }
	}
	
	function countryselect(ucountry)
	{
	    if(ucountry.value == "Default")
	    {
	        alert('Select your country from the list');
	        return false;
	    }
	    else
	    {
	        return true;
	    }
	}
	
	function alphanumeric(uadd)
	{
	    var letters = /^[0-9a-zA-Z]+$/;
	    if(uadd.value.match(letters))
	    {
	        return true;
	    }
	    else
	    {
	        alert('User address must have alphanumeric characters only');
	        return false;
	    }
	}
	
	
	function allLetter(uname)
	{
	    var letters = /^[A-Za-z]+$/;
	    if(uname.value.match(letters))
	    {
	        return true;
	    }
	    else
	    {
	        alert('Username must have alphabet characters only');
	        return false;
	    }
	}
	
	
	function validatePassword(fld) {
	    var error = "";
	    var illegalChars = /[\W_]/; // allow only letters and numbers
	 
	    if (fld.value == "") {
	        fld.style.background = 'Yellow';
	        error = "You didn't enter a password.\n";
	        alert(error);
	        return false;
	 
	    } else if ((fld.value.length < 7) || (fld.value.length > 15)) {
	        error = "The password is the wrong length. \n";
	        fld.style.background = 'Yellow';
	        alert(error);
	        return false;
	 
	    } else if (illegalChars.test(fld.value)) {
	        error = "The password contains illegal characters.\n";
	        fld.style.background = 'Yellow';
	        alert(error);
	        return false;
	 
	    } else if ( (fld.value.search(/[a-zA-Z]+/)==-1) || (fld.value.search(/[0-9]+/)==-1) ) {
	        error = "The password must contain at least one numeral.\n";
	        fld.style.background = 'Yellow';
	        alert(error);
	        return false;
	 
	    } else {
	        fld.style.background = 'White';
	    }
	   return true;
	}
	
	function validateUsername(fld) {
	    var error = "";
	    var illegalChars = /\W/; // allow letters, numbers, and underscores

	    if (fld.value == "") {
	        fld.style.background = 'Yellow';
	        error = "You didn't enter a username.\n";
	        alert(error);
	        return false;

	    } else if ((fld.value.length < 5) || (fld.value.length > 12)) {
	        fld.style.background = 'Yellow';
	        error = "The username is the wrong length.\n";
	        alert(error);
	        return false;

	    } else if (illegalChars.test(fld.value)) {
	        fld.style.background = 'Yellow';
	        error = "The username contains illegal characters.\n";
	        alert(error);
	        return false;

	    } else {
	        fld.style.background = 'White';
	    }
	    return true;
	}