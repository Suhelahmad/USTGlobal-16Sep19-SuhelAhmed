import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-deletestudent',
  templateUrl: './deletestudent.component.html',
  styleUrls: ['./deletestudent.component.css']
})
export class DeletestudentComponent implements OnInit {
  message: string;

  constructor(private service:LibraryserviceService) { }

  ngOnInit() {
  }
  searchStudent(form){
    this.message = null;
    console.log(form.value);
    this.service.deleteStudent(form.value).subscribe(data=>{
      console.log("data is added",data);
      if(data.statusCode === 201){
        this.message = ' Student removed Successfully';
      }     // console.log(response);
    },err=>{
      console.log("data is not added")
    }, ()=>{
      console.log("data")
    })
    // this.service.deleteLibrarian(form.value);
  }

}
