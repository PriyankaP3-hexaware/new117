import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  empId :number;
  constructor( private _router : Router) { }

  
  applyLeave() {
    this._router.navigate(["/applyLeave"]);
  }
  ngOnInit() {
  }

}
