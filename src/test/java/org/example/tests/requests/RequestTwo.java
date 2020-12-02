package org.example.tests.requests;

public class RequestTwo {

    public void sendRequest(String request) {
        System.out.println("Request two (named " + request + ") sent");
    }

    public void checkErrorMessage(String msg) {
        System.out.println("Error '" + msg + "' found");
    }
}
