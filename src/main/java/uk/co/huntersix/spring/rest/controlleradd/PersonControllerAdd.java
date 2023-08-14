package uk.co.huntersix.spring.rest.controlleradd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.huntersix.spring.rest.model.Person;
import uk.co.huntersix.spring.rest.referencedata.PersonDataService;
import uk.co.huntersix.spring.rest.referencedataadd.PersonDataServiceAdd;


import java.util.List;

@RestController

public class PersonControllerAdd {

	
    private PersonDataServiceAdd personDataServiceAdd;

    public PersonControllerAdd(@Autowired PersonDataServiceAdd personDataServiceAdd) {
        this.personDataServiceAdd = personDataServiceAdd;
    }
    
   
    
    //Exercise 5
    @GetMapping("/personadd/")
    public String addPersonadd(){
     // String personDetailsadd = personDataServiceAdd.addPersonadd("HardfirstName"," Hard2ndName");
        //return personDetailsadd;
    	System.out.println("set 1");
    	//PersonDataServiceAdd.addPersonadd("HardfirstName"," Hard2ndName");
    	return "test";
    	
    	 
    }
}
   ///////////////////
    
//gradlew clean build
//gradlew run test 
//gradlew bootRun --args='--spring.profiles.active=local' --stacktrace
//http://localhost:8080/person/bally/clock
    
    /////////////////////
    
   
