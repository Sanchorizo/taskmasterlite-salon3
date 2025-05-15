package org.example.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return id == tache.id && Objects.equals(description, tache.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }
}