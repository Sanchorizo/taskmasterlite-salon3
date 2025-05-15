package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireTaches {
    private final List<Tache> listeTaches = new ArrayList<>();

    public List<Tache> listerTaches() {
        return new ArrayList<>(listeTaches);
    }

    public void ajouterTache(String description) {
        listeTaches.add(new Tache(compteurId++, description));
    }
    private int compteurId = 1;
}