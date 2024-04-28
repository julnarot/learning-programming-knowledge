// Routes.js - Módulo de rutas
var express = require('express');
var router = express.Router();



const MESSAGES = [
  {
    id: '92238',
    user: 'Julnarot',
    message: 'Hello world'
  }
]



// Get mensajes
router.get('/', function (req, res) {
  res.json(MESSAGES);
});




module.exports = router;