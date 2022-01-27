package com.netflix;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;


@Controller("/client")
public class ClientController {

    @Inject
    RemoteService remoteService;

    @Get(produces = MediaType.TEXT_PLAIN, value = "/uuid")
    public String getUUID() {
        return remoteService.getUUID();
    }
}