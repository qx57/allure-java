package org.example.tests.requests;

import io.qameta.allure.Step;
import org.apache.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestOne {

    @Step("Отправим запрос Request One")
    public void sendRequest() {
        System.out.println("Request one sent");
    }

    @Step("Проверим ответ сервера")
    public void checkResponse(Integer code) {
        assertThat(code).isEqualTo(HttpStatus.SC_OK);
    }

    @Step("Проверим поле в теле ответа")
    public void checkField(String field, String value) {
        System.out.println("Field " + field + " = " + value);
    }
}
