package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.UUID;

@Controller("/appinfo")
public class MyController {

    private String uuid = UUID.randomUUID().toString();

    @Get(produces = MediaType.APPLICATION_JSON, value = "uuid")
    public String getUUID() {
        return "{ uuid: '" + uuid + "'}";
    }
}