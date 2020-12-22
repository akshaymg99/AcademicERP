async function fetch_students() {

    let response = await fetch('api/students/get')
    let commits = await response.json();
    console.log(commits);
    let table_data = document.getElementById("table_id_data");
    table_data.innerHTML = '';
    for (let i = 0; i<commits.length; i++) {
        let tr_data = document.createElement('tr');
        tr_data.innerHTML = '<th scope="row">'+(i+1)+'</th>\n' +
            '            <td>'+commits[i]['student_id']+'</td>\n' +
            '            <td>'+commits[i]['first_name']+'</td>\n' +
            '            <td>'+commits[i]['last_name']+'</td>\n' +
            '            <td>'+commits[i]['roll_no']+'</td>\n' +
            '            <td>'+commits[i]['cgpa']+'</td>\n' +
            '            <td>'+commits[i]['total_credits']+'</td>\n' +
            '            <td>'+commits[i]['graduation_year']+'</td>';
        table_data.appendChild(tr_data);
    }
}