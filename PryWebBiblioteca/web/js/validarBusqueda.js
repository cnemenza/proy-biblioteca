window.addEventListener('load',function(){
  document.getElementById('btnConsultarBusqueda').addEventListener('click',function(){
     var codigo = document.getElementById('txtCod').value;
     
     var bandera = false;
     
     if(codigo.length>0){
         if (!/^([0-9])*$/.test(codigo)){
              alert("El codigo ingresado no es un numero");
         }
         else{
              bandera = true;
         } 
     }else{
         alert('Por favor llene los campos')
     }
     
 
  });
});
