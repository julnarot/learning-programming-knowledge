const express = require('express');
const bodyParser = require('body-parser');

const app = express();

const myProfileData = {
    email: "rauljhonatan.tola@gmail.com",
    mainSlogan: 'The more transparent the writing, the more visible the poetry.',
    mainMessage: "Hello!! I'm Raul Jonatan, and i've been development web solutions alternatives  of multiple enterprise sectors for almost 8 years",
    social: [
        'https://github.com/julnarot',
        'https://pe.linkedin.com/in/julnarot'
    ],
    about: "Bachelor's degree in Systems Engineering with recognized work experience in the process of analysis, development, implementation, migration and maintenance of web software in various projects in the commercial, educational, educational-financial, energy-fuels and public administration fields.",
    photoUrl: 'https://contents.bebee.com/users/id/rijYy65368c4be7f6d/_avatar-ywr7p-400.png',
}

app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static('public'));

app.get('/', (req, res) => {
    res.render('index', myProfileData)
});

app.listen(3000, () => {
    console.log('Running on: http://localhost:3000')
})