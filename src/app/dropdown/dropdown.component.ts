import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-dropdown',
  templateUrl: './dropdown.component.html',
  styleUrls: ['./dropdown.component.css']
})
export class DropdownComponent implements OnInit {

  emp :Observable<Employee[]>;
  constructor(private empService :EmployeeService, private _router : Router) { 
    this.emp = empService.getEmployees();
  }

  ngOnInit() {
  }

}
