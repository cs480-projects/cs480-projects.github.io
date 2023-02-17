var express = require('express');
var mysql = require('mysql');
var app = express();
var template = require('./template.js');
var connection = mysql.createConnection({
	
	host: 'localhost',
	user: 'root',
	password: '',
	database: 'sampleDB'
});

connection.connect(function(error) {
	if(!!error) {
		console.log('Error');
	} else {
		console.log('Connected');
	}
});

app.get('/', function(req, resp) {
	connection.query("SELECT * FROM EventList", function(error, rows, fields) {
		if(!!error) {
			console.log('Error in the query');
		} else {
			console.log('Successful query');
			var title = 'Welcome';
			var description = 'Hello';
			var list = template.list(rows);
			var html = template.HTML(title, list);
			resp.writeHead(200);
			console.log(rows);
			resp.end(html);
			
		}
	});
})

app.listen(1337);