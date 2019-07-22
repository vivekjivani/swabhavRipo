import { Route } from '@angular/router';
import { HomeComponent } from './component/homeComponent';
import { AboutComponent } from './component/aboutComponent';

export const RouteArray: Route[] = [
    { path: '', component: HomeComponent },
    { path: 'Home', component: HomeComponent},
    { path: 'About',component: AboutComponent}
]