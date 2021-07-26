const {SEGUROS} = require('./in-memory-db');

exports.salvarSeguro = (req, res) => {
    const seguro = req.body;

    SEGUROS.push(seguro);
    console.log('Seguro agregado', seguro);

    res.status(200).json({message: 'segur agregado con exito'});

}

exports.listarSeguros = (req, res) => {
    res.status(200).json(SEGUROS);
}

exports.sendNewsletter = (req, res) => {

    const allSubscriptions = [];

    console.log('Total subscriptions', allSubscriptions.length);

    const notificationPayload = {
        "notification": {
            "title": "Angular News",
            "body": "Newsletter Available!",
            "icon": "assets/main-page-logo-small-hat.png",
            "vibrate": [100, 50, 100],
            "data": {
                "dateOfArrival": Date.now(),
                "primaryKey": 1
            },
            "actions": [{
                "action": "explore",
                "title": "Go to the site"
            }]
        }
    };

    Promise.all(allSubscriptions.map(sub => webpush.sendNotification(
        sub, JSON.stringify(notificationPayload))))
        .then(() => res.status(200).json({message: 'Newsletter sent successfully.'}))
        .catch(err => {
            console.error("Error Enviando notificacion, razon: ", err);
            res.sendStatus(500);
        });

}
