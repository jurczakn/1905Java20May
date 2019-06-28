import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

  @Input()
  closed = false;
  @Output()
  notify: EventEmitter<boolean> = new EventEmitter<boolean>();

  message = `Evertying is A O K`;
  detailedText = `It actually probably is still broken, but just ignore that.`;

  closeMessage(): void {
    this.notify.emit(true);
    this.closed = true;
  }

  constructor() { }

  ngOnInit() {
  }

}
