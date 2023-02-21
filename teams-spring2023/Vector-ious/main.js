async function getUsers() {
    let url = 'team.json';
    try {
        let res = await fetch(url);
        return await res.json();
    }
    catch (error) {
        console.log(error);
    }
}

async function renderUsers() {
    let users = await getUsers();
    let html = '';
    users.forEach(user => {
        let htmlSegment = `<div class="user">
                            <h2>${user.firstName} ${user.lastName} aka ${user.username}</h2>
                            </div>`;
        html += htmlSegment;
    });
    let container = document.querySelector('.container');
    container.innerHTML = html;
}

renderUsers()