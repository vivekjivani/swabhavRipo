
create table Department (
	DepartmentId int,
	DepartmentName varchar(20),
	Location varchar(30),
	primary key (DepartmentId)
);

create table Employee (
	EmployeeNo int,
	EmployeeName varchar(15),
	Salary int,
	DepartmentId int,
	primary key (EmployeeNo),
	foreign key (DepartmentId) references Department(DepartmentId)
);

insert into Department values(10,'marketing','mumbai');
insert into Department values(20,'management','pune');
insert into Department values(30,'selling','mumbai');
insert into Department values(40,'manufacturing','mumbai');

insert into Employee values(101,'vivek',10000,10);
insert into Employee values(102,'paras',20000,30);
insert into Employee values(103,'karan',30000,40);
insert into Employee values(104,'darshan',20000,30);
insert into Employee values(105,'manish',10000,40);

select * from Employee;
select * from Department;