package uk.co.huntersix.spring.rest.model;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class PersonTest {
    @Test
    public void shouldAssignIdWhenCreated() {
        Person classUnderTest = new Person("Bally", "Clock");

        assertNotNull(classUnderTest.getId());
    }

    @Test
    public void idsShouldBeDifferent() {
        Person classUnderTest1 = new Person("Bally", "Clock");
        Person classUnderTest2 = new Person("Dany", "Smith");

        assertFalse(classUnderTest1.getId().equals(classUnderTest2.getId()));
    }


    @Test
    public void shouldBeDifferent() {
        Person classUnderTest1 = new Person("Bally", "Clock");
        Person classUnderTest2 = new Person("Bally", "Clock");

        assertNotSame(classUnderTest1, classUnderTest2);
    }
}
