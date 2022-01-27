package com.netflix;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("demo")
public interface RemoteService {

    @Get("/appinfo/uuid")
    public String getUUID();
}