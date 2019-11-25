import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';
import { WeekDay } from '@angular/common';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
  users;
  selectedUser;
  today = new Date();
  constructor(private service: UserService) {
    console.log('constructor is executed');
    this.getData();
  }

  ngOnInit() {
    console.log('ngonit is executed');
  }

  ngDoCheck() {
    console.log('ngDoCheck is Executed');
  }

  ngAfterViewInit() {
    console.log('ngAFterViewInit is executed');
  }

  ngAfterViewChecked() {
    console.log('ngViewChecked Functon is executed');
  }

  ngOnDestroy() {
    console.log('ngDestroy function is exuted');
  }


  loginData(form: NgForm) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
      this.getData();

    } , err => {
      console.log(err);
    } , () => {
      console.log('data posted Successfuly');
    });
  }

  getData() {
    this.service.getUser().subscribe(data => {
      console.log(data);
      this.users = data;
    } , err => {
      console.log(err);
    } , () => {
      console.log('data got successfuly');
  });
 }

 deleteData(user) {
   console.log(user);
   this.service.deleteUser(user.id).subscribe(data => {
     console.log(data);
     this.getData();
   }, err => {
     console.log(err);
   }, () => {
     console.log("data deleted successfuly");
   });
}

selectUser(user) {
  console.log(user);
  this.selectedUser = user;
}

updateData(form) {
  console.log(form.value);
  this.service.updateUser(form.value.id , form.value).subscribe(data => {
    console.log(data);
    this.getData();
  }, err => {
    console.log(err);
  }, () => {
    console.log("data updated successfuly");
  });
 }
}

