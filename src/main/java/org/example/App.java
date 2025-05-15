package org.example;

import org.example.model.GestionnaireTaches;
import org.example.model.Tache;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GestionnaireTaches gestionnaire = new GestionnaireTaches();
        Scanner scanner = new Scanner(System.in);
        String ligne;

        System.out.println("Bienvenue sur TaskMaster Lite !");
        System.out.println("Commandes disponibles : add \"description\", list, exit");

        while(true)

        {
            System.out.print("> ");
            ligne = scanner.nextLine().trim();

            if (ligne.startsWith("add ")) {
                String contenu = ligne.substring(4).replaceAll("^"|"$", "");
                gestionnaire.ajouterTache(contenu);
                System.out.println("Tâche ajoutée !");
            } else if (ligne.equals("list")) {
                List<Tache> toutes = gestionnaire.listerTaches();
                if (toutes.isEmpty()) {
                    System.out.println("Aucune tâche pour l’instant.");
                } else {
                    for (Tache t : toutes) {
                        System.out.printf("%d – %s%n", t.getId(), t.getDescription());
                    }
                }
            } else if (ligne.equals("exit")) {
                System.out.println("Au revoir !");
                break;
            } else if (ligne.equals("help")) {
                System.out.println("Commandes disponibles : add "…", list, exit, help");
            } else {
                System.out.println("Commande inconnue : tapez help pour la liste.");
            }
        }
        scanner.close();
    }
    }
}
