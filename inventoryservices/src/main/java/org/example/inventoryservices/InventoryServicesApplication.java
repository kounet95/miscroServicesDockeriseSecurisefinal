package org.example.inventoryservices;

import org.example.inventoryservices.entities.Product;
import org.example.inventoryservices.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.UUID;
@SpringBootApplication
public class InventoryServicesApplication {
    public static void main(String[] args) {

        SpringApplication.run(InventoryServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Computer")
                    .quantity(12)
                    .price(4300)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Phone")
                    .quantity(11)
                    .price(12000)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Printer")
                    .quantity(3)
                    .price(1200)
                    .build());
        };
    }
}
