package org.example;


import org.example.model.GestionnaireTaches;
import org.example.model.Tache;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAjouterTache() {
        GestionnaireTaches gestionnaire = new GestionnaireTaches();

        gestionnaire.ajouterTache("Faire les courses");

        List<Tache> all = gestionnaire.listerTaches();
        assertEquals(1, all.size(), "Il doit y avoir une tâche dans la liste");

        Tache tache = all.get(0);
        assertEquals(1, tache.getId(), "L'identifiant de la première tâche doit être 1");
        assertEquals("Faire les courses", tache.getDescription(), "La description doit correspondre");
    }

    @Test
    public void testAjoutPlusieursTachesAvecIds() {
        GestionnaireTaches gestionnaire = new GestionnaireTaches();

        gestionnaire.ajouterTache("Tâche A");
        gestionnaire.ajouterTache("Tâche B");

        List<Tache> all = gestionnaire.listerTaches();
        assertEquals(2, all.size(), "Il doit y avoir deux tâches");

        assertEquals(1, all.get(0).getId(), "Première tâche : ID = 1");
        assertEquals("Tâche A", all.get(0).getDescription());

        assertEquals(2, all.get(1).getId(), "Deuxième tâche : ID = 2");
        assertEquals("Tâche B", all.get(1).getDescription());
    }

    @Test
    void testGetAllTasks() {
        GestionnaireTaches manager = new GestionnaireTaches();

        manager.ajouterTache("Faire les courses");
        manager.ajouterTache("Finir le devoir Java");

        List<Tache> expected = List.of(
                new Tache(1, "Faire les courses"),
                new Tache(2, "Finir le devoir Java")
        );

        List<Tache> actual = manager.listerTaches();

        assertEquals(expected, actual, "La liste des tâches devrait correspondre aux tâches ajoutées.");
    }
}
