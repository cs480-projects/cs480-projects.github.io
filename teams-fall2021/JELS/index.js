const express = require('express');
const path = require('path');

const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: false}));

app.get('/hello', (req, res) => {
    res.send('Hello');
});

app.listen(4000, () => console.log('listening on 4000'));