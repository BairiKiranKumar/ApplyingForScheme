import { Injectable } from '@angular/core';
import { AcademicDetails } from './academic-details';
import { AcademicDetailsComponent } from './academic-details/academic-details.component';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AcademicDetailsService {

  constructor(private myhttp:HttpClient) { }

  restUrl:string="http://localhost:9099/NationalScholarshipPortal/Scheme";

  getAcademicDetails(){
    return this.myhttp.get(this.restUrl+"/AllAcademicDetails")
  }

  addAcademicDetails(add:AcademicDetails){
    return this.myhttp.post(this.restUrl+"/AcademicDetails",add)
  }
  // addAcademicDetails(aca:Observable<AcademicDetails>){
  //   return this.myhttp.post(this.restUrl+"/AcademicDetails",aca)
  // }
}

