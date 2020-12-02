package org.example.tests.requests;

import org.apache.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestThree {

    public void sendRequest(String request) {
        System.out.println("Request three (named " + request + ") sent");
    }

    public void checkResponse(Integer code) {
        assertThat(code).isEqualTo(HttpStatus.SC_OK);
    }
}
