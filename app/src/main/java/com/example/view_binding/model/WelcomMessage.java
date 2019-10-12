package com.example.view_binding.model;

public class WelcomMessage {
    String welcomeMessage, version;

    public WelcomMessage(String welcomeMessage, String version) {
        this.welcomeMessage = welcomeMessage;
        this.version = version;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getVersion() {
        return version;
    }
}
