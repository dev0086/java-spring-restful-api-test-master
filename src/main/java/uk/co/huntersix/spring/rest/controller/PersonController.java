package uk.co.huntersix.spring.rest.controller;

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
//Spring 4.0 introduced the @RestController annotation in order to simplify the creation of 
//RESTful web services
// It's a convenient annotation that combines @Controller and @ResponseBody, which eliminates the need to annotate every 
//request handling method of the controller class with the @ResponseBody annotation.

public class PersonController {
    private PersonDataService personDataService;
    private PersonDataServiceAdd personDataServiceAdd;

    public PersonController(@Autowired PersonDataService personDataService) {
        this.personDataService = personDataService;
    }
    
    
    
    //Exercise 2
    @GetMapping("/person/{lastName}/{firstName}")
    public Person person(@PathVariable(value="firstName") String firstName,
    		             @PathVariable(value="lastName") String lastName) {
        Person person = personDataService.findPerson(lastName,firstName);
        if(person != null)
            return person;
        else {
            System.out.println("This person does not exist in the list");
            return null;
        }
    }

    //Exercise 3
    @GetMapping("/person/{lastName}")
    public List<Person> personWithSurname(@PathVariable(value="lastName") String lastName) {
        List<Person> personList = personDataService.findPersonWithSurname(lastName);
        if(personList.isEmpty())
            System.out.println("This person with given Surname does not exist");
        else if(personList.size() == 1)
            System.out.println("1 person with given Surname exist");
        else
            System.out.println("Multiple people with given Surname exists");
        return personList;
    }

    //Exercise 4
    @PostMapping("/person/{lastName}/{firstName}")
    public String addPerson(@PathVariable(value="firstName") String firstName,
    		                @PathVariable(value="lastName") String lastName) {
        String personDetails = personDataService.addPerson(firstName,lastName);
        return personDetails;
    }
    
    
   
}
    
   ///////////////////
    
   
    
    /////////////////////
    
   
