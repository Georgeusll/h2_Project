package com.codeforgyt.h2setup.repository;

import com.codeforgyt.h2setup.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {


}
