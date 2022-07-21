export class Product {
  id?: number;
  name?: string;
  description?: string;

  constructor() {
  }

  assign(obj: Product) {
    Object.assign(this, obj)
  }

  isSame(obj: Product): boolean {
    return JSON.stringify(this) === JSON.stringify(obj)
  }

}
