import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  baseURL = 'http://localhost:8080';
  isALoggedIn = false;
  isLLoggedIn = false;
  isSLoggedIn = false;
  home = true;
  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/libms/library/librarian/user', user);
  }

  isAdminLoggedIn() {
    if (this.isALoggedIn) {
      return true;
    }
    return false;
  }

  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isSLoggedIn) {
      return true;
    }
    return false;
  }
}
