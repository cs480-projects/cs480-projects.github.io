var express = require('express');
var mysql = require('mysql');
var app = express();

var connection = mysql.createConnection({
	
	host: 'localhost',
	user: 'root',
	password: '',
	database: 'smapleDB'
});

connection.connect(function(error) {
	if(!!error) {
		console.log('Error');
	} else {
		console.log('Connected');
	}
});

app.get('/',function(req, resp) {
	connection.query("SELECT * FROM EventList", function(error, rows, fields) {
		if(!!error) {
			console.log('Error in the query');
		} else {
			console.log('Successful query');
			console.log(rows);
		}
	});
})

app.listen(1337);