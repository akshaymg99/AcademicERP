async function fetch_bills() {

    let response = await fetch('api/bills/getbills')
    let commits = await response.json();
    console.log(commits);
    let table_data = document.getElementById("pending_id_data");
    table_data.innerHTML = '';
    for (let i = 0; i<commits.length; i++) {
        let tr_data = document.createElement('tr');
        tr_data.innerHTML = '<th scope="row">'+(i+1)+'</th>\n' +
            '            <td>'+commits[i]['bill_id']+'</td>\n' +
            '            <td>'+commits[i]['amount']+'</td>\n' +
            '            <td>'+commits[i]['bill_date']+'</td>' +
            '            <td>'+commits[i]['deadline']+'</td>' +
            '            <td>'+commits[i]['description']+'</td>';
        table_data.appendChild(tr_data);
    }
}