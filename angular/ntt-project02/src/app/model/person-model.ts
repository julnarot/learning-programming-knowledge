export class PersonModel {
  constructor(
    public user: string,
    public names: string,
    public surnames: string,
    public dni: number,
    public links: string[]
  ) {}
}
