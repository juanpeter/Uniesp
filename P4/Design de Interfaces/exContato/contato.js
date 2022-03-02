window.onload = () => {
  listar()
  document.getElementById("formCadastro").addEventListener('submit', add);
  document.getElementById("formCadastro").addEventListener('submit', listar);
}

// - Incluir mais de um contato na tela, ou seja,
//  a listagem dever aparecer N contatos cadastrados
function listar(e) {
  // Cheque se o 'value' existe dentro do localStorage

  // Se não, o crie
  if(localStorage.getItem('value') === null) {
    localStorage.setItem('value', '{}');
    return;
  }

  // se existir, o escreva na página
  else {
    let contatos = JSON.parse(localStorage.getItem('value'))
    const tbody = document.getElementById("contatoCadastrados")

    tbody.innerHTML = ''

    for (let i = 0; i < contatos.length; i++) {
      name = contatos[i].name;
      phone = contatos[i].phone;
      type = contatos[i].type == 'W' ? "Work" : "Family";
      addressName = contatos[i].addressName;
      addressNum = contatos[i].addressNum;
      addressZIP = contatos[i].addressZIP;

      tbody.innerHTML += `<tr id="rowContact' + i +" class= "${type}-color" >` +
      '<td>'+ name + '</td>' +
      '<td>' + phone + '</td>' +
      '<td>' + type  + '</td>' +
      '<td>' + `${addressName}, ${addressNum}, ${addressZIP}` + '</td>' +
      '<td> <button onClick="deletar(\'' + name + '\')">Excluir</button></td>' +
      '<td> <button onClick="editar(\'' + name + '\')">Editar</button></td>' +
      '</tr>'
    }
  }

}

// Adicione o contato
function add(e) {

  let contato = {
    name: document.getElementById("txtName").value,
    phone: document.getElementById("txtPhone").value,
    type: document.getElementById("work").checked ? "W" : "F",
    addressName: document.getElementById("adStreet").value,
    addressNum: document.getElementById("adNumber").value,
    addressZIP: document.getElementById("adZIP").value
  }

  document.getElementById('formCadastro').reset();

  let contatos = [];

  // Se o 'value' existir dentro do localStorage, adicione esses elementos nos contatos
  if(localStorage.getItem('value') !== null) {
    let contatosJSON = JSON.parse(localStorage.getItem('value'));

    for (let i = 0; i < contatosJSON.length; i++) {
      contatos.push(contatosJSON[i])
    }
  }

  // Adicione o último elemento na lista de contatos
  contatos.push(contato)

  // Salve e lista de contatos no localstorage 
  localStorage.setItem('value', JSON.stringify(contatos));

  e.preventDefault()

}

// - Criar a função excluir pelo nome do contatos
// - Ao remover o contato o mesmo deverá sair da tela
function deletar(name) {

  let contatos = JSON.parse(localStorage.getItem('value'))

  for (let i = 0; i < contatos.length; i++) {
    if (contatos[i].name === name) {
      contatos.splice(i,1)
      break;
    }
  }

  localStorage.setItem('value', JSON.stringify(contatos));
  listar()

}

function editar(name) {

}