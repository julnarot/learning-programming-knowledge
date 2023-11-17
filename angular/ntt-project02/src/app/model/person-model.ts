export class PersonModel {
  constructor(
    public user?: string,
    public names?: string,
    public surnames?: string,
    public dni?: number,
    public links?: string[]
  ) {}

  resetValues(): void {
    this.user = '';
    this.names = '';
    this.surnames = '';
    this.dni = undefined;
    this.links = [];
  }
}
