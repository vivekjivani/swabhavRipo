import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './fregments/homeComponent';
import { ProductDetailComponent } from './fregments/productDetailComponent';
import { ProductListComponent } from './fregments/productListComponent';
import { RouterModule } from '@angular/router';
import { RouteArray } from './RouteConfig';
import { ProductApiService } from './services/ProductApiService';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProductDetailComponent,
    ProductListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(RouteArray)
  ],
  providers: [ProductApiService],
  bootstrap: [
    AppComponent,
  ]
})
export class AppModule { }
