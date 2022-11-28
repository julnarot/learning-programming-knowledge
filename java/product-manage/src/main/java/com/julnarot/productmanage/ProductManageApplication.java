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
import java.util.stream.Collectors;
import java.util.function.Predicate;

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

            Customer dianaCustomer = new Customer();
            dianaCustomer.setName("Diana santos");

            TypeProduct clothType = new TypeProduct();
            clothType.setName("Cloth");

            TypeProduct foodType = new TypeProduct();
            foodType.setName("Food");

            TypeProduct foodProdType = typeProductRepository.save(foodType);
            TypeProduct clothProdType = typeProductRepository.save(clothType);

            Customer raulCustomerSaved = personRepository.save(raulCustomer);
            Customer dianaCustomersaver = personRepository.save(dianaCustomer);

            Product tomatoProduct = new Product();
            tomatoProduct.setName("Tomato");
            tomatoProduct.setTypeProduct(foodProdType);


            Product bananaProduct = new Product();
            bananaProduct.setName("Banana");
            bananaProduct.setTypeProduct(foodProdType);

            Product jeanProduct = new Product();
            jeanProduct.setName("Blue Jean");
            jeanProduct.setTypeProduct(clothProdType);

            Product jacketProduct = new Product();
            jacketProduct.setName("Jacket");
            jacketProduct.setTypeProduct(clothProdType);

            Product hatProduct = new Product();
            hatProduct.setName("Red Hat");
            hatProduct.setTypeProduct(clothProdType);

            Product clavatProduct = new Product();
            clavatProduct.setName("Red Clavat");
            clavatProduct.setTypeProduct(clothProdType);


            Product tomatoSaved = productRepository.save(tomatoProduct);
            Product bananaSaved = productRepository.save(bananaProduct);
            Product jeanSaved = productRepository.save(jeanProduct);
            Product jacketSaved = productRepository.save(jacketProduct);
            Product hatSaved = productRepository.save(hatProduct);
            Product clavatSaved = productRepository.save(clavatProduct);

            ShoppingCart firstShoppingcart = new ShoppingCart();
            firstShoppingcart.setCustomer(raulCustomerSaved);
            firstShoppingcart.setProduct(tomatoSaved);
            firstShoppingcart.setQuantity(2f);
            firstShoppingcart.setUnitaryPrice(0.5f);
            shoppingCartRepository.save(firstShoppingcart);


            ShoppingCart secondShoppingCart = new ShoppingCart();
            secondShoppingCart.setCustomer(raulCustomerSaved);
            secondShoppingCart.setProduct(bananaSaved);
            secondShoppingCart.setQuantity(1.6f);
            secondShoppingCart.setUnitaryPrice(3f);
            shoppingCartRepository.save(secondShoppingCart);

            ShoppingCart threeShoppingCart = new ShoppingCart();
            threeShoppingCart.setCustomer(raulCustomerSaved);
            threeShoppingCart.setProduct(jeanSaved);
            threeShoppingCart.setQuantity(5f);
            threeShoppingCart.setUnitaryPrice(0.5f);
            shoppingCartRepository.save(threeShoppingCart);

            ShoppingCart fourShoppingCart = new ShoppingCart();
            fourShoppingCart.setCustomer(raulCustomerSaved);
            fourShoppingCart.setProduct(jacketSaved);
            fourShoppingCart.setQuantity(1f);
            fourShoppingCart.setUnitaryPrice(120f);
            shoppingCartRepository.save(fourShoppingCart);

            ShoppingCart fiveShoppingCart = new ShoppingCart();
            fiveShoppingCart.setCustomer(raulCustomerSaved);
            fiveShoppingCart.setProduct(hatSaved);
            fiveShoppingCart.setQuantity(2f);
            fiveShoppingCart.setUnitaryPrice(10f);
            shoppingCartRepository.save(fiveShoppingCart);

            ShoppingCart sixShoppingCart = new ShoppingCart();
            sixShoppingCart.setCustomer(dianaCustomersaver);
            sixShoppingCart.setProduct(clavatSaved);
            sixShoppingCart.setQuantity(1f);
            sixShoppingCart.setUnitaryPrice(90f);
            shoppingCartRepository.save(sixShoppingCart);


            //List<ShoppingCart> shoppingsCart = shoppingCartRepository.getAllShoppingsCart();//.forEach(System.out::println);

            //Predicate<ShoppingCart> byCustomerId = person -> person.getCustomer().getId() == 2L;

            for (ShoppingCart sc : shoppingCartRepository
                    .getAllShoppingsCart()
                    .stream()
                    .filter(p -> p.getCustomer().getId() == 1L)
                    .collect(Collectors.toList())) {
                System.out.println("Customer: " + sc.getCustomer().getName());
                System.out.println("Product: " + sc.getProduct().getName() + " -> " + sc.getProduct().getTypeProduct().getName() + "\n");
            }
        };
    }

}
