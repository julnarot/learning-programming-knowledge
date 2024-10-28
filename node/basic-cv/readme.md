## Personal CV application demo

### Setup
- Creating folder for project

```bash
mkdir basic-cv
```

- install required dependencies

```bash
npm i express body-parser ejs
```

- skeleton containt like these:

```bash

.
├── app.js
├── package.json
├── public
│   └── styles.css
└── views
    └── index.ejs

2 directories, 4 files

```
`app.js`
```bash
const express = require('express');
const bodyParser = require('body-parser');

const app = express();

app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({extended: true}));
app.use(express.static('public'));

app.get('/', (req, res) => {
    res.render('index', {email: 'rauljhonatan.tola@gmail.com'})
});

app.listen(3000, ()=>{
    console.log('Running on: http://localhost:3000')
})
```


`views/index.ejs`
```bash

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Curriculum Vitae</title>
</head>
<body>
    <h1>Raul Jonatan</h1>
    <span>
        <%= email %>
    </span>
</body>
</html>
```
### Run

Execute node for run
```
 node app.js
```