package com.example.demo;

import com.example.demo.service.GenericService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * GenericController exposes a testing endpoint for demonstration purposes.
 */
@Tag(name = "GenericController", description = "Controller for generic endpoints.")
@RestController
public class GenericController {
    private final GenericService genericService;

    @Autowired
    public GenericController(final GenericService genericService) {
        this.genericService = genericService;
    }

    /**
     * GET /testing123 endpoint.
     *
     * @return a confirmation message
     */
    @GetMapping("/testing123")
    public String testing123() {
        return genericService.getTesting123();
    }

    /**
     * POST /testing123 endpoint.
     *
     * @param input the input string from the request body
     * @return a confirmation message with the input
     */
    @Operation(summary = "Test POST endpoint", description = "Receives a string and returns a confirmation message.")
    @ApiResponse(responseCode = "200", description = "Successfully received input.")
    @PostMapping("/testing123")
    public String postTesting123(@RequestBody String input) {
        return genericService.postTesting123(input);
    }

    /**
     * PUT /testing123 endpoint.
     *
     * @param input the input string from the request body
     * @return a confirmation message with the input
     */
    @Operation(summary = "Test PUT endpoint", description = "Receives a string and returns a confirmation message for PUT.")
    @ApiResponse(responseCode = "200", description = "Successfully received input via PUT.")
    @PutMapping("/testing123")
    public String putTesting123(@RequestBody String input) {
        return genericService.putTesting123(input);
    }
}