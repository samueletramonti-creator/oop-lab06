package it.unibo.exceptions.fakenetwork.impl;

import java.io.IOException;

public class NetworkException extends IOException {

    public NetworkException() {
        IO.println("Network error: no response");
    }

    public NetworkException(String input) {
        IO.println("Network error while sending message");
    }
}
