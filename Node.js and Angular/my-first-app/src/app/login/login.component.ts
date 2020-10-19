import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username = undefined;
  password = undefined;
  // supply the router instance through constructor injection
  constructor(private _router : Router) {
    console.log("login component loaded")
  }
  
  handleSubmit(formValues : any) {
    //you must call the service method to authenticate
    let user = formValues.user;
    let pass = formValues.pass;
    if(pass == '1234') {
      // the url will be /success/user i.e., /success/Alex or /success/Bruce it binds to /success/:username
      this._router.navigate(["/success", user]);
    } else {
      this.username = undefined;
      this.password = undefined;
      this._router.navigate(["/login"]);
    }
  }

}
