package org.example.model;

import java.util.Objects;

public class Tache {
    private final int id;
    private final String description;

    /**
     * Construit une nouvelle Tache.
     *
     * @param id          identifiant unique de la tâche
     * @param description texte décrivant la tâche à effectuer
     */
    public Tache(int id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * Retourne l’identifiant de la tâche.
     *
     * @return identifiant numérique
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne la description de la tâche.
     *
     * @return texte de la tâche
     */
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