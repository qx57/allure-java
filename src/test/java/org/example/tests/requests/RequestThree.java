package org.example.tests.requests;

import io.qameta.allure.Step;
import org.apache.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestThree {

    @Step("Отправим запрос Request Three")
    public void sendRequest(String request) {
        System.out.println("Request three (named " + request + ") sent");
    }

    @Step("Проверим ответ сервера")
    public void checkResponse(Integer code) {
        assertThat(code).isEqualTo(HttpStatus.SC_OK);
    }
}
