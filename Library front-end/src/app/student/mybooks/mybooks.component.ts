import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { JsonPipe } from '@angular/common';

@Component({
  selector: 'app-mybooks',
  templateUrl: './mybooks.component.html',
  styleUrls: ['./mybooks.component.css']
})
export class MybooksComponent implements OnInit {
books=new Array();
row=0;
searchedBook;
bookName:String;
bookAuthor : String;
  constructor(private service: LibraryserviceService) {
    this.getMyBooks();
   }

  ngOnInit() {
  }


  returnBook(book){
    console.log(book);
    const student = JSON.parse(localStorage.getItem('userDetails'));
    console.log('book is', book)
    console.log('student is',student)
      this.service.requestReturn(student,book).subscribe(data=>{
      console.log("book requested to return ")
    }, err=>{
      console.log("error")
    }, ()=>{
      console.log("success");
    })
  }

  // detailBook(book){
  //   console.log(book.book.bid)
  //   this.service.searchBook(book.book).subscribe(data=>{
  //     console.log("searched book is",data.bookBeans);
  //     // this.searchedBook=data.bookBeans;
  //    for(let val=0;val<data.bookIssueBeans.length;val++){
  //         this.searchedBook.push(data.bookIssueBeans[val].book);
  //     }
  //     console.log(this.searchedBook);
  //   }, err=>{
  //     console.log("error")
  //   }, ()=>{
  //     console.log("got book")
  //   })
  // }

  detailBook(book) {
    this.searchedBook = book;
  }
  
getMyBooks() {
  const student =  JSON.parse(localStorage.getItem('userDetails'));
  console.log('student is',student)
  this.service.getMybooks(student).subscribe( data => {
    console.log('data got');
    for(let val in data.bookIssueBeans ) {
          this.books.push(data.bookIssueBeans[val].book);
      }
    console.log('my book are', this.books);
  }, err => {
    console.log('error');
  }, () => {
    console.log('data got');
  });
}

}
