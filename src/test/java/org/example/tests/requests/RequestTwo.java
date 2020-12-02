package org.example.tests.requests;

import io.qameta.allure.Step;

public class RequestTwo {

    @Step("Отправим запрос Request Two")
    public void sendRequest(String request) {
        System.out.println("Request two (named " + request + ") sent");
    }

    @Step("Проверим, что в ответе сервера вернулась ошибка")
    public void checkErrorMessage(String msg) {
        System.out.println("Error '" + msg + "' found");
    }
}
