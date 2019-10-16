import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { CustomValidation } from './custom.validation';


@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  get email() {
    return this.form.get('movie');
  }
  get password() {
    return this.form.get('title');
  }
  form=new FormGroup({
    movie: new FormControl('',[Validators.required, CustomValidation.unique]),
    title : new FormControl('', [Validators.required]),
    url : new FormControl('', [Validators.required]),
    desc : new FormControl('', [Validators.required])
     

  });
  constructor() { }

  ngOnInit() {
    
  }
  loginData(form) {
    console.log(form);
  }

}
