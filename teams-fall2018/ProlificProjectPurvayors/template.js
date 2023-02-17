module.exports = {
	HTML:function(list) {
		return `
		<!DOCTYPE html>
        <html>
          <head>
            <meta charset="UTF-8">
            <title>Bronco Events</title>
	        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv ="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width = device-width, initial-scale = 1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <script src="jquery-3.3.1.min.js"></script>
        <script src="jquery.dataTables.min.js"></script>
        <script>
        $(document).ready(function() {
            $('#mainTable').DataTable( {
                "order": [[ 2, "desc" ]]
            } );
        } );
        </script>
	        <style>
        #header {color:black; background-color: black; border: 1px solid grey}
        .picture {color: black; background-color: black; border: 5px solid grey}
        body {
	  
	          background-image: url('https://www.cpp.edu/~ceu/csucounterparts/img/aconf/Cal-Poly-Pomona.jpg');
	        background-size:cover;
   	        background-repeat:no-repeat;
   	        background-size: 100%;
        }
        h1{
        color:white;
        }
        p{
        color: white;
        }
        .picture {
	        border-radius: 50%;
            width: 100px;
            height: 100%;
            background: yellow;
            border: 3px solid blue;
	        position: relative;
	        display: block;
        }
        #header {

	        background-color:lime;
	        border: 1px solid grey;
	        height: 50%;
        }


        #wrapper {
    
           position: relative; /*position: fixed;*/
           display: flex;
            justify-content: center;
            align-items: center;
   

   
	        float:right;
            border: none;
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
	        border-radius: 12px;
	        background-color:red;
	
    
        }
        .container{
	        position: relative; /*position: fixed;*/
	
            justify-content: center;
            align-items: center;
	
          background-color: black; /* Green */
            border: none;
            color: white;
            padding: 20px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            cursor: pointer;
	        border-radius: 12px;
        }

        .ul.list-inline:after{
	        clear: both;
	        display: block;
	        content: "";
        }
        .row{
        display: flex;
        background-color:purple;
        overflow: hidden;
	        height:100%;
            width:100%;
	        margin-bottom:10px;
        }
        #parent {
          display: flex;
        }
        #narrow {
          width: 200px;
          background: lightblue;
          /* Just so it's visible */
        }
        #wide {
          flex: 1;
          /* Grow to rest of container */
          background: black;
  
          /* Just so it's visible */
        }
        img{
        zoom: 5;  //increase if you have very small images

            display: block;
            margin: auto;

            height: 50px;
            width: 100%;
        }
        #about{
        float: left;

        }
        </style>
          </head>
          <body>
			<div class = "container" >
		
		    <div id="parent">
                 <div id = "narrow" > <img src="https://www.logolynx.com/images/logolynx/f3/f385b41c0dc7216f8aa6144bddcf7869.jpeg" alt="Bronco Events Logo">ABOUT: This website is used
                         to skip needing to sign up for email newsletters to get information about club events at Cal Poly Pomona. You can find the location and date of club events listed here.</div>
                        <!--<div id="narrow"><div class="picture"> SOME COOL LOGO OR SOMETHING GOES HERE </div></div> -->
                        <div id="wide"><img src="https://oneclassblog.com/wp-content/uploads/2018/09/2015_CalPolyPomona_0003_05.jpg" alt="CPP">
			                ${list}
                        </div>
            </div>
            <div id = "footer"> Club Events are Subject to change</div>
            </div>
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
