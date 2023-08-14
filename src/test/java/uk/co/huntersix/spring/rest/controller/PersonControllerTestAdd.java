package uk.co.huntersix.spring.rest.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import uk.co.huntersix.spring.rest.model.Person;
import uk.co.huntersix.spring.rest.referencedataadd.PersonDataServiceAdd;


@RunWith(SpringRunner.class)
@WebMvcTest(PersonControllerTestAdd.class)
//@WebMvcTest(PersonControllerAdd.class)
public class PersonControllerTestAdd {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonDataServiceAdd personDataService;

    @Test
    public void shouldReturnPersonFromService() throws Exception {
       // when(personDataServiceAdd.findPerson(any(), any())).thenReturn(new Person("Bally", "Clock"));
        this.mockMvc.perform(get("/personadd"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("id").exists())
            .andExpect(jsonPath("firstName").value("Bally"))
            .andExpect(jsonPath("lastName").value("Clock"));
    }
    
    
    
}