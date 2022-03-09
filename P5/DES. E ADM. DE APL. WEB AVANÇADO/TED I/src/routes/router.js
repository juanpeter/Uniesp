const express = require('express')
const router = express.Router()

router.get('/', (req,res) => {
  res.send("GET request")
})

router.post('/', (req,res) => {
  res.send("POST request")
})

router.put('/', (req,res) => {
  res.send("PUT request")
})

router.delete('/', (req,res) => {
  res.send("DELETE request")
})

module.exports = router