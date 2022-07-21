import { Product } from "./product";

describe('Product Class tests', () => {
  let product: Product;

  beforeEach(() => {
    product = new Product;
  });


  it('Should have valid constructor', () => {
    expect(product).not.toBeNull();
  });

  it('Should get and set id correctly', () => {
    product.id = 1;
    expect(product.id).toEqual(1);
  });

  it('Should get and set name correctly', () => {
    product.name = 'testing';
    expect(product.name).toEqual('testing');
  });

  it('Should get and set description correctly', () => {
    product.description = 'description';
    expect(product.description).toEqual('description');
  });

  it('Should be assign object', () => {
    const baseData: Product = new Product();
    baseData.id = 1;
    product.assign(baseData);
    expect(product.id).toEqual(1);
  });

  it('Should be same object', () => {
    const secondProduct = new Product()

    secondProduct.id = 1;
    secondProduct.name = 'test1';

    product.id = 1;
    product.name = 'test1';

    expect(product.isSame(secondProduct)).toEqual(true);
  });

  it('Should be no same object', () => {
    const secondProduct = new Product()

    secondProduct.id = 1;
    secondProduct.name = 'test1';

    product.id = 1;
    product.name = 'test2';
    expect(product.isSame(secondProduct)).toEqual(false);
  });






})
