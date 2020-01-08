import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';
import { SearchbycategoryComponent } from './searchbycategory/searchbycategory.component';
import { SearchbycompanyComponent } from './searchbycompany/searchbycompany.component';
import { AddComponent } from './add/add.component';
import { UpdateComponent } from './update/update.component';


const routes: Routes = [
  {path : 'header', component : HeaderComponent},
  {path : 'footer', component : FooterComponent},
  {path : 'home', component : HomeComponent},
  {path : 'searchbyname', component : SearchbynameComponent},
  {path : 'searchbycategory', component : SearchbycategoryComponent},
  {path : 'searchbycompany', component : SearchbycompanyComponent},
  {path : 'add', component : AddComponent},
  {path : 'update', component : UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
