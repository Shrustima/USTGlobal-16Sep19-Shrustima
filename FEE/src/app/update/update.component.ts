import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  message: string;

  constructor(private service: SmsService) { }

  updateProduct: FormGroup = new FormGroup({
    id: new FormControl('', [Validators.required]),
    name: new FormControl('', [Validators.required]),
    category: new FormControl('', [Validators.required]),
    company: new FormControl('', [Validators.required]),
    quantity: new FormControl('', [Validators.required]),
    price: new FormControl('', [Validators.required])
  });

  get idInput() {
    return this.updateProduct.get('id');
  }
  get nameInput() {
    return this.updateProduct.get('name');
  }
  get categoryInput() {
    return this.updateProduct.get('category');
  }
  get companyInput() {
    return this.updateProduct.get('company');
  }
  get quantityInput() {
    return this.updateProduct.get('quantity');
  }
  get priceInput() {
    return this.updateProduct.get('price');
  }

  update() {
    this.service.updateProduct(this.updateProduct.value).subscribe(
      data => {
        console.log(data);
        this.message = data.description;
        this.updateProduct.reset();
        alert('Product updated successfully!');
      }, err => {
        console.log(err);
      }
    );
  }

  ngOnInit() {
  }
}
