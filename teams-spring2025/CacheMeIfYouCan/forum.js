const express = require('express');
const fs = require('fs-extra');

const app = express();
const port = 3000;
app.use(express.json()); 
let posts = [];

app.post('/forum/posts', (req, res) => {
    const newPost = { id: posts.length + 1, text: req.body.text };
    posts.push(newPost);
    res.status(201).send(newPost);
});

app.get('/forum/posts', (req, res) => {
    res.send(posts);
});

app.get('/forum/posts/:id', (req, res) => {
    const post = posts.find(p => p.id == req.params.id);
    post ? res.send(post) : res.status(404).send("Post not found");
});

app.listen(port, () => console.log(`Forum API running at http://localhost:${port}`));
