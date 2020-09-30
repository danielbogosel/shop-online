package ro.licenta.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.licenta.shop.entity.Product;

public interface   ProductRepository extends JpaRepository<Product, Long> {
}
