import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-searchbycompany',
  templateUrl: './searchbycompany.component.html',
  styleUrls: ['./searchbycompany.component.css']
})
export class SearchbycompanyComponent implements OnInit {
  constructor(private service: SmsService) { }

  products: [] = null;

  ngOnInit() {
  }

  searchByCategory(company) {
    this.service.searchByCompany(company).subscribe(resp => {
      console.log(resp);
      this.products = resp.productBeans;
    }, err => {
      console.log(err);
    });
  }
}
