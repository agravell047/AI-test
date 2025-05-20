package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link TestService}.
 */
class TestServiceTest {

    @Test
    void getTestString_ReturnsExpectedString() {
        final TestService service = new TestService();
        assertEquals("This is a test string.", service.getTestString());
    }
}
