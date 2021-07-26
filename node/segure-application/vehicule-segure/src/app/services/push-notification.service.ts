import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class PushNotificationService {

  constructor(protected http: HttpClient) { }

  public sendNotification(params: any): Observable<any> {
    return this.http.post<any>('http://localhost:9000/api/newsletter', params);
  }
}
