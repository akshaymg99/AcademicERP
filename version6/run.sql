insert into Students(student_id, email, first_name, last_name, password, roll_no) VALUES
('2', 'akshaymg99@gmail.com', 'Akshay', 'Gudiyawar', 'avatar', 'MT2020137'),
('3', 'suraj@gmail.com', 'Suraj', 'Achari', 'yagami', 'MT2020134'),
('4', 'suhas@gmail.com', 'Suhas', 'Patil', 'apple', 'MT2020056');

insert into Bills(bill_id, amount, bill_date, deadline, description) VALUES
('3', '5000', '2020-11-11', '2021-01-01', 'tuition fees'),
('4', '1000', '2020-10-10', '2021-02-02', 'hostel fees');     

insert into Student_Payment(payment_id, amount, description, payment_date, bill_id, student_id) VALUES
('2', '5000', 'tutition fee', '2020-12-27', '3', '2'),
('3', '5000', 'tuition fee', '2020-12-20', '3', '1'),
('4', '1000', 'hostel fee', '2020-06-06', '4', '1');


insert into Student_Bills(student_id, bill_id) VALUES
('1', '3'),
('1', '4'),
('2', '3');



