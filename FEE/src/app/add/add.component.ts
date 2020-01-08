import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  message: string;

  constructor(private service: SmsService) { }

  addProduct: FormGroup = new FormGroup({
    name: new FormControl('', [Validators.required]),
    category: new FormControl('', [Validators.required]),
    company: new FormControl('', [Validators.required]),
    quantity: new FormControl('', [Validators.required]),
    price: new FormControl('', [Validators.required])
  });

  get nameInput() {
    return this.addProduct.get('name');
  }
  get categoryInput() {
    return this.addProduct.get('category');
  }
  get companyInput() {
    return this.addProduct.get('company');
  }
  get quantityInput() {
    return this.addProduct.get('quantity');
  }
  get priceInput() {
    return this.addProduct.get('price');
  }

  add() {
    this.service.addProduct(this.addProduct.value).subscribe(
      data => {
        console.log(data);
        this.message = data.description;
        this.addProduct.reset();
        alert('Product added successfully!');
      }, err => {
        console.log(err);
      }
    );
  }

  ngOnInit() {
  }
}
