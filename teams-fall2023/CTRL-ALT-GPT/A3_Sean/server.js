const express = require('express')
const app = express()

app.get("/", (req, res) => {
    console.log("HOME")
    res.sendFile('views/index.html', {root: __dirname})
})

app.get("/createRecord", (req, res) => {
    console.log("CREATE RECORD")
    res.sendFile('views/formEntry.html', {root: __dirname})
})

app.get("/showRecords", (req, res) => {
    console.log("SHOW RECORDS")
    res.sendFile("views/showRecords.html", {root: __dirname})
})


app.listen(3000)