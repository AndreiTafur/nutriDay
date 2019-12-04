import { Component, OnInit } from '@angular/core';
import { HttpClientService, Persona } from '../service/httpclient.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  personas:Persona[];
    
   
  constructor(
    private httpClientService:HttpClientService
  ) { }

  ngOnInit() {
     this.httpClientService.getEmployees().subscribe(
      response =>this.handleSuccessfulResponse(response),
     );
  }

handleSuccessfulResponse(response)
{
    this.personas=response;
}

deleteEmployee(persona: Persona): void {
   this.httpClientService.deleteEmployee(persona)
     .subscribe( data => {
      this.personas = this.personas.filter(u => u !== persona);
   })
};


}