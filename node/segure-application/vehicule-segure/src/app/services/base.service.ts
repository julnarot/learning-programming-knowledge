import {Inject, Injectable, Injector} from '@angular/core';
import {Observable} from "rxjs";
import Dexie from "dexie";
import {HttpClient} from "@angular/common/http";
import {OnlineOfflineService} from "./online-offline.service";

@Injectable({
  providedIn: 'root'
})
export abstract class BaseService<T extends {id: string} > {
  private db: Dexie = new Dexie('db-seguros');

  private table: Dexie.Table<T, any> = {} as Dexie.Table<T, any>;

  protected http: HttpClient;
  protected onlineOfflineService: OnlineOfflineService;

  protected constructor(
    protected  injector: Injector,
    @Inject(String) protected nomeTabela: string,
    @Inject(String) protected urlApi: string,
  ) {
    this.http = this.injector.get(HttpClient);
    this.onlineOfflineService = this.injector.get(OnlineOfflineService);


    this.ouvirStatusConexao();
    this.iniciarIndexedDb();
  }

  // tslint:disable-next-line:typedef
  private salvarAPI(tabela: T) {
    this.http.post(this.urlApi, tabela).subscribe(
      () => alert('Seguro foi cadastrado'),
      (err) => console.log('error cadastrando tabela', err)
    );
  }

  // tslint:disable-next-line:typedef
  private async salvarIndexedDb(tabela: T) {
    try {
      await this.table.add(tabela);
      const todosSeguros: T[] = await this.table.toArray();
      console.log('tabelas foy salvo no indexdb', todosSeguros);
    } catch (error) {
      console.log('ERror al salvar tabela on indexdb', error);
    }

  }

  // tslint:disable-next-line:typedef
  private async enviarIndexParaApi() {
    const todosSeguros: T[] = await this.table.toArray();

    for (const tabela of todosSeguros) {
      this.salvarAPI(tabela);
      await this.table.delete(tabela.id);
      console.log(`tabela con id${tabela.id} was sincrinizated exitozamente`);
    }
  }

  // tslint:disable-next-line:typedef
  public salvar(tabela: T) {
    if (this.onlineOfflineService.isOnline) {
      this.salvarAPI(tabela);
    } else {
      this.salvarIndexedDb(tabela);
    }
  }

  listarSeguro(): Observable<T[]> {
    return this.http.get<T[]>(this.urlApi);
  }

  // tslint:disable-next-line:typedef
  ouvirStatusConexao() {
    this.onlineOfflineService.statusConexao
      .subscribe(online => {
        if (online) {
          this.enviarIndexParaApi();
        } else {
          console.log('estoy OFLINEEE ');
        }
      });
  }

  // tslint:disable-next-line:typedef
  iniciarIndexedDb() {
    // this.db = new Dexie('db-tabelas');
    this.db.version(1).stores({
      [this.nomeTabela]: 'id'
    });

    this.table = this.db.table(this.nomeTabela);
  }
}
