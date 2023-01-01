const express = require('express')
const bodyParser = require('body-parser')
const app = express()
const port = 3000


const data = require("./DATA.json");
module.exports = data

app.use(bodyParser.json())
app.use(
  bodyParser.urlencoded({
    extended: true,
  })
)

app.get('/', (request, response) => {
    const count = data.length;
    response.json({ data, count });
})

app.listen(port, () => {
  console.log(`App running on port ${port}.`)
})