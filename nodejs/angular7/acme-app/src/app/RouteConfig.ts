import { Route } from '@angular/router';
import { HomeComponent } from './fregments/homeComponent';
import { ProductListComponent } from './fregments/productListComponent';
import { ProductDetailComponent } from './fregments/productDetailComponent';

export const RouteArray: Route[] = [
    { path: '', component: HomeComponent },
    { path: 'Home', component: HomeComponent},
    { path: 'ProductList', component: ProductListComponent},
    { path: 'Product/:productId', component: ProductDetailComponent}
]