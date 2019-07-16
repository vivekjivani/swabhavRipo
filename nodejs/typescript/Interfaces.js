function printManyStudent(students) {
    for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
        var student = students_1[_i];
        console.log(student);
    }
}
printManyStudent([{ rollno: 101, name: 'vivek', age: 21, cpi: 8.0 },
    { rollno: 102, name: 'darshan', age: 20, cpi: 9.0 },
    { rollno: 103, name: 'hiren', age: 21, cpi: 9.9 }]);
