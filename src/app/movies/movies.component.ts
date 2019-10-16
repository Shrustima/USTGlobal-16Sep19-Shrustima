import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent  {
  movies;

  constructor(private http: HttpClient) {
    this.getMovies();
   }
   getMovies() {
     this.http.get<any>('http://www.omdbapi.com/?s=tt3896198&apikey=67612129').subscribe(data => {
     this.movies = data.articles;
   },err => {
     console.log(err);
   },() => {
     console.log("movie success");
   });

 
  }

}
