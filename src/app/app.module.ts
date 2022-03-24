import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AcademicDetailsComponent } from './academic-details/academic-details.component';
import { BasicDetailsComponent } from './basic-details/basic-details.component';
import { FeeDetailsComponent } from './fee-details/fee-details.component';
import { OtherDetailsComponent } from './other-details/other-details.component';
//import { contactdetailsComponent } from './contactdetails/contactdetails.component';
import { TenthDetailsComponent } from './tenth-details/tenth-details.component';
import { TwelthDetailsComponent } from './twelth-details/twelth-details.component';
import { ContactDetailsComponent } from './contact-details/contact-details.component';
import { SubmitDetailsComponent } from './submit-details/submit-details.component';
import { FormsModule } from '@angular/forms';
import { DisplayComponent } from './display/display.component';

@NgModule({
  declarations: [
    AppComponent,
    AcademicDetailsComponent,
    BasicDetailsComponent,
    FeeDetailsComponent,
    OtherDetailsComponent,
   //ContactDetailsComponent,
    TenthDetailsComponent,
    TwelthDetailsComponent,
    ContactDetailsComponent,
    SubmitDetailsComponent,
    DisplayComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
