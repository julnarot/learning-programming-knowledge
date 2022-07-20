export class Product {
  id?: number;
  name?: string;
  description?: string;

  constructor() {
  }
  assign(obj: Product) {
    Object.assign(this, obj)
  }

}
