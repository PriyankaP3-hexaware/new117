import { Component, OnInit } from '@angular/core';
import { LeaveDetails } from 'src/app/leave-details';
import { Observable } from 'rxjs';
import { LeavePendingService } from '../leave-pending.service';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-leave-pending',
  templateUrl: './leave-pending.component.html',
  styleUrls: ['./leave-pending.component.css']
})
export class LeavePendingComponent implements OnInit {
  
  showButton : boolean;

  leaveDetails :Observable<LeaveDetails[]>;
  empId :number;
  empData :Observable<Employee[]>;
  constructor(private leaveService :LeavePendingService,private employeeService :EmployeeService, private _router:Router) { 
    this.showButton=false;
    this.empId =parseInt(localStorage.getItem("empid"));
    
    this.leaveDetails = leaveService.getLeavePending(this.empId);
    this.empData =   employeeService.getEmployees(); 
      

  }

  setClickRowDup(leaveId,empId) {
    alert(leaveId);
    localStorage.setItem("leavid",leaveId);
    localStorage.setItem("lempId",empId);  
    alert(this.empId);
    this.showButton=true;
  }

  approveDeny() {

    this._router.navigate(["/approveDeny"]);

  }
  ngOnInit() {
  }

}
