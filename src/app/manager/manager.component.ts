import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/employee';
import { Observable } from 'rxjs';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent implements OnInit {

  employee :Observable<Employee>;
  empId :number;
  constructor(private employeeService :EmployeeService) {
    this.empId =parseInt(localStorage.getItem("mgr"));
    this.employee =employeeService.searchEmployee(this.empId);
   }
  ngOnInit() {
  }

}
