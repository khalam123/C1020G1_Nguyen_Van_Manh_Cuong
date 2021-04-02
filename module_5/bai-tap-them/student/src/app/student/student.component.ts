import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

// export interface IStudent {
//   id: number;
//   name: string;
//   age: number;
//   mark: number;
//   image: string;
// }

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  @Input() student;
  constructor() {
  }
  ngOnInit(): void {
  }
}
