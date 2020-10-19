import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  name = undefined;constructor(private _activatedRoute : ActivatedRoute) { 
    console.log('dashboard component loaded')
  }

  ngOnInit(): void {
    this._activatedRoute.parent.params.subscribe((p: Params) => {
      this.name = p.username
    });
  }

}
