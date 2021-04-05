import {Component, OnInit} from '@angular/core';
import {student} from '../model/StudentRepository';
import {Student} from '../model/Student';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {FormGroup, FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {

  constructor(private modalService: NgbModal) {
  }
  students = student;
  stu: Student;

  createForm = new FormGroup({
    id: new FormControl('', [Validators.required]),
    name: new FormControl('', [Validators.required]),
    age: new FormControl('', [Validators.required]),
    mark: new FormControl('', [Validators.required] )
    // id: new FormGroup(),
  });
  get id(){
    return this.createForm.get('id');
  }
  get name(){
    return this.createForm.get('name');
  }
  get age(){
    return this.createForm.get('age');
  }
  get mark(){
    return this.createForm.get('mark');
  }
  ngOnInit(): void {
  }

  idStudent(students: Student) {
    this.stu = students;
  }

  // change(checked: boolean){
  //   this.check = checked;
  // }
  openWindowCustomClass(content) {
    this.modalService.open(content, {windowClass: 'dark-modal'});
  }
  openWindowCustomClass1(content1) {
    this.modalService.open(content1, {windowClass: 'dark-modal'});
  }

  delete(studentDelete: Student){
    const index = student.indexOf(studentDelete);
    student.splice(index, 1);
  }

  createStudent() {
    this.students.push(this.createForm.value);
    this.createForm.reset();
  }

  openWindowCreateStudent(studentNew) {
    this.modalService.open(studentNew, {windowClass: 'dark-modal'});
  }
}
