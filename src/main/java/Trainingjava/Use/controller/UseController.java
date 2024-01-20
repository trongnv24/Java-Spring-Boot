package Trainingjava.Use.controller;

import Trainingjava.Use.dto.request.UseRequest;
import Trainingjava.Use.dto.response.UseResponse;
import Trainingjava.Use.service.UseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@Slf4j

public class UseController {

    private final UseService service;

    public UseController(UseService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UseResponse create(@RequestBody UseRequest request) {
        log.info("=== Start api create new book ===");
        log.info("=== Request body: {}", request);
        UseResponse response = service.create(request);
        log.info("=== Finish api create new book. Book id: {} ===", response.getId());
        return response;

    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public  UseResponse update(@RequestBody UseRequest request, @PathVariable String id) {
        log.info("=== Start api create  use ===");
        log.info("=== Request body: {}", request);
        UseResponse response = service.create(request);
        log.info("=== Finish api create user. Use id: {} ===", response.getId());
        return response;
    }
}

