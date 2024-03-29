import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-regstudent',
  templateUrl: './regstudent.component.html',
  styleUrls: ['./regstudent.component.css']
})
export class RegstudentComponent implements OnInit {
  constructor(private service: LibraryserviceService) { }



  get sname() {
    return this.form.get('sname');
  }

  get branch() {
    return this.form.get('branch');
  }
  get password() {
    return this.form.get('password');
  }
  get sem() {
    return this.form.get('sem');
  }
  get section() {
    return this.form.get('section');
  }
  get usn() {
    return this.form.get('usn');
  }

  get email() {
    return this.form.get('email');
  }

  message: string;
form = new FormGroup({
  sname : new FormControl('', [Validators.required]),
  password : new FormControl('', [Validators.required]),
  branch : new FormControl('', [Validators.required]),
  sem : new FormControl('', [Validators.required]),
  section : new FormControl('', [Validators.required]),
  usn : new FormControl('', [Validators.required]),
  email : new FormControl('', [Validators.required])
});

  ngOnInit() {
  }

addStudent(form) {
  this.message = null;
  this.service.registerStudent(form).subscribe(data => {
  console.log('data is added', data);
  if (data.statusCode === 201) {
    this.message = 'Student added successfully';
  }
}, err => {
  console.log('data is not added');
}, () => {
  console.log('data');
});
  console.log('data is', form.value);
}
}
