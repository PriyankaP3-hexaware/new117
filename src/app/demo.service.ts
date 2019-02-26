import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {
   sayHello() :string {
     return "welcome to angular ...";

   }
   topic() :string{
     return "Angular 7 services concept....";
   }

  constructor() { }
}
