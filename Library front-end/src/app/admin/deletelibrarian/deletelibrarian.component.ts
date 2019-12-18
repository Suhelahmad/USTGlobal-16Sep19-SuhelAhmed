import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-deletelibrarian',
  templateUrl: './deletelibrarian.component.html',
  styleUrls: ['./deletelibrarian.component.css']
})
export class DeletelibrarianComponent implements OnInit {
  message: any;

  constructor(private service:LibraryserviceService) { }

  ngOnInit() {
  }
  searchLibrarian(form){
    this.message = null;
    console.log(form.value);
    this.service.deleteLibrarian(form.value).subscribe(data=>{
      console.log("data is added",data);
      if(data.statusCode === 201){
        this.message = 'Librarian removed Successfully'
      }
      // console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
    // this.service.deleteLibrarian(form.value);
  }
}
