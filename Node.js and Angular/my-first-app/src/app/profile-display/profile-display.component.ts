import { Component, OnInit } from '@angular/core';
import {AppServiceService} from '../app-service.service'
@Component({
  selector: 'app-profile-display',
  templateUrl: './profile-display.component.html',
  styleUrls: ['./profile-display.component.css']
})
export class ProfileDisplayComponent  {
 
  userCollection : any = undefined;
  constructor(private service: AppServiceService) {}

  handleClick() {
    //this.userCollection = this.service.fetchUsers();
    this.service.fetchUsers()
      .subscribe((response) => {
        this.userCollection = response
        console.log(response);
      });
  }
  
}
