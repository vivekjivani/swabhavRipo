create table College (
	CollegeId int,
	CollegeName varchar(50),
	City varchar(15),
	State varchar(15),
	primary key (CollegeId)
);

create table Student(
	StudentId int,
	CollegeId int,
	EnrollNo int,
	FirstName varchar(15),
	LastName varchar(15),
	Email varchar(30),
	Phone numeric(10),
	primary key (StudentId),
	foreign key (CollegeId) references College(CollegeId)
);

create table CollegeDepartment (
	DepartmentId int,
	DepartmentName varchar(15),
	CollegeId int,
	primary key (DepartmentId),
	foreign key (CollegeId) references College(CollegeId)
);

create table Professor(
	ProfessorId int,
	CollegeId int,
	ProfessorName varchar(20),
	Phone numeric(10),
	primary key (ProfessorId),
	foreign key (CollegeId) references College(CollegeId),
);

insert into College values(101,'MGITER', 'Navsari', 'Gujarat');
insert into College values(102,'VBTech', 'Navsari', 'Gujarat');
insert into College values(103,'MaliBaa', 'Bardoli', 'Gujarat');
insert into College values(104,'SCATE', 'Surat', 'Gujarat');

insert into Student values(01, 101, 1001, 'vivek', 'jivani', 'vivek@gmail.com', 9089786756);
insert into Student values(02, 101, 1002, 'karan', 'savani', 'karan@gmail.com', 4352637874);
insert into Student values(03, 102, 1003, 'paras', 'sakhavala', 'paras@gmail.com', 6568765432);
insert into Student values(04, 102, 1004, 'kishan', 'jivani', 'kishan@gmail.com', 0987654321);
insert into Student values(05, 103, 1005, 'roy', 'patel', 'roy@gmail.com', 6753425673);
insert into Student values(06, 104, 1006, 'kavya', 'patel', 'kavya@gmail.com', 0987897654);
insert into Student values(07, 104, 1007, 'niya', 'bhimani', 'niya@gmail.com', 3456543678);

insert into Professor values(001, 101, 'chandani', 7890789078);
insert into Professor values(002, 101, 'ritesh', 7867564534);
insert into Professor values(003, 102, 'ami', 1234321234);
insert into Professor values(004, 103, 'jigisha', 7657658764);
insert into Professor values(005, 104, 'jagruti', 3425435263);
insert into Professor values(006, 102, 'kajal', 9089899089);
insert into Professor values(007, 103, 'malay', 8766554433);
insert into Professor values(008, 104, 'sparsh', 4455663366);
insert into Professor values(009, 101, 'ashok', 8899009900);
insert into Professor values(010, 102, 'narayan', 8798000000);
insert into Professor values(011, 103, 'dhiru', 1290790989);
insert into Professor values(012, 104, 'ankur', 7788997788);

insert into CollegeDepartment values(01, 'EC', 101);
insert into CollegeDepartment values(02, 'ELE', 101);
insert into CollegeDepartment values(03, 'Mech', 101);
insert into CollegeDepartment values(04, 'Civil', 101);
insert into CollegeDepartment values(05, 'EC', 102);
insert into CollegeDepartment values(06, 'ELE', 102);
insert into CollegeDepartment values(07, 'Mech', 102);
insert into CollegeDepartment values(08, 'Civil', 102);
insert into CollegeDepartment values(09, 'EC', 103);
insert into CollegeDepartment values(10, 'ELE', 103);
insert into CollegeDepartment values(11, 'Mech', 103);
insert into CollegeDepartment values(12, 'Civil', 103);
insert into CollegeDepartment values(13, 'EC', 104);
insert into CollegeDepartment values(14, 'ELE', 104);
insert into CollegeDepartment values(15, 'Mech', 104);
insert into CollegeDepartment values(16, 'Civil', 104);

select * from Student;
select * from College;
select * from CollegeDepartment;
select * from Professor;