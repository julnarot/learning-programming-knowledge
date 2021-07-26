import {Injectable, Injector} from '@angular/core';
import {BaseService} from './base.service';
import {Seguro} from '../models/seguro';

@Injectable({
    providedIn: 'root'
})
export class SeguroService extends BaseService<Seguro> {

    constructor(
        protected  injector: Injector,
    ) {
        super(injector, 'seguros', 'http://localhost:9000/api/seguros');
    }

}
