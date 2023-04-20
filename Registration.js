
function validate() {
    var x = document.forms["form"]["fname"].value;
    var y = document.forms["form"]["uname"].value;
    var z =document.forms["form"]["ename"].value;
    var a = document.forms["form"]["pname"].value;
    var b = document.forms["form"]["pass"].value;
    var c = document.forms["form"]["pass1"].value;
    var d = document.forms["form"]["gender"].value;
    if (x == "") {
      alert("FullName is empty");
    }
    else if(y==""){
        alert("username is empty");
    }
    else if(z==""){
        alert("email is empty");
    } else if(a==""){
        alert("phone number is empty");
    }
    else if(b==""){
        alert("password is empty");
    }
    else if(c==""){
        alert("confirm password is empty");
    }
    else if(d==""){
        alert("gender is empty")
    }
    else{
        alert("submitted");
    }
}
