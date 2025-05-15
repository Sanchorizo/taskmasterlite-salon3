package org.example.utils;

import org.example.model.Tache;

import java.util.ArrayList;
import java.util.List;

/**
 * Gère en mémoire la liste des tâches de l’application.
 */
public class GestionnaireTaches {
    private final List<Tache> listeTaches = new ArrayList<>();
    private int compteurId = 1;

    /**
     * Crée et ajoute une nouvelle tâche à la liste.
     *
     * @param description texte décrivant la tâche à ajouter
     */
    public void ajouterTache(String description) {
        listeTaches.add(new Tache(compteurId++, description));
    }

    /**
     * Copie et retourne la liste courante des tâches.
     *
     * @return copie de la liste des tâches
     */
    public List<Tache> listerTaches() {
        return new ArrayList<>(listeTaches);
    }
}