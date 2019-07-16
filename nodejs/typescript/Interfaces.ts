interface IStudent {
    rollno: number,
    name: string,
    age: number,
    cpi: number
}

function printManyStudent(students: IStudent[]) {
    for (let student of students) {
        console.log(student);
    }
}

printManyStudent([{ rollno: 101, name: 'vivek', age: 21, cpi: 8.0 },
{ rollno: 102, name: 'darshan', age: 20, cpi: 9.0 },
{ rollno: 103, name: 'hiren', age: 21, cpi: 9.9 }]);