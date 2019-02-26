import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {Http,Response} from '@angular/http';
import { Employee } from './employee';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  constructor(private http :Http) { }

  searchEmployee(empId:number) :Observable<Employee> {
    return this.http.get
    ("http://localhost:8080/FTP117/api/employees/"+empId)
    .map((res :Response) =>res.json());
  }
  getEmployees() :Observable<Employee[]> {
    return this.http.get
    ("http://localhost:8080/FTP117/api/employees")
    .map((res :Response) =>res.json());
  }
}
