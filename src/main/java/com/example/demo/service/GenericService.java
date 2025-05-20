package com.example.demo.service;

/**
 * Service for generic-related business logic.
 */
public class GenericService {
    /**
     * Returns a confirmation message for GET.
     *
     * @return a confirmation message
     */
    public String getTesting123() {
        return "Endpoint /testing123 is working!";
    }

    /**
     * Returns a confirmation message for POST.
     *
     * @param input the input string
     * @return a confirmation message with the input
     */
    public String postTesting123(final String input) {
        return "Received via POST: " + input;
    }

    /**
     * Returns a confirmation message for PUT.
     *
     * @param input the input string
     * @return a confirmation message with the input
     */
    public String putTesting123(final String input) {
        return "Received via PUT: " + input;
    }
}
