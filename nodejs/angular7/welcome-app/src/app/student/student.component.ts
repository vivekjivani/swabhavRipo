import { IStudent } from './IStudent';
import { Component } from '@angular/core';


@Component({
    selector: 'swabhav-student',
    templateUrl: './student.component.html',
})
export class StudentComponent {

    student: IStudent;
    studentList: IStudent[];
    height: number = 220;
    width: number = 300;

    constructor() {
        this.student = {
            name: 'vivek',
            cgpa: 10,
            location: 'gujarat',
            dateOfJoin: 'apr 2015',
            profilePicture: 'assets/img/student.png',
        }
    }
    nameChange(newName: any){
        //console.log(newName);
        this.student.name = newName;
    }

    displayStudentList(){
        this.studentList = [
            {
                name: 'vivek',
                cgpa: 3,
                location: 'gujarat',
                dateOfJoin: 'apr 2015',
                profilePicture: 'assets/img/student.png',
            },{
                name: 'darshan',
                cgpa: 9,
                location: 'gujarat',
                dateOfJoin: 'Jan 2012',
                profilePicture: 'assets/img/student.png',
            },{
                name: 'hiren',
                cgpa: 9.8,
                location: 'gujarat',
                dateOfJoin: 'apr 2015',
                profilePicture: 'assets/img/student.png',
            },{
                name: 'karan',
                cgpa: 3,
                location: 'gujarat',
                dateOfJoin: 'Mar 2019',
                profilePicture: 'assets/img/student.png',
            },{
                name: 'kajol',
                cgpa: 5,
                location: 'gujarat',
                dateOfJoin: 'jun 2013',
                profilePicture: 'assets/img/student.png',
            }
        ];
    }

}