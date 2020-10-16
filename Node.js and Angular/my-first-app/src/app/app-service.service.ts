import { Injectable } from '@angular/core';
import { USER_ARRAY } from './mock';

@Injectable({
  providedIn: 'root'
})
export class AppServiceService {

  constructor() { }

  login(username : string, password : string) : void {
    if(username == 'Alex') {
      console.log('log in successful')
    } else {
      console.log('login failed')
    }
  }
  fetchUsers() : any { 
    // import USER_ARRAY from mock.ts
    return USER_ARRAY;
  }
}
