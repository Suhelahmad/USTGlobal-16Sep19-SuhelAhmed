import { Component, OnInit } from '@angular/core';
import { FormControl, Validators, FormGroup } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {
available='available';
bookstatus;
  message: any;
  constructor(private service: LibraryserviceService,private route:Router) { }

  ngOnInit() {
  }

addBook(book){
  this.message = null;
console.log(book.value)
this.service.addBook(book).subscribe(data=>{
  console.log("successfully added Book", data);
  if(data.statusCode === 201){
    this.message = 'Book is Added Successfully';
  }
  console.log(data.description);
  this.bookstatus=data.description;
  // this.route.navigate(['libhome']);
  book.reset();
}, err=>{
  console.log("error");
}, ()=>{
  console.log("book not added")
})
}
}
