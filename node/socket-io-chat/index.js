const express = require('express');
const app = express();
const http = require('http');
const server = http.createServer(app);
const port = 3000;

const {Server} = require("socket.io");
const io = new Server(server);



app.get('/', (req, res) => {
    res.sendFile(__dirname+'/index.html');
});

io.on('connection', (socket) => {
    console.log('new session')
    socket.on('chat message', (msg) => {
        io.emit('chat message', msg)
      console.log('message: ' + msg);
    });

    socket.on('disconnect', (msg) => {
        console.log('user disconnect');
    });
  });

server.listen(port, () => {
    console.log(`Example app listening on port ${port}!`);
});