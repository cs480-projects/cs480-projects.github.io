module.exports = {
	HTML:function(title, list) {
		return `
		<!doctype html>
		<html>
		<style>
		table, th, td {
			border: 1px solid black;
			border-collapse: collapse;
		}
		</style>
		<head>
			<title>WEB1 - ${title}</title>
			<meta charset="utf-8">
		</head>
		<body>
			<h1><a href="/">WEB</a></h1>
			${list}
		</body>
		</html>
		`;
	}, list:function(rows) {
		var list = `<table style="width:100%">
					<tr>
						<th>Name</th>
						<th>Date</th> 
						<th>Time</th>
						<th>Location</th>
					</tr>`;
		var i = 0;
		while(i < rows.length) {
			list = list + `<tr>
							<td>${rows[i].Name}</td>
							<td>${rows[i].Date}</td> 
							<td>${rows[i].Time}</td>
							<td>${rows[i].Location}</td>
						  </tr>`;
			i= i + 1;
		}
		list = list + '</table>';
		return list;
	}
}