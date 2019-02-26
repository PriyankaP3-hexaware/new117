import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { LeaveDetails } from '../leave-details';
import { Employee } from '../employee';
import { LeavePendingService } from '../leave-pending.service';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-leavehistory',
  templateUrl: './leavehistory.component.html',
  styleUrls: ['./leavehistory.component.css']
})
export class LeavehistoryComponent implements OnInit {

  leaveDetails :Observable<LeaveDetails[]>;
  empId :number;
  empData :Observable<Employee[]>;
  constructor(private leaveService :LeavePendingService,private employeeService :EmployeeService) { 
    this.empId =parseInt(localStorage.getItem("empid"));
    this.leaveDetails = leaveService.getLeaveHistory(this.empId);
    this.empData =   employeeService.getEmployees(); 
      
  }

  ngOnInit() {
  }

}
