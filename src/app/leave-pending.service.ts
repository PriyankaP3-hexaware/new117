import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {Http,Response} from '@angular/http';
import 'rxjs/add/operator/map';
import { LeaveDetails } from './leave-details';

@Injectable({
  providedIn: 'root'
})
export class LeavePendingService {

  constructor(private http :Http) { }
  getLeaveDetail(leaveEmpId :number) :Observable<LeaveDetails> {
    return this.http.get
    ("http://localhost:8080/FTP117/api/LeaveDetails/" +leaveEmpId)
    .map((res :Response) =>res.json());
  }
   getLeavePending(leaveEmpId :number) :Observable<LeaveDetails[]> {
    return this.http.get
    ("http://localhost:8080/FTP117/api/LeaveDetails/LeavePending/" +leaveEmpId)
    .map((res :Response) =>res.json());
  }
  getLeaveHistory(leaveEmpId :number) :Observable<LeaveDetails[]> {
    return this.http.get
    ("http://localhost:8080/FTP117/api/LeaveDetails/Leavehistory/" +leaveEmpId)
    .map((res :Response) =>res.json());
  }
  approveDeny(empMgrId :number, leaveStatus:string, ld: LeaveDetails) :Observable<string> {
    return this.http.post
    ("http://localhost:8080/FTP117/api/LeaveDetails/approvedeny/" +empMgrId +"/"+leaveStatus,ld)
    .map((res :Response) =>res.text());
  }
  applyLeave(empId:number,leavedetails:LeaveDetails):Observable<String> {
    
   return this.http.post
   ('http://localhost:8080/FTP117/api/LeaveDetails/ApplyLeave/'+ empId,leavedetails)
   .map(response=>response.text())
}

}
