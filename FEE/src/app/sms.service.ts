import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SmsService {

  constructor(private http: HttpClient) { }

  addProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/add', product);
  }

  updateProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/update', product);
  }

  searchByName(name): Observable<any> {
    return this.http.get(`http://localhost:8080/searchByName?name=${name}`);
  }

  searchByCategory(category): Observable<any> {
    return this.http.get(`http://localhost:8080/searchByCategory?category=${category}`);
  }

  searchByCompany(company): Observable<any> {
    return this.http.get(`http://localhost:8080/searchByCompany?company=${company}`);
  }

}
