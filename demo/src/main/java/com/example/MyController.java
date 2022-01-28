package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.server.EmbeddedServer;

import java.util.UUID;

@Controller("/appinfo")
public class MyController {
    protected final String host;

    protected final int port;

    public MyController(EmbeddedServer embeddedServer) {
        host = embeddedServer.getHost();
        port = embeddedServer.getPort();
    }

    private String uuid = UUID.randomUUID().toString();

    @Get(produces = MediaType.APPLICATION_JSON, value = "uuid")
    public String getUUID() {
        return "demo--"+ host + ":" + port +" { uuid: '" + uuid + "'}";
    }
}