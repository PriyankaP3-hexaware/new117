import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { UserComponent } from './user/user.component';
import { HttpModule } from '@angular/http';
import { LoginComponent } from './login/login.component';
import {FormsModule} from '@angular/forms';
import { Routes,RouterModule } from '@angular/router';
import { EmployComponent } from './employ/employ.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EmployeeComponent } from './employee/employee.component';
import { ManagerComponent } from './manager/manager.component';
import { LeavePendingComponent } from './leave-pending/leave-pending.component';
import { LeavehistoryComponent } from './leavehistory/leavehistory.component';
import { ApprovedenyComponent } from './approvedeny/approvedeny.component';
import { ApplyleaveComponent } from './applyleave/applyleave.component';
import { DropdownComponent } from './dropdown/dropdown.component';
import { RoutedemoComponent } from './routedemo/routedemo.component';
import { SortdataPipe } from './sortdata.pipe';
const appRoutes : Routes = [
  {
    path :'user',component : UserComponent},
    {path :'login' ,component :LoginComponent},
    {path :'',component :EmployComponent},
    {path :'DashBoard',component :DashboardComponent},
    {path :'pending',component :LeavePendingComponent},
      {path :'LeaveHistory',component :LeavehistoryComponent},
      { path:'approveDeny',component :ApprovedenyComponent},
      { path:'applyLeave',component :ApplyleaveComponent},


  ];
@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    UserComponent,
    LoginComponent,
    EmployComponent,
    DashboardComponent,
    EmployeeComponent,
    ManagerComponent,
    LeavePendingComponent,
    LeavehistoryComponent,
    ApprovedenyComponent,
    ApplyleaveComponent,
    DropdownComponent,
    RoutedemoComponent,
    SortdataPipe
  ],
  imports: [
    BrowserModule,HttpModule,FormsModule, RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
