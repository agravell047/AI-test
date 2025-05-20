package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Tests for GenericController endpoints.
 */
@WebMvcTest(GenericController.class)
public class GenericControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetTesting123() throws Exception {
        mockMvc.perform(get("/testing123"))
                .andExpect(status().isOk())
                .andExpect(content().string("Endpoint /testing123 is working!"));
    }

    @Test
    void testPostTesting123() throws Exception {
        mockMvc.perform(post("/testing123")
                .contentType(MediaType.TEXT_PLAIN)
                .content("test input"))
                .andExpect(status().isOk())
                .andExpect(content().string("Received via POST: test input"));
    }

    @Test
    void testPutTesting123() throws Exception {
        mockMvc.perform(put("/testing123")
                .contentType(MediaType.TEXT_PLAIN)
                .content("put input"))
                .andExpect(status().isOk())
                .andExpect(content().string("Received via PUT: put input"));
    }
}
