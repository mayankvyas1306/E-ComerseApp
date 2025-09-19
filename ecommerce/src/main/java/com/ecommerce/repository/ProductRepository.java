// connecting with Mongo Repository to use ODM
package com.ecomerce.repository;
import com.ecomerce.model.product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<product , String>