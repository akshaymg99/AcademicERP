async function fetch_due_bills() {

    let response = await fetch('api/stdpayment/getdue')
    let commits = await response.json();
    console.log(commits);
    let table_data = document.getElementById("due_id_data");
    table_data.innerHTML = '';
    for (let i = 0; i<commits.length; i++) {
        let tr_data = document.createElement('tr');
        tr_data.innerHTML = '<th scope="row">'+(i+1)+'</th>\n' +
            '            <td>'+commits[i]['payment_id']+'</td>\n' +
            '            <td>'+commits[i]['amount']+'</td>\n' +
            '            <td>'+commits[i]['description']+'</td>' +
            '            <td>'+commits[i]['payment_date']+'</td>' +
            '            <td>'+commits[i]['bill_id']+'</td>' +
            '            <td>'+commits[i]['student_id']+'</td>';
        table_data.appendChild(tr_data);
    }
}