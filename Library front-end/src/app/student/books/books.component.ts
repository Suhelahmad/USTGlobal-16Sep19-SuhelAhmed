import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  books: any;
  row = 0;
  constructor(private service: LibraryserviceService, private route: Router) {
    // if (service.isStudent) {

    // } else {
    //   route.navigate(['studentlogin']);
    // }
    this.getBooks();
    console.log("my calss", this.books)
  }

  issueBook(book) {

    const student = JSON.parse(localStorage.getItem('userDetails'));
    console.log('student is', student);
    console.log(book);
    this.service.requestIssue(book,student).subscribe(data => {
      console.log("requested for issue book");
      console.log(data);
    }, err => {
      console.log("failed")
    }, () => {
      console.log("data")
    })
  }

  getBooks() {
    this.service.getAllBooks().subscribe(data => {
      console.log("books are", data.bookBeans);
      this.books = data.bookBeans;
      console.log("my book", this.books);
    }, err => {
      console.log("error");
    }, () => {
      console.log("data got")
    })

  }
  ngOnInit() {
  }

}
