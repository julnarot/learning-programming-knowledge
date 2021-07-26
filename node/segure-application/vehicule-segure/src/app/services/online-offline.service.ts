import {Injectable} from '@angular/core';
import {Observable, Subject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class OnlineOfflineService {
  private statusConexao$ = new Subject<boolean>();

  constructor() {
    window.addEventListener('online', () => this.actualizaStatusConexao());
    window.addEventListener('offline', () => this.actualizaStatusConexao());
  }


  get isOnline(): boolean {
    return !!window.navigator.onLine;
  }

  get statusConexao(): Observable<boolean> {
    return this.statusConexao$.asObservable();
  }

  // tslint:disable-next-line:typedef
  actualizaStatusConexao() {
    this.statusConexao$.next(this.isOnline);
  }
}
