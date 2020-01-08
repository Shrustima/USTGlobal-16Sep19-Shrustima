import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-searchbyname',
  templateUrl: './searchbyname.component.html',
  styleUrls: ['./searchbyname.component.css']
})
export class SearchbynameComponent implements OnInit {
  constructor(private service: SmsService) { }

  myProduct = null;

  ngOnInit() {
  }

  searchByName(name) {
    this.service.searchByName(name).subscribe(
      resp => {
        console.log(resp);
        this.myProduct = resp.productBean;
      }, err => {
        console.log(err);
      }
    );
  }
}
