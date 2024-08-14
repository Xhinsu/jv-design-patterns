package org.northcoders.transport;

public class BasicTransport implements Transport {
    private String description;

    public BasicTransport(String description) {
        this.description = description;
    }

    @Override
    public void display() {
        System.out.println("Transport: " + description);
    }
}

