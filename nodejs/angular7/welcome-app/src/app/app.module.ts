import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { CgpaBedgePipe } from './pipes/cgpaBedge';
import { MultiBind } from './multiBinding/multiBind.component';
import { BallComponent } from './BlueBall/blueBall.component';
import { ToggelButtonComponent } from './toggelButton/toggelButtonComponent';


@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent,
    CgpaBedgePipe,
    MultiBind,
    BallComponent,
    ToggelButtonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent, StudentComponent, MultiBind, BallComponent]
})
export class AppModule { }
