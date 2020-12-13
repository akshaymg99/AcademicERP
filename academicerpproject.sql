create table Students(
	student_id char(5),
	roll_no varchar(3) NOT NULL UNIQUE,
	fname varchar(20) NOT NULL,
	lname varchar(20) NOT NULL,
	email varchar(30) NOT NULL UNIQUE,
	cgpa decimal(2, 1) NOT NULL,
	total_credits smallint NOT NULL,
	graduation_year char(4),
	constraint pk_Students PRIMARY KEY (student_id)
);

create table Bills(
	id char(4),
	description varchar(30),
	amount decimal(10, 2) NOT NULL,
	bill_date date NOT NULL, 
	deadline date, 
	constraint pk_Bills PRIMARY KEY (id)
);

create table Student_Bills(
	id char(4),
	student_id char(5),
	bill_id char(4),
	constraint pk_Student_Bills PRIMARY KEY (id),
	FOREIGN KEY (student_id) REFERENCES Students(student_id),
	FOREIGN KEY (bill_id) REFERENCES Bills(id)
);

create table Student_Payment (
	id char(4),
	student_id char(5),
	description varchar(30),
	amount decimal(10, 2) NOT NULL,
	payment decimal (10, 2) NOT NULL,
	bill_id char(4),
	constraint pk_Student_Bills PRIMARY KEY (id),
	FOREIGN KEY (student_id) REFERENCES Students(student_id),
	FOREIGN KEY (bill_id) REFERENCES Bills(id)
);

insert into Students(student_id, roll_no, fname, lname, email, cgpa, total_credits, graduation_year) VALUES
('12345', '100', 'Akshay', 'Gudiyawar', 'akshaymg99@gmail.com', '3.8', '16', '2022'),
('12346', '101', 'Anshuman', 'Galav', 'anshuman@iiitb.org', '3.9', '16', '2022'),
('12347', '102', 'Suraj', 'Achari', 'suraj@gmail.com', '3.5', '16', '2023'),
('12348', '103', 'Suhas', 'Patil', 'suhap@gmail.com', '3.4', '16', '2021');

insert into Bills(id, description, amount, bill_date, deadline) VALUES
('4567', 'Tuition Fee', '30000.00', '2020-12-01', '2021-01-01'),
('4660', 'Hostel Fee', '15000.00', '2020-12-15', '2021-01-05'),
('4770', 'Medical Fee', '5000.00', '2020-11-01', '2021-01-31'),
('4880', 'Transport Fee', '2000.00', '2020-06-15', '2020-08-15'),
('4990', 'Sports Fee', '10000.00', '2020-08-02', '2020-11-15');

insert into Student_Bills(id, student_id, bill_id) VALUES
('0001', '12345', '4567'),
('0002', '12345', '4660'),
('0003', '12345', '4770'),
('0004', '12345', '4880'),
('0005', '12345', '4990'),
('0006', '12346', '4567'),
('0007', '12346', '4660'),
('0008', '12346', '4770'),
('0009', '12346', '4880'),
('0010', '12346', '4990'),
('0011', '12347', '4567'),
('0012', '12347', '4660'),
('0013', '12347', '4770'),
('0014', '12347', '4880'),
('0015', '12347', '4990'),
('0016', '12348', '4567'),
('0017', '12348', '4660'),
('0018', '12348', '4770'),
('0019', '12348', '4880'),
('0020', '12348', '4990');


insert into Student_Payment(id, student_id, description, amount, payment, bill_id) VALUES
('0001', '12345', 'Tuition Fee', '30000.00', '15000.00', '4567'),
('0002', '12345', 'Hostel Fee', '15000.00', '12000.00', '4660'),
('0003', '12345', 'Medical Fee', '5000.00', '5000.00', '4770'),
('0004', '12345', 'Transport Fee', '2000.00', '1500.00', '4880'),
('0005', '12345', 'Sports Fee', '10000.00', '10000.00', '4990'),
('0006', '12346', 'Tuition Fee', '30000.00', '30000.00', '4567'),
('0007', '12346', 'Hostel Fee', '15000.00', '14000.00', '4660'),
('0008', '12346', 'Medical Fee', '5000.00', '3000.00', '4770'),
('0009', '12346', 'Transport Fee', '2000.00', '2000.00', '4880'),
('0010', '12346', 'Sports Fee', '10000.00', '8000.00', '4990'),
('0011', '12347', 'Tuition Fee', '30000.00', '20000.00', '4567'),
('0012', '12347', 'Hostel Fee', '15000.00', '15000.00', '4660'),
('0013', '12347', 'Medical Fee', '5000.00', '5000.00', '4770'),
('0014', '12347', 'Transport Fee', '2000.00', '2000.00', '4880'),
('0015', '12347', 'Sports Fee', '10000.00', '5000.00', '4990'),
('0016', '12348', 'Tuition Fee', '30000.00', '30000.00', '4567'),
('0017', '12348', 'Hostel Fee', '15000.00', '15000.00', '4660'),
('0018', '12348', 'Medical Fee', '5000.00', '5000.00', '4770'),
('0019', '12348', 'Transport Fee', '2000.00', '2000.00', '4880'),
('0020', '12348', 'Sports Fee', '10000.00', '10000.00', '4990');







