import {Component, OnInit} from '@angular/core';
import {Seguro} from '../../models/seguro';
import {Observable, of} from 'rxjs';
import {MarcaCarro} from '../../models/MarcaCarro';
import {MarcaCarroService} from '../../services/marca-carro.service';
import {SeguroService} from "../../services/seguro.service";
import {PushNotificationService} from '../../services/push-notification.service';

@Component({
    selector: 'app-formulario-seguros',
    templateUrl: './formulario-seguros.component.html',
    styleUrls: ['./formulario-seguros.component.css']
})
export class FormularioSegurosComponent implements OnInit {
    public seguro = new Seguro();
    public marcasCarro$: Observable<MarcaCarro[]> = of([]); // coloque dolar when use observable varible

    constructor(
        private marcaCarroService: MarcaCarroService,
        private seguroService: SeguroService,
        private pushNotification: PushNotificationService,
    ) {
    }

    ngOnInit(): void {
        this.marcasCarro$ = this.marcaCarroService.getMarcas();
    }


    cadastrar() {
        this.seguro.id = this.seguro.placaCarro;
        this.seguroService.salvar(this.seguro);
    }

    sendNotification() {
        this.pushNotification.sendNotification({notification: 'mino', vibrate: 'jeje'}).subscribe(
            r => {
                console.log('whattt datt', r);
            }
        )
    }

}
