import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; 

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { CgpaBedgePipe } from './pipes/cgpaBedge';


@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent,
    CgpaBedgePipe
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent, StudentComponent]
})
export class AppModule { }
