/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener('load',function(){
  document.getElementById('btnIngresar').addEventListener('click',function(){
     var nombre = document.getElementById('txtUsuario').value;
     var contra = document.getElementById('txtContrasenia').value;
     
     var bandera = false;
     
     if(nombre.length>0 && contra.length >0){
         bandera = true;
     }
     
     if(bandera){
         document.getElementById('for01').submit();
     }else{
         alert('Por favor llene los campos');
     }
  });
});
