import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {

  closed = false;

  onNotify(message: boolean) {
    this.closed = message;
  }

  constructor() { }

  ngOnInit() {
  }

}
