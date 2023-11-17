import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable()
export class ToastService {
  toast = new Subject<boolean>();
  showSuccess(message: string, title: string): void {
    alert(`[${title.toUpperCase()}] - ${message}`);
  }
}
