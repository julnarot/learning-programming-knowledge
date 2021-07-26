const express = require("express")
const bodyParser = require("body-parser")
const cors = require("cors")

const {salvarSeguro, listarSeguros, sendNewsletter} = require('./seguro-service')

const webpush = require('web-push');

// VAPID keys should only be generated only once.
const vapidKeys = {
    publicKey: 'BL5dw9-Gk0zWz8GC59yJRsNMLtVUACygirSFb86Fz_ZCw_Rbg6JbPuu9KNIo0DTTCI3_9482qgHn3mriThIHY-0',
    privateKey: '7uX4Okf3p0GLFj8THIrB9RjM3a7jQTmhJWPQLfI_U3c'
}

webpush.setVapidDetails(
    'mailto:example@yourdomain.org',
    vapidKeys.publicKey,
    vapidKeys.privateKey
);




const app = express()
app.use(bodyParser.json());
app.use(cors({origin: true, credential: true}));


app.route('/api/seguros').post(salvarSeguro);
app.route('/api/seguros').get(listarSeguros);
app.route('/api/newsletter').post(sendNewsletter);








const HOST = 'localhost';
const PORT = '9000';


const httpServer = app.listen(PORT, HOST, () => {
    console.log(`Servidor rodando em http://${HOST}:${PORT}`);
})
