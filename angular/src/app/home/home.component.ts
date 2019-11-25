import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent  {
  news;

  constructor(private http: HttpClient) {
    this.getNews();

  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=bb34123a2bdb40d5b13b3d2fa10bd5d4').subscribe(data => {
    this.news = data.articles;
    // tslint:disable-next-line: align
  }, err => {
    console.log(err);
  // tslint:disable-next-line: no-unused-expression
  }, () => {
    console.log('news got successfuly');
  });
}

}

