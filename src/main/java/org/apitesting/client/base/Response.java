package org.apitesting.client.base;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import java.util.Objects;

public class Response<T> {
    private final HttpStatus httpStatus;
    private final HttpHeaders httpHeaders;
    private final T body;

    public Response(final HttpStatus httpStatus, final HttpHeaders httpHeaders, T body) {
        Objects.requireNonNull(httpHeaders);
        Objects.requireNonNull(httpStatus);

        this.httpStatus = httpStatus;
        this.httpHeaders = httpHeaders;
        this.body = body;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public T getBody() {
        return body;
    }
}
