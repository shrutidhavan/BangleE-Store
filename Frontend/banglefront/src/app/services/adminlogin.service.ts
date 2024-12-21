import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Adminlogin } from '../models/adminlogin';

@Injectable({
  providedIn: 'root'
})
export class AdminloginService {
  private serverurl="http://localhost:9009/admin"

  constructor(private http:HttpClient) { }

  login(e:any,p:any):Observable<Adminlogin[]>
  {
    return this.http.get<Adminlogin[]>(this.serverurl+"/login/"+e+"/"+p)
  }
}
