import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor() { 
    console.log('update component loaded')
  }

  ngOnInit(): void {
  }

}
