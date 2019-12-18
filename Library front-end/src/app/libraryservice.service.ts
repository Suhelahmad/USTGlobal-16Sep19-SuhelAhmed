import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class LibraryserviceService {

  studBean : any[];
  sid;
  isAdmin = false;
  isLibrarian = false;
  isStudent = false;
  books : any;
  constructor(public http: HttpClient, private route: Router) { }

  userLogin(user) {
    return this.http.post<any>(`http://localhost:8088/lms/userlogin/${user.email}/${user.password}`, user);
  }

  
  requestReturn(student,form){
    const issue='return';
    console.log('return request')
    console.log("student id",this.sid)
    return this.http.put<any>(`http://localhost:8088/lms/returnBook/${student.student.sid}/${form.bid}`,form);

  }

  acceptIssue(book) {
      console.log('student',book.sid,'book', book.bid);
    return this.http.get<any>(`http://localhost:8088/lms/acceptIssue/${book.sid}/${book.bid}`);
  }

  deleteBook(form){
    
    return this.http.delete<any>(`http://localhost:8088/lms/removeBook/${form.bid}`);

  }

  editBook(book){
    return this.http.put<any>(`http://localhost:8088/lms/updateBook`,book);

  }

  issueBook(){
    return this.http.get<any>(`http://localhost:8088/lms/issueBook`,);

  }

  returnBook(){
    return this.http.get<any>(`http://localhost:8088/lms/returnBook`);

  }

  getAllBooks(){
    // var email=form.value.email;
    // var password=form.value.password;
    return this.http.get<any>(`http://localhost:8088/lms/getAllBook`);
  }

  addBook(book){
    return this.http.put<any>(`http://localhost:8088/lms/addBook`,book.value);
  }

  searchBook(book){
    return this.http.get<any>(`http://localhost:8088/lms/searchById/${book.bid}`);
  }

  getMybooks(student){
    console.log("my book method")
    console.log(this.sid);
    return this.http.get<any>(`http://localhost:8088/lms/getMyBooks/${student.student.sid}`)
  }

  requestIssue(form,student){
    const issue='issue';
    console.log('issue request',form,student)
    console.log("student id",student.student.sid,form.bid)
    return this.http.put<any>(`http://localhost:8088/lms/request/${student.student.sid}/${form.bid}`,form);

  }

  librarianLogin(form){
    var email=form.value.email;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8088/lms/librarianlogin/${email}/${password}`, form.value).subscribe(data=>{
      console.log("data is ",data);
      if(data.librarianBeans!=null) {
        this.isLibrarian = true;
        this.route.navigate(['libhome']);
        console.log(this.isAdmin);
      }else{
        this.route.navigate(['librarylogin']);
      }
    }, err=>{
      console.log("data not found");
    }, ()=>{
      console.log("data")
    })
  }
  adminLogout(){
    this.isAdmin=false;
    this.route.navigate(['adminlogin']);
  }
  studentLogout(){
    this.isStudent=false;
    this.route.navigate(['studentlogin']);
  }
  librarianLogut(){
    this.isLibrarian=false;
    this.route.navigate(['librarylogin']);
  }
  studentLogin(form) {
    var USN=form.value.USN;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8088/lms/studentLogin/${USN}/${password}`, form.value);
  }
  adminLogin(form) {
    
    var id=form.value.id;
    var password=form.value.password;
    return this.http.post<any>(`http://localhost:8088/lms/adminlogin/${id}/${password}`, form.value).subscribe(data=>{
      console.log("data is ",data.adminBeans);
      if(data.adminBeans!=null){
        this.isAdmin = true;
        this.route.navigate(['adminHome'])
        console.log(this.isAdmin);
      }else{
        this.route.navigate(['adminlogin']);
      }
    }, err=>{
      console.log("data not found");
    }, ()=>{
      console.log("data")
    })
  }
  registerStudent(form){
    var response;
    return this.http.post<any>(`http://localhost:8088/lms/registerStudent`,form.value);
  }
  registerLibrarian(form){
    var response;
    return this.http.put<any>(`http://localhost:8088/lms/registerLibrarian`,form.value);
  }

  
  deleteLibrarian(form){
    var lid=form.lid;
    return this.http.delete<any>(`http://localhost:8088/lms/deleteLibrarian/${lid}`);

  }

  deleteStudent(form){
   var sid = form.sid;
    return this.http.delete<any>(`http://localhost:8088/lms/deleteStudent/${sid}`);
 }
}
