import { IStudent } from './IStudent';
import { Component } from '@angular/core';

@Component({
    selector: 'swabhav-student',
    templateUrl: './student.component.html'
})
export class StudentComponent {

    student: IStudent;
    height:number = 220;
    width:number = 300;

    constructor() {
        this.student = {
            name: 'vivek',
            cgpa: 10,
            location: 'gujarat',
            dateOfJoin: 'apr 2015',
            profilePicture: 'assets/img/student.jpg',
        }
    }

}