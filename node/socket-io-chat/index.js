const express = require('express');
const app = express();
const http = require('http');
const server = http.createServer(app);
const port = 3000;

app.get('/', (req, res) => {
    // res.send('<h1>Hello World!</h1>');
    res.sendFile(__dirname+'/index.html');
})
app.listen(port, () => {
    console.log(`Example app listening on port ${port}!`);
})