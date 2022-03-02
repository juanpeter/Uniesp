window.onload = () => {
  listar();
  document.getElementById('formCadastro').addEventListener('submit',add);
  document.getElementById('formCadastro').addEventListener('submit',listar);
}

function add(e) {

 var contatos = [];

 var contato = {
   name: document.getElementById("txtName").value,
   phone: document.getElementById("txtPhone").value,
   type: document.getElementById("work").checked ? 'W' : 'F'
 }

 contatos.push(contato);
 localStorage.setItem('value', JSON.stringify(contatos));
 document.getElementById('formCadastro').reset();
 
}

function listar(){

  if(localStorage.getItem('value' === null))
    return;
  
  let contatos = JSON.parse(localStorage.getItem('value'));
  var tbody = document.getElementById('contatosCadastrados');

  tbody.innerHTML = '';

  for (var i = 0; i < contatos.length; i++) {
      name = contatos[i].name;
      phone = contatos[i].phone;
      type = contatos[i].type == 'W' ? "Work" : "Family";

      tbody.innerHTML += '<tr id="rowContact'+i+'">'+
      '<td>'+name+'</td>'+
      '<td>'+phone+'</td>'+
      '<td>'+type+'</td>'+
      '<td><button onclick="excluir(\'' +name+ '\')">Excluir</button></td>'+
      '<td><button onclick="editar(\'' +name+ '\')">Editar</button></td>'+
      '</tr>';

  }
}