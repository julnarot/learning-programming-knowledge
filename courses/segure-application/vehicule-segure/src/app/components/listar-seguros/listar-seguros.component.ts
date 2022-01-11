import {Component, OnInit} from '@angular/core';
import {SeguroService} from "../../services/seguro.service";
import {Observable, of} from "rxjs";
import {Seguro} from "../../models/seguro";

@Component({
  selector: 'app-listar-seguros',
  templateUrl: './listar-seguros.component.html',
  styleUrls: ['./listar-seguros.component.css']
})
export class ListarSegurosComponent implements OnInit {

  seguros$: Observable<Seguro[]> = of([]);

  constructor(private segurosService: SeguroService) {
  }

  ngOnInit(): void {

    this.seguros$ = this.segurosService.listarSeguro();

  }

}
