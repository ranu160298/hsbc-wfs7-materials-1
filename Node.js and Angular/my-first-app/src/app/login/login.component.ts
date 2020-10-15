import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username = undefined;
  password = undefined;

  handleLogin() {
    console.log('handle login');
    console.log("Username = "+this.username, "Password = "+this.password);
  }

}
