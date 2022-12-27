CREATE DATABASE hrms;

create table  tbl_dept(

dept_no int(11) not null auto_increment,

dept_name varchar(100),

dept_location varchar(100),

PRIMARY KEY (dept_no)

)auto_increment = 10;

create table tbl_user(

user_id int(15) not null auto_increment,

user_name varchar(100),

password varchar(50),

email_id varchar(100),

user_type varchar(50),

primary key(user_id)

);

create table tbl_pay_grade(

grade_id int(15) not null auto_increment,

grade_name varchar(100) not null,

grade_basic bigint(100),

grade_ta int(15),

grade_da int(15),

grade_hra int(15),

grade_ma int(15),

grade_bonus int(15),

grade_pf int(15),

grade_pt int(15),

primary key(grade_id)
);

create table tbl_employee(

emp_no int(15) not null auto_increment,

emp_desig varchar(100),

first_name varchar(100),

last_name varchar(100),

dob  date,

hire_date date,

gender varchar(1),

email_id varchar(100),

mobile_no bigint(20),

pan_no varchar(100),

primary key(emp_no)

);

create table tbl_emp_grade_detail(

id int(15) not null auto_increment,

emp_no int(15),

emp_dept_no int(15),

emp_grade_id int(15),

emp_from_date date,

emp_to_date date,

emp_manager_no int(15),

primary key (id),

foreign key(emp_no) references tbl_employee(emp_no),

foreign key(emp_dept_no) references tbl_dept(dept_no),

foreign key(emp_grade_id) references tbl_pay_grade(grade_id)

);

create table tbl_emp_address(
id int(15) not null auto_increment,
emp_no int(15),
h_no varchar(20),

street_no varchar(20),


colony varchar(20),
locality varchar(20),

pincode int,

city varchar(50),

state varchar(50),

country varchar(50),
primary key(id),
foreign key(emp_no) references tbl_employee(emp_no)

);

create table tbl_emp_salary_detail(

id int(15) not null auto_increment,

emp_no int(15),

emp_salary_month  bigint(20),

emp_salary_year bigint(20),

emp_basic bigint(15),

emp_da int(15),

emp_ta int(15),

emp_hra int(15),

emp_ma int(15),

emp_bonus int(15),

emp_pf int(15),

emp_pt int(15),

emp_tax int(15),

emp_gross bigint(20),

emp_net_salary bigint(20),

emp_deductions bigint(20),

primary key(id)

);

ALTER TABLE tbl_employee 
ADD password varchar(50);

insert into tbl_user(user_name,password,email_id,user_type) values("1111111111","Admin@123","admin@123","ADMIN");
