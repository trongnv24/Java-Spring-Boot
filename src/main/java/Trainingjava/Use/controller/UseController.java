package Trainingjava.Use.controller;

import Trainingjava.Use.dto.request.UseRequest;
import Trainingjava.Use.dto.response.UseResponse;
import Trainingjava.Use.entity.UseEntity;
import Trainingjava.Use.service.UseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    public  UseResponse update(@RequestBody UseRequest request, @PathVariable("id") String id) {
        log.info("=== Start api create  use ===");
        log.info("=== Request body: {}", request);
        UseResponse response = service.update(request, id);
        log.info("=== Finish api create user. Use id: {} ===", response.getId());
        return response;
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public UseResponse getById(@PathVariable("id") String id) {
        log.info("=== Start api getById use === ");
        log.info("=== String Id: {}===", id);
        UseResponse response = service.getById(id);
        log.info("=== Finish api getById user. Use id: {} ===",response.getId());
        return response;
    }



}

