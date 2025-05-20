package com.example.demo.controller;

import com.example.demo.controller.TestController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Unit tests for {@link TestController}.
 */
@WebMvcTest(TestController.class)
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test GET /api/test returns the expected string.
     */
    @Test
    @DisplayName("GET /api/test returns test string")
    void getTestString_ReturnsTestString() throws Exception {
        mockMvc.perform(get("/api/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("This is a test string."));
    }

    /**
     * Test GET /api/test/another returns the expected string.
     */
    @Test
    @DisplayName("GET /api/test/another returns another test string")
    void getAnotherTestString_ReturnsAnotherTestString() throws Exception {
        mockMvc.perform(get("/api/test/another"))
                .andExpect(status().isOk())
                .andExpect(content().string("This is another test string."));
    }

    /**
     * Test GET /api/test/timestamp returns the expected message format.
     */
    @Test
    @DisplayName("GET /api/test/timestamp returns test message with timestamp")
    void getTestMessageWithTimestamp_ReturnsTestMessageWithTimestamp() throws Exception {
        mockMvc.perform(get("/api/test/timestamp"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.startsWith("Test message at timestamp: ")));
    }

    /**
     * Test POST /api/test returns the expected confirmation message.
     */
    @Test
    @DisplayName("POST /api/test returns confirmation message with input")
    void postTestString_ReturnsConfirmationMessage() throws Exception {
        mockMvc.perform(post("/api/test")
                .contentType(org.springframework.http.MediaType.TEXT_PLAIN)
                .content("test input"))
                .andExpect(status().isOk())
                .andExpect(content().string("Received via POST: test input"));
    }

    /**
     * Test PUT /api/test returns the expected confirmation message.
     */
    @Test
    @DisplayName("PUT /api/test returns confirmation message with input")
    void putTestString_ReturnsConfirmationMessage() throws Exception {
        mockMvc.perform(put("/api/test")
                .contentType(org.springframework.http.MediaType.TEXT_PLAIN)
                .content("put input"))
                .andExpect(status().isOk())
                .andExpect(content().string("Received via PUT: put input"));
    }

    /**
     * Test GET /api/test/new returns the expected new test message.
     */
    @Test
    @DisplayName("GET /api/test/new returns new test message")
    void getNewTestMessage_ReturnsNewTestMessage() throws Exception {
        mockMvc.perform(get("/api/test/new"))
                .andExpect(status().isOk())
                .andExpect(content().string("This is a new test message."));
    }
}
