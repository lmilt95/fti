package com.hendisantika.springbootrestapipostgresql;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SpringBootRestApiPostgresqlApplicationTests {

    @Test
    public void contextLoads() {
        // Add assertions to check conditions within the loaded context
        assertNotNull("Application context should not be null");
        // Add more assertions as needed
    }

}

