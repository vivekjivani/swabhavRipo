import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';

@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [WelcomeComponent, StudentComponent]
})
export class AppModule { }
