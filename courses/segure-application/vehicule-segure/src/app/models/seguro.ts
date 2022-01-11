import {MarcaCarro} from './MarcaCarro';

export class Seguro {
  id: string;
  marcaCarro: MarcaCarro;
  modeloCarro: string;
  placaCarro: string;
  nomePropietario: string;
  sobrenomePropietario: string;
  dataNacimientoPropietario: string;

  constructor() {
    this.marcaCarro = {} as MarcaCarro;
    this.id = '';
    this.modeloCarro = '';
    this.placaCarro = '';
    this.nomePropietario = '';
    this.sobrenomePropietario = '';
    this.dataNacimientoPropietario = '';
  }


}
