package org.example.tests;

import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.apache.http.HttpStatus;
import org.example.tests.providers.CustomDataProvider;
import org.example.tests.requests.RequestOne;
import org.example.tests.requests.RequestThree;
import org.example.tests.requests.RequestTwo;
import org.testng.annotations.Test;

public class ExampleTest {

    private RequestOne requestOne = new RequestOne();
    private RequestTwo requestTwo = new RequestTwo();
    private RequestThree requestThree = new RequestThree();

    @Test(description = "Тестовый тест 1")
    @Link("TEST-001")
    @Story("Тестирование Allure Server")
    public void test1() {
        // step1 - send request
        requestOne.sendRequest();

        // step2 - check request status
        requestOne.checkResponse(HttpStatus.SC_OK);

        // step3 - check some field
        requestOne.checkField("ololo", "123");
    }

    @Test(description = "Тестовый тест 2")
    @Link("TEST-002")
    @Story("Тестирование Allure Server")
    public void test2() {
        // step1 - send request
        requestTwo.sendRequest("request");

        // step2 -check error
        requestTwo.checkErrorMessage("This is error");
    }

    @Test(description = "Тестовый тест 1",
            dataProvider = "parametrizedTest",
            dataProviderClass = CustomDataProvider.class)
    @Link("TEST-003")
    @Story("Тестирование Allure Server")
    public void test3(String desc, Integer responseCode) {
        // step1 - send request
        requestThree.sendRequest("Parametrized test - " + desc);

        // step2 -check response
        requestThree.checkResponse(responseCode);
    }
}
