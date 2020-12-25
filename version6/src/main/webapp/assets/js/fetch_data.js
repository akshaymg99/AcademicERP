async function fetch_data() {

    let response = await fetch('api/courses/get')
    let commits = await response.json();
    console.log(commits);
    let table_data = document.getElementById("table_id_data");
    table_data.innerHTML = '';
    for (let i = 0; i<commits.length; i++) {
        let tr_data = document.createElement('tr');
        tr_data.innerHTML = '<th scope="row">'+(i+1)+'</th>\n' +
            '            <td>'+commits[i]['course_id']+'</td>\n' +
            '            <td>'+commits[i]['credits']+'</td>\n' +
            '            <td>'+commits[i]['description']+'</td>' +
            '            <td>'+commits[i]['name']+'</td>';
        table_data.appendChild(tr_data);
    }
}