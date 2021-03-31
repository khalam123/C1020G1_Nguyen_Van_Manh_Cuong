import { Component, OnInit } from '@angular/core';
export interface IStudent{
  id: number;
  name: string;
  age: number;
  mark: number;
  image: string;
}
@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  student: IStudent = {
    id: 1,
    name: 'Lee Quang Nhat',
    age: 18,
    mark: 0,
    image: 'file:///Users/Ryan/Downloads/133843015_303897737696043_5937587967841711000_n.jpg'
  };

  constructor() { }
  ngOnInit(): void {
  }

  getMark(value: any) {
    this.student.mark = value;
  }
}
