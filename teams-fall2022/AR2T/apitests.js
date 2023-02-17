// Example API Method:
function robAPI(link) {
    document.getElementById("spinner").style.display = "flex";
    fetch(link, { // Handle CORS Request
        mode: 'cors',
        headers: {
          'Access-Control-Allow-Origin':'*'
        }
    })
    .then(
    // HTTP GET Request: 
    function(response) {
        document.getElementById("spinner").style.display = "none";
        // Error handling
        if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
            response.status);
        return;
        }

        // Examine the text in the response
        response.json().then(function(data) {
        console.log(data); // Use console to check data object contents
        // Popup Notification:
        tata.log("Testing:", data,{
            position: 'tm',
          });
        });
    }
    )
    // Error Handling
    .catch(function(err) {
    return(err);
    });
}

function ryanAPI(link) {
    document.getElementById("spinner").style.display = "flex";
    fetch(link)
    .then(
    // HTTP GET Request: 
    function(response) {
        document.getElementById("spinner").style.display = "none";
        // Error handling
        if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
            response.status);
        return;
        }

        // Examine the text in the response
        response.json().then(function(data) {
        console.log(data); // Use console to check data object contents

        // Popup Notification:
        tata.log("Random question: ", data,{
            position: 'tm',
          });
        });
    }
    )
    // Error Handling
    .catch(function(err) {
    return(err);
    });
}

function aaronAPI(link) {
    document.getElementById("spinner").style.display = "flex";
    fetch(link)
    .then(
    // HTTP GET Request: 
    function(response) {
        document.getElementById("spinner").style.display = "none";
        // Error handling
        if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
            response.status);
        return;
        }

        // Examine the text in the response
        response.json().then(function(data) {
        console.log(data); // Use console to check data object contents

        // Popup Notification:
        tata.log("Random League Champ Generator: ", data,{
            position: 'tm',
          });
        });
    }
    )
    // Error Handling
    .catch(function(err) {
    return(err);
    });
}

function theoAPI(link) {
    document.getElementById("spinner").style.display = "flex";
    fetch(link)
    .then(
    // HTTP GET Request: 
    function(response) {
        document.getElementById("spinner").style.display = "none";
        // Error handling
        if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
            response.status);
        return;
        }

        // Examine the text in the response
        response.json().then(function(data) {
        console.log(data); // Use console to check data object contents

        // Popup Notification:
        tata.log("Overwatch Hero Generator", data,{
            position: 'tm',
          });
        });
    }
    )
    // Error Handling
    .catch(function(err) {
    return(err);
    });
}