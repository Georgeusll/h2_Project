package com.codeforgyt.h2setup.repository;

import com.codeforgyt.h2setup.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {


}