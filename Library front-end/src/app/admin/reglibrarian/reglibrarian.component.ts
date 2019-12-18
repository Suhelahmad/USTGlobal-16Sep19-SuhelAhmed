import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-reglibrarian',
  templateUrl: './reglibrarian.component.html',
  styleUrls: ['./reglibrarian.component.css']
})
export class ReglibrarianComponent implements OnInit {
  constructor(private service: LibraryserviceService) { }

  get email() {
    return this.form.get('email');
  }
  get password() {
    return this.form.get('password');
  }
  get name() {
    return this.form.get('name');
  }

  message: string;
  form = new FormGroup({
    name: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required])
  });

  ngOnInit() {
  }

  addLibrarian(form) {
    this.message = null;
    this.service.registerLibrarian(form).subscribe(data => {
      console.log('data is added', data);
      if (data.statusCode === 201) {
        this.message = 'Librarian added successfully';
      }
    }, err => {
      console.log('data is not added');
    }, () => {
      console.log('data');
    });
    console.log('data is', form.value);
  }
}
