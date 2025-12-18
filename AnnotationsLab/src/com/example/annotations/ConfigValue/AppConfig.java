package com.example.annotations.ConfigValue;


public class AppConfig {

    @ConfigValue(path = "app.url")
    private String url;

    @ConfigValue(path = "app.port")
    private int port;

    @ConfigValue(path = "app.debug")
    private boolean debug;

    @Override
    public String toString() {
        return "AppConfig{" +
                "url='" + url + '\'' +
                ", port=" + port +
                ", debug=" + debug +
				'}';
	}
}