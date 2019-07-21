import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../types/user';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private readonly url: string = environment.baseUrl + environment.userPath;

  constructor(private http: HttpClient) { }

  public getUser(username: string) {

    return this.http.get<User>(this.url + '/' + username);

  }

}
