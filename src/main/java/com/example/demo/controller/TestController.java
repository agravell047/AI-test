package com.example.demo.controller;

import com.example.demo.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for test endpoints.
 */
@RestController
@RequestMapping("/api/test")
@Tag(name = "Test", description = "Endpoints for testing purposes")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(final TestService testService) {
        this.testService = testService;
    }

    /**
     * Retrieves a test string.
     *
     * @return a simple test string
     */
    @Operation(summary = "Get test string", description = "Returns a simple test string.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful retrieval of test string")
            })
    @GetMapping
    public String getTestString() {
        return testService.getTestString();
    }

    /**
     * Retrieves a different test string.
     *
     * @return another test string
     */
    @Operation(summary = "Get another test string", description = "Returns another test string.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful retrieval of another test string")
            })
    @GetMapping("/another")
    public String getAnotherTestString() {
        return "This is another test string.";
    }

    /**
     * Retrieves a test message with the current timestamp.
     *
     * @return a string containing a test message and the current timestamp
     */
    @Operation(
        summary = "Get test message with timestamp",
        description = "Returns a test message along with the current server timestamp.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful retrieval of test message with timestamp")
        }
    )
    @GetMapping("/timestamp")
    public String getTestMessageWithTimestamp() {
        final long timestamp = System.currentTimeMillis();
        return "Test message at timestamp: " + timestamp;
    }

    /**
     * Accepts a string via POST and returns a confirmation message.
     *
     * @param input the input string from the request body
     * @return a confirmation message with the input
     */
    @Operation(summary = "Post test string", description = "Accepts a string and returns a confirmation message.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful receipt of test string")
            })
    @PostMapping
    public String postTestString(@RequestBody final String input) {
        return "Received via POST: " + input;
    }

    /**
     * Accepts a string via PUT and returns a confirmation message.
     *
     * @param input the input string from the request body
     * @return a confirmation message with the input
     */
    @Operation(summary = "Put test string", description = "Accepts a string and returns a confirmation message via PUT.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successful receipt of test string via PUT")
            })
    @PutMapping
    public String putTestString(@RequestBody final String input) {
        return "Received via PUT: " + input;
    }
}
