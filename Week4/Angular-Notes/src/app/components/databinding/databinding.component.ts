import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  title = `Interpolation`;

  interpolationNotation = `{{}}`;

  propertyNotation = `[]`;

  eventNotation = `()`;

  counter = 0;

  styleState = {
    color: `green`,
    backgroundColor: `pink`,
    border: `1px solid black`,
    cursor: `pointer`,
    margin: `2px`
  }

  addToCounter(): void {
    this.counter++;
  }

  constructor() { }

  ngOnInit() {
  }



}
