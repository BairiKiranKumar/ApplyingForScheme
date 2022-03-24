import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AcademicDetailsComponent } from './academic-details/academic-details.component';
import { BasicDetailsComponent } from './basic-details/basic-details.component';
import { ContactDetailsComponent } from './contact-details/contact-details.component';
import { DisplayComponent } from './display/display.component';
import { FeeDetailsComponent } from './fee-details/fee-details.component';
import { OtherDetailsComponent } from './other-details/other-details.component';
import { SubmitDetailsComponent } from './submit-details/submit-details.component';
import { TenthDetailsComponent } from './tenth-details/tenth-details.component';
import { TwelthDetailsComponent } from './twelth-details/twelth-details.component';

const routes: Routes = [
  {path:'BasicDetails',component:BasicDetailsComponent},
  {path:'AcademicDetails',component:AcademicDetailsComponent},
  {path:'TenthDetails',component:TenthDetailsComponent},
  {path:'TwelthDetails',component:TwelthDetailsComponent},
  {path:'FeeDetails',component:FeeDetailsComponent},
  {path:'OtherDetails',component:OtherDetailsComponent},
  {path:'ContactDetails',component:ContactDetailsComponent},
  {path:'SubmitDetails',component:SubmitDetailsComponent},
  {path:'Display',component:DisplayComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
