package br.com.wfaria.apiversioning;

public class User {
    private final String name;
    private final String id;

    public User(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
