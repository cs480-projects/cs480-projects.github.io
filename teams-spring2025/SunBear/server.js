const express = require('express');
const app = express();
const port = 3000;

// Define an API endpoint
app.get('/api/gabe', (req, res) => {
    res.send('hello from gabe');
});

// Serve the static HTML file
app.use(express.static(__dirname));

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});