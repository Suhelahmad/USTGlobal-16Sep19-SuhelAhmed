import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {
  books = new Array();
  students = new Array();
  selectedStudent;

  constructor(private service: LibraryserviceService) {
    this.issueBooklist();
   }

   issueBooklist() {
      this.service.issueBook().subscribe(data => {
        console.log('data success', data);
        for (let val = 0; val < data.bookIssueBeans.length; val++) {
          this.books.push({...data.bookIssueBeans[val].book, ...data.bookIssueBeans[val].student});
          // this.books.push(data.bookIssueBeans[val].student);
        }
        console.log('selected ', this.books);
        console.log('selected students', this.students);
      }, err => {
        console.log('error');
      }, () => {
        console.log('success');
      });
  }
  ngOnInit() {
  }
//   issueBook(book, student) {
//     this.service.issueBook(book).subscribe(data => {
//       console.log('books are', data.bookBeans);
//       this.books = data.bookBeans;
//       console.log('my book', this.books);
//     }, err => {
//       console.log('error');
//     }, () => {
//       console.log('data got');
//     })
//      console.log("book",book);
//      console.log('student',student)

issueBook(student) {
  console.log('issue book accept',student);
  this.service.acceptIssue(student).subscribe(data=>{
    console.log("accepted success",data);
  }, err=>{
    console.log("error");
  }, ()=>{
    console.log("updated success")
  });
}
studentDetail(student) {
  console.log('student',student);
  this.studentDetail = student;
  console.log('selected student',this.studentDetail)
}  
 
}
