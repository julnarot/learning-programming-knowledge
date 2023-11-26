export class PersonEntity {
  id?: number;
  names?: number;
  surnames?: number;
  dni?: number;

  isValid(): boolean {
    return !!this.names  && !!this.surnames && !!this.dni ;
  }
}
