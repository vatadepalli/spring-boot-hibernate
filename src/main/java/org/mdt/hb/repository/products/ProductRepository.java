package org.mdt.hb.repository.products;

import org.mdt.hb.model.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}