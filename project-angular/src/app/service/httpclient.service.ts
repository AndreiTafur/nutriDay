import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

export class Persona{
  constructor(
    public idpersona:string,
    public nombre:string,
    public password:string,
 
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
     }

     

     getEmployees()
  {
    let username='gfi'
    let password='gfi'
  
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    
       return this.httpClient.get<Persona[]>('http://localhost:8080/personas',{headers});
  }

  public deleteEmployee(persona) {
    let username='gfi'
    let password='gfi'
  
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    return this.httpClient.delete<Persona>("http://localhost:8080/personas" + "/"+ persona.idpersona,{headers});
  }

  public createEmployee(persona) {
    let username='gfi'
    let password='gfi'
  
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    return this.httpClient.post<Persona>("http://localhost:8080/personas", persona,{headers});
  }
}