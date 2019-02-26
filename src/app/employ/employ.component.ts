import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {
  emp :Observable<Employee[]>;
  constructor(private empService :EmployeeService, private _router : Router) { 
    this.emp = empService.getEmployees();
  }
  
  login(empId,empMgrId) {
    localStorage.setItem("empid",empId);
    localStorage.setItem("mgr",empMgrId);
    this._router.navigate(["/login"]);
  }
  ngOnInit() {
  }

}
