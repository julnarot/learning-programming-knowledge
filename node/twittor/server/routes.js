// Routes.js - Módulo de rutas
var express = require('express');
var router = express.Router();



const MESSAGES = [
  {
    id: '92238',
    user: 'wolverine',
    message: 'Hello world'
  }, {
    id: '92239',
    user: 'spiderman',
    message: 'Hiii'

  }, {
    id: '92240',
    user: 'hulk',
    message: 'xd'
  }
]



// Get mensajes
router.get('/', function (req, res) {
  res.json(MESSAGES);
});

// Save mensajes
router.post('/', function ({ body: { message, user } }, res) {
  const data = { message, user };
  MESSAGES = [...MESSAGES, data]
  res.json({
    ok: true,
    data
  });
});




module.exports = router;