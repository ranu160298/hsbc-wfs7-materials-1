import { Component } from '@angular/core';
import { USER, USERNAME, USER_ARRAY } from './mock';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "Simple Demo";
  name = USERNAME;
  profile = USER; // {"name" & "dob"}
  
}
