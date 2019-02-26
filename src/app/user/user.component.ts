import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';
import { Observable } from 'rxjs';
import {User} from '../user' ;
import { LoginComponent } from 'src/app/login/login.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users :Observable<User[]>;
  constructor(private userService :UserService, private _router : Router) { 
    this.users = userService.getUsers();
  }
  
  login(username) {
    localStorage.setItem("user",username);
    this._router.navigate(["/login"]);
  }

  ngOnInit() {
  }

}
