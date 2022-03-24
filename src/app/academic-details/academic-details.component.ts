import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { AcademicDetails } from '../academic-details';
import { FormsModule } from '@angular/forms';
import { AcademicDetailsService } from '../academic-details.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-academic-details',
  templateUrl: './academic-details.component.html',
  styleUrls: ['./academic-details.component.css']
})
export class AcademicDetailsComponent implements OnInit {
  
  

   constructor(private myrouter:Router,private aca:AcademicDetailsService) { }
   
  ngOnInit(): void {
    
  }
  academicDetails:AcademicDetails= new AcademicDetails();

  saveAcademicDetails(academicDetailsForm:any){
      this.academicDetails=academicDetailsForm.value;
      console.log(academicDetailsForm.value);
      console.log(this.academicDetails);
      this.aca.addAcademicDetails(this.academicDetails).subscribe(
        (data)=>{
          console.log(data);
          console.log("Persisted");
          this.myrouter.navigate(['/TenthDetails']);
        },
        (error)=>{
           console.log(error)
        }
        )
  }
  // goTo(){
  //   this.myrouter.navigate(['/TenthDetails']);
  // }

}
