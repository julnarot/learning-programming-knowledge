const express = require('express');
const bodyParser = require('body-parser');
const { Client } = require('pg');
const app = express();

const client = new Client();

const myProfileData = {
    username: "@Julnarot",
    email: "rauljhonatan.tola@gmail.com",
    mainSlogan: 'The more transparent the writing, the more visible the poetry.',
    mainMessage: "At the beginning of 16 I decided to take on this exciting challenge of building tools that allow for easy access to information effectively for the person or people who require it through the use of the art of writing computer code.",
    social: [
        'https://github.com/julnarot',
        'https://pe.linkedin.com/in/julnarot'
    ],
    about: "Bachelor's degree in Systems Engineering with recognized work experience in the process of analysis, development, implementation, migration and maintenance of web software in various projects in the commercial, educational, educational-financial, energy-fuels and public administration fields.",
    photoUrl: 'https://contents.bebee.com/users/id/rijYy65368c4be7f6d/_avatar-ywr7p-400.png',
};

app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static('public'));

const connectDB = async () => {
    try {
        await client.connect();
        console.log('Connected to PostgreSQL database');
    } catch (err) {
        console.error('Error connecting to PostgreSQL database:', err);
    }
};

app.get('/', async (req, res) => {
    let result = {};
    try {
        const resp = await client.query("SELECT * FROM profiles where username = 'julnarot'");
        if (resp) {
            result = resp.rows.pop(); 
        }
    } catch (err) {
        console.error('Error executing query:', err);
    }
    res.render('index', { ...myProfileData, ...result });
});

const disconnectDB = async () => {
    try {
        await client.end();
        console.log('Connection to PostgreSQL closed');
    } catch (err) {
        console.error('Error closing connection:', err);
    }
};

app.listen(3000, async () => {
    await connectDB();
    console.log('Running on: http://localhost:3000');
});

process.on('SIGINT', async () => {
    await disconnectDB();
    process.exit(0);
});
