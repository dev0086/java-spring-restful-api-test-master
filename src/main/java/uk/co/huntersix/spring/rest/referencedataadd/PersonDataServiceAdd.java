package uk.co.huntersix.spring.rest.referencedataadd;

import org.springframework.stereotype.Service;
import uk.co.huntersix.spring.rest.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class  PersonDataServiceAdd {

	public List<Person> PERSON_DATA_ADD = Arrays.asList(
	        new Person("John", "Benneth"),
	        new Person("Bally", "Clock"),
	        new Person("Dany", "Smith"),
	        new Person("Amy", "Smith")
	    );

	    

    
	   

	    public  void  addPersonadd ( String firstName,String lastName) {
	      //  String personDetailsadd = null;
	        System.out.println("addPersonadd ");
	      
	          //  Person newPersonadd = new Person(firstName, lastName);
	           // PERSON_DATA_ADD.add(newPersonadd);
	        
	      // return "Test";
	    }
	}


//gradlew clean build
//gradlew run test 
//gradlew bootRun --args='--spring.profiles.active=local' --stacktrace
//http://localhost:8080/person/bally/clock