import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { CgpaBedgePipe } from './pipes/cgpaBedge';
import { MultiBind } from './multiBinding/multiBind.component';
import { BallComponent } from './BlueBall/blueBall.component';
import { ToggelButtonComponent } from './toggelButton/toggelButtonComponent';
import { StarRating } from './StarRating/starRatingComponent';
import { MathService } from './services/MathService';
import { NumberApiService } from './services/NumberApiService';
import { NumberFact } from './numberFacts/numberFacts';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent,
    CgpaBedgePipe,
    MultiBind,
    BallComponent,
    ToggelButtonComponent,
    StarRating,
    NumberFact
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [MathService, NumberApiService],
  bootstrap: [WelcomeComponent, StudentComponent, MultiBind, BallComponent, NumberFact]
})
export class AppModule { }
