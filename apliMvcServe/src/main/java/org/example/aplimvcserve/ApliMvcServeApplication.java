package org.example.aplimvcserve;

import org.example.aplimvcserve.entities.Customer;
import org.example.aplimvcserve.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApliMvcServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApliMvcServeApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("oumar").email("med@gmail.com").build());
            customerRepository.save(Customer.builder().name("kounet").email("kounet@gmail.com").build());
            customerRepository.save(Customer.builder().name("grand").email("asmaa@gmail.com").build());
        };
    }
}
