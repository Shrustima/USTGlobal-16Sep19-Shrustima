import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-searchbycategory',
  templateUrl: './searchbycategory.component.html',
  styleUrls: ['./searchbycategory.component.css']
})
export class SearchbycategoryComponent implements OnInit {

  constructor(private service: SmsService) { }

  products: [] = null;

  ngOnInit() {
  }

  searchByCategory(category) {
    this.service.searchByCategory(category).subscribe(resp => {
      console.log(resp);
      this.products = resp.productBeans;
    }, err => {
      console.log(err);
    });
  }

}
