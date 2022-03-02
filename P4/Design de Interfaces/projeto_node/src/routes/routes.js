const express = require('express')
const router = express.Router()

const usuarioController = require("../api/controllers/UsuarioController")

router.post('/api/usuarios', usuarioController.createUsuario)

router.get('/api/usuarios', usuarioController.listarUsuarios)

router.delete('/api/usuarios', usuarioController.excluirUsuario)

router.put('/api/usuarios', usuarioController.editarUsuario)

router.get('api/buscarUsuario', usuarioController.pesquisarUsuarioNome)

module.exports = router