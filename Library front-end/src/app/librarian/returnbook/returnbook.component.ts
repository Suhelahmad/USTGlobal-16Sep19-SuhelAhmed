import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-returnbook',
  templateUrl: './returnbook.component.html',
  styleUrls: ['./returnbook.component.css']
})
export class ReturnbookComponent implements OnInit {
books = new Array();
selectedStudent;
  constructor(private  service: LibraryserviceService) { 
    this.returnBooklist();
  }

  studentDetail(student){
    this.selectedStudent=student;
  }

  returnBooklist(){
    this.service.returnBook().subscribe(data=>{
      console.log("data success",data);
      // this.books=data.bookIssueBeans.book;
      for(let val=0;val<data.bookIssueBeans.length;val++) {
        this.books.push({...data.bookIssueBeans[val].book, ...data.bookIssueBeans[val].student});
      }
      console.log("selected ",this.books)
    }, err=>{
      console.log("error");
    }, ()=>{
      console.log('success')
    })
  }
  ngOnInit() {
  }
  returnBook(book){
    console.log(book)
  }
  studentDetails(book){
    console.log(book)
  }
}
