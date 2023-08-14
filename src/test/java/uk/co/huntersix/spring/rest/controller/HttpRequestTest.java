package uk.co.huntersix.spring.rest.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnPersonDetails() throws Exception {
        assertThat(
            this.restTemplate.getForObject(
                "http://localhost:" + port + "/person/bally/clock",
                String.class
            )
        ).contains("Clock");
    }
    
    public void shouldReturnPersonFromServiceadd() throws Exception {
        assertThat(
            this.restTemplate.getForObject(
                "http://localhost:" + port + "/personadd",
                String.class
            )
        ).contains("");
    }
}
//gradlew clean build
//gradlew run test 
//gradlew bootRun --args='--spring.profiles.active=local' --stacktrace
//http://localhost:8080/person/bally/clock