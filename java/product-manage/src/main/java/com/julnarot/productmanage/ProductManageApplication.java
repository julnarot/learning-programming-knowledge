package com.julnarot.productmanage;

import com.julnarot.productmanage.models.Customer;
import com.julnarot.productmanage.models.Product;
import com.julnarot.productmanage.models.ShoppingCart;
import com.julnarot.productmanage.models.TypeProduct;
import com.julnarot.productmanage.repositories.ShoppingCartRepository;
import com.julnarot.productmanage.repositories.PersonRepository;
import com.julnarot.productmanage.repositories.ProductRepository;
import com.julnarot.productmanage.repositories.TypeProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProductManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductManageApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            PersonRepository personRepository,
            ProductRepository productRepository,
            TypeProductRepository typeProductRepository,
            ShoppingCartRepository shoppingCartRepository

    ) {
        return args -> {
            Customer raulCustomer = new Customer();
            raulCustomer.setName("Raul Jonatan");

            TypeProduct clothType = new TypeProduct();
            clothType.setName("Cloth");

            TypeProduct foodType = new TypeProduct();
            foodType.setName("Food");

            TypeProduct foodProdType = typeProductRepository.save(foodType);
            TypeProduct clothProdType = typeProductRepository.save(clothType);

            Customer customerSaved = personRepository.save(raulCustomer);

            Product tomatoProduct = new Product();
            tomatoProduct.setName("Tomato");
            tomatoProduct.setTypeProduct(foodProdType);


            Product bananaProduct = new Product();
            bananaProduct.setName("Banana");
            bananaProduct.setTypeProduct(foodProdType);

            Product jeanProduct = new Product();
            jeanProduct.setName("Blue Jean");
            jeanProduct.setTypeProduct(clothProdType);


            Product tomatoSaved = productRepository.save(tomatoProduct);
            Product bananaSaved = productRepository.save(bananaProduct);
            Product jeanSaved = productRepository.save(jeanProduct);

            ShoppingCart firstShoppingcart = new ShoppingCart();
            firstShoppingcart.setCustomer(customerSaved);
            firstShoppingcart.setProduct(tomatoSaved);
            firstShoppingcart.setQuantity(2f);
            firstShoppingcart.setUnitaryPrice(0.5f);
            shoppingCartRepository.save(firstShoppingcart);


            ShoppingCart secondShoppingCart = new ShoppingCart();
            secondShoppingCart.setCustomer(customerSaved);
            secondShoppingCart.setProduct(bananaSaved);
            secondShoppingCart.setQuantity(1.6f);
            secondShoppingCart.setUnitaryPrice(3f);
            shoppingCartRepository.save(secondShoppingCart);

            ShoppingCart threeShoppingCart = new ShoppingCart();
            threeShoppingCart.setCustomer(customerSaved);
            threeShoppingCart.setProduct(jeanSaved);
            threeShoppingCart.setQuantity(5f);
            threeShoppingCart.setUnitaryPrice(0.5f);
            shoppingCartRepository.save(threeShoppingCart);


            List<ShoppingCart> shoppingsCart = shoppingCartRepository.getAllShoppingsCart();//.forEach(System.out::println);

            for (ShoppingCart sc : shoppingsCart) {
                System.out.println("Customer: " + sc.getCustomer().getName());
                System.out.println("Product: " + sc.getProduct().getName() + " -> " + sc.getProduct().getTypeProduct().getName()+"\n");
            }
        };
    }

}
