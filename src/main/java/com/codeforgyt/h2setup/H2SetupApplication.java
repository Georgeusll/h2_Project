package com.codeforgyt.h2setup;

import com.codeforgyt.h2setup.model.Person;
import com.codeforgyt.h2setup.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2SetupApplication {

	public static void main(String[] args)

	{


		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2SetupApplication.class, args);
		PersonRepository personReposiory = configurableApplicationContext.getBean(PersonRepository.class);
	Person myPerson = new Person("John", "Doe");
//		personReposiory.save(myPerson);
//
	Person gio = new Person("Gio", "Bokhochadze");
//		personReposiory.save(gio);
//
	Person mari = new Person("Mari", "RameGvari");
//		personReposiory.save(mari);
//
	Person nika = new Person("Nika", "Solomnishvili");
//		personReposiory.save(nika);



	}

}
