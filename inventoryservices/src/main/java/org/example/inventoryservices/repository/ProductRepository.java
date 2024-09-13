package org.example.inventoryservices.repository;

import org.example.inventoryservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mohamedyoussfi
 **/
public interface ProductRepository extends JpaRepository<Product,String> {
}
