import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  dogList: Array<String> = [`pitbull`, `corgi`, `german shepard`, `shitzu`, `chuwawa`];

  constructor() { }

  ngOnInit() {
  }

}
