import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { LoginResponse } from '../LoginResponse';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy {

  error: string;


  constructor(
    private auth: AuthService, private http: HttpClient
  ) { }




  register(registerForm: NgForm) {
    console.log(registerForm.value);
    this.http.post<LoginResponse>(`http://localhost:8080/libraryms/library/librarian/user`, registerForm.value).subscribe(response => {
      registerForm.reset();
      if (response) {
        alert('Student registered Note this ID for Login  ' + response.id);

      } else {
        alert('Failed to add Student');
      }
    });
  }


  ngOnInit() {
  }

  ngOnDestroy() {
    this.error = null;
  }

}
