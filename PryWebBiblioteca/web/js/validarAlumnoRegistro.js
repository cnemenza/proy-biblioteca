/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function valida(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla==8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[0-9]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}

window.addEventListener('load',function(){
  document.getElementById('btnRegistrar').addEventListener('click',function(){
     var nombre = document.getElementById('txtNombre').value;
     var ape = document.getElementById('txtApellido').value;
      var dire = document.getElementById('txtDireccion').value;
       var carre = document.getElementById('txtCarrera').value;
        var edad = document.getElementById('txtEdad').value;
         var cel = document.getElementById('txtCelular').value;
          var dni = document.getElementById('txtDni').value;
        
     
     var bandera = false;
     
     if(nombre.length>0 && ape.length >0 && dire.length >0 && carre.length >0 && edad.length >0 && cel.length >0 && dni.length >0 ){
         bandera = true;
     }
     
     if(bandera){
         document.getElementById('for01').submit();
     }else{
         alert('Por favor llene los campos');
     }
  });
});



