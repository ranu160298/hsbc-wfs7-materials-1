import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent  {
  @Input()
  childName = undefined;

  counter : number = 0;
  @Output()
  counterEvent : EventEmitter<number> = new EventEmitter<number>();
  
  incrementCounter() {
    this.counter++;
    this.counterEvent.emit(this.counter);
  }
}
