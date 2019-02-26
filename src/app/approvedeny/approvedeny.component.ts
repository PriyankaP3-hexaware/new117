import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/employee.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs/internal/Observable';
import { Employee } from 'src/app/employee';
import { LeaveDetails } from '../leave-details';
import { LeavePendingService } from 'src/app/leave-pending.service';

@Component({
  selector: 'app-approvedeny',
  templateUrl: './approvedeny.component.html',
  styleUrls: ['./approvedeny.component.css']
})
export class ApprovedenyComponent implements OnInit {

  lempId :number;
  leaveId :number;
  msg :string;
  status :string;
  obj = new LeaveDetails();
  empId:number;
  leaveDetails: Observable<LeaveDetails>;
  employee : Observable<Employee>;
  constructor(private empService :EmployeeService, private _router : Router,private leaveService :LeavePendingService) {
    this.lempId=parseInt(localStorage.getItem("lempId"));
    this.empId =parseInt(localStorage.getItem("empid"));
    this.leaveId = parseInt(localStorage.getItem("leavid"));
    alert(this.leaveId);
    this.employee =empService.searchEmployee(this.lempId);
    this.leaveDetails = leaveService.getLeaveDetail(this.leaveId)
   }

   approve() {
     this.obj.leaveId =this.leaveId;
     this.status ="YES";
     this.leaveService.approveDeny(this.empId,this.status,this.obj).subscribe(
       dd =>{
         this.msg =dd;
       },
       errorMsg => {
         this.msg =errorMsg;
         console.log(errorMsg);
       }
     )
   }
   deny() {
    this.obj.leaveId =this.leaveId;
    this.status ="NO";
    this.leaveService.approveDeny(this.empId,this.status,this.obj).subscribe(
      dd =>{
        this.msg =dd;
      },
      errorMsg => {
        this.msg =errorMsg;
        console.log(errorMsg);
      }
    )
  }
  ngOnInit() {
  }

}
