package org.example.tests.requests;

import org.apache.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestOne {

    public void sendRequest() {
        System.out.println("Request one sent");
    }

    public void checkResponse(Integer code) {
        assertThat(code).isEqualTo(HttpStatus.SC_OK);
    }

    public void checkField(String field, String value) {
        System.out.println("Field " + field + " = " + value);
    }
}
