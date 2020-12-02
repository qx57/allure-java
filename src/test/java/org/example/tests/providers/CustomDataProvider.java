package org.example.tests.providers;

import org.apache.http.HttpStatus;
import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "parametrizedTest")
    protected Object[][] parametrizedTest() {
        return new Object[][] {
                {"Negative test", HttpStatus.SC_INTERNAL_SERVER_ERROR},
                {"Positive test", HttpStatus.SC_OK}
        };
    }
}
