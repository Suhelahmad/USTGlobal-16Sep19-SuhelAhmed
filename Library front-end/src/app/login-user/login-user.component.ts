import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.css']
})
export class LoginUserComponent implements OnInit {

  user;
  message;
  constructor(private service: LibraryserviceService, private route: Router) { }


  ngOnInit() {
  }

  loginData(user) {
    console.log(user.value);
    this.service.userLogin(user.value).subscribe( data => {
      console.log('user', data);
      if (data.userBeans != null) {
        this.user = data.userBeans;
        localStorage.setItem('userDetails', JSON.stringify(this.user));
        console.log('librarian data is:', data);
        this.route.navigate(['libhome']);
      } else {
        this.message = 'Please Enter Valid Credential';
        this.route.navigate(['']);
        user.reset();
      }
    }, err => {
      console.log('error');
    }, () => {
      console.log('success');
    });
  }
}
