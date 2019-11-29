 function myLogin(){
     let x =document.getElementById('myinput');
     if(x.type == "password"){
         x.type = "text";
     }else{
         x.type="password";
     }
}

