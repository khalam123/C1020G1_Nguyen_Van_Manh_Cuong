import { Component, OnInit } from '@angular/core';
import {student} from '../model/StudentRepository';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  student = student;
  constructor() { }

  ngOnInit(): void {
  }

}
