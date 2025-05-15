package org.example.model;

public class Tache {
    private final int id;
    private final String description;

    public Tache(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}