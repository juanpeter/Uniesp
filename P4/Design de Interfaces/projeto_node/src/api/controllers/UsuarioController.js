const database = require('../../database/connection')

class UsuarioController {
  createUsuario = (req, res) => {
    const { nome, email } = req.body
    database.insert({nome, email}).table('usuario')
    .then(data => {
      res.json({'success': 'Usuário salvo com sucesso'})
    }).catch(err => {
      res.json({'error': 'Usuário não pode ser salvo'})
    })
  }
// Não funciona
  listarUsuarios = (req, res) => {
    const {nome, email} = database.select().from('usuario')
    .then(data => {
      res.json({
        nome: nome,
        email: email,
      })
    }).catch(err => {
      res.json({'error': 'Erro na conexão'})
    })
  }

  excluirUsuario = (req, res) => {
    const { nome } = req.body
    database.where({'nome': nome}).del()
    .then(data => {
      res.json({'success': 'Usuário deletado com sucesso'})
    }).catch(err => {
      res.json({'error': 'Usuário não encontrado'})
    })
  }

  editarUsuario = (req, res) => {
    const { nome, novoNome, novoEmail } = req.body
    database.where({'nome': nome}).update({
      nome: novoNome,
      email: novoEmail,
    })
    .then(data => {
      res.json({'success': 'Usuário alterado com sucesso'})
    }).catch(err => {
      res.json({'error': 'Usuário não encontrado'})
    })
  }

  pesquisarUsuarioNome = (req, res) => {
    const { nomeBusca } = req.body
    const {nome, email} = database.where({'nome': nomeBusca})
    .then(data => {
      res.json({
        nome: nome,
        email: email
      })
    }).catch(err => {
      res.json({'error': 'Usuário não encontrado'})
    })
  }
}

module.exports = new UsuarioController()