import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Feedback } from '../models/feedback';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {
 private serverurl="http://localhost:9009/feedback"
  constructor(private http:HttpClient) { }

  savefeedback(fee:Feedback):Observable<Feedback>
  {
    return this.http.post<Feedback>(this.serverurl+"/addfeed",fee)
  }
  getallfeedback():Observable<Feedback[]>
  {
    return this.http.get<Feedback[]>(this.serverurl+"/feedbacks")
  }
}
