import { Component, OnInit, NgModule } from '@angular/core';
import { User } from 'src/app/types/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-view-user',
  templateUrl: './view-user.component.html',
  styleUrls: ['./view-user.component.css']
})
export class ViewUserComponent implements OnInit {

  user: User = new User();

  username = "";

  getUser() {
    this.userService.getUser(this.username).subscribe( (data) => {this.user = data; } );
  }

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

}
