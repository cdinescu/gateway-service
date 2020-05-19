package com.vitanum.gatewayservice.filter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.cors.reactive.CorsWebFilter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CORSFilterTest {

    @Autowired
    private CorsWebFilter corsWebFilter;

    @Test
    public void testCorsWebFilter() {
        assertNotNull(corsWebFilter);
    }
}
