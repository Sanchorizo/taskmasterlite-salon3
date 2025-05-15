package org.example;

import org.example.model.GestionnaireTaches;
import org.example.model.Tache;

import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        GestionnaireTaches gestionnaire = new GestionnaireTaches();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue sur TaskMaster Lite !");
        System.out.println("Commandes disponibles : add \"description\", list, exit, help");

        while (true) {
            System.out.print("> ");
            String ligne = scanner.nextLine().trim();

            if (ligne.startsWith("add ")) {
                String contenu = ligne.substring(4).replaceAll("^\"|\"$", "");
                gestionnaire.ajouterTache(contenu);
                System.out.println("Tâche ajoutée !");
            }
            else if ("list".equals(ligne)) {
                List<Tache> toutes = gestionnaire.listerTaches();
                if (toutes.isEmpty()) {
                    System.out.println("Aucune tâche pour l’instant.");
                } else {
                    for (Tache t : toutes) {
                        System.out.printf("%d – %s%n", t.getId(), t.getDescription());
                    }
                }
            }
            else if ("exit".equals(ligne)) {
                System.out.println("Au revoir !");
                break;
            }
            else if ("help".equals(ligne)) {
                System.out.println("Commandes disponibles : add \"description\", list, exit, help");
            }
            else {
                System.out.println("Commande inconnue : tapez help pour la liste.");
            }
        }

        scanner.close();
    }
    }
