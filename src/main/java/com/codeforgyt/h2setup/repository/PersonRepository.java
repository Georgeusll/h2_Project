package com.codeforgyt.h2setup.repository;

import com.codeforgyt.h2setup.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {


}
