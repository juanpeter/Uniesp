const knex = require('knex')({
  client: "mysql",
  connection: {
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: 'password',
    database: 'usuarios'
  }
})

module.exports = knex;