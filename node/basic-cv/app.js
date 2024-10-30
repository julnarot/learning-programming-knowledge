const express = require('express');
const bodyParser = require('body-parser');
const { Client } = require('pg');
const app = express();

const client = new Client();

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


app.get('/', async (req, res) => {
    await connectDB();
    let result = [];
    try {
        const resp = await client.query('SELECT * FROM dual');
        if (resp) {
            this.result = resp.rows;
            console.log(resp.rows)
        }
    } catch (err) {
        console.error('Error executing query:', err);
    } finally {
        await disconnectDB();
    }
    console.log(result);

    res.render('index', myProfileData)
});

app.listen(3000, () => {
    console.log('Running on: http://localhost:3000')
})


const connectDB = async () => {
    try {
        await client.connect();
        console.log('Connected to PostgreSQL database');
    } catch (err) {
        console.error('Error connecting to PostgreSQL database:', err);
    }
};

const disconnectDB = async () => {
    try {
        await client.end();
        console.log('Connection to PostgreSQL closed');
    } catch (err) {
        console.error('Error closing connection:', err);
    }
};