package org.example;

import org.example.utils.GestionnaireTaches;
import org.example.model.Tache;

import java.util.List;
import java.util.Scanner;
/**
 * Point d’entrée de l’application TaskMaster Lite en ligne de commande.
 */

public class App {
    private static final String ANSI_RESET  = "\u001B[0m";
    private static final String ANSI_BLUE   = "\u001B[34m";
    private static final String ANSI_GREEN  = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        /**
         * Point d’entrée de l’application TaskMaster Lite.
         *
         * Boucle principale qui :
         * <ul>
         *   <li>Affiche un message d’accueil avec invitation si la liste est vide</li>
         *   <li>Gère les commandes :
         *     <ul>
         *       <li><b>add "description"</b> → ajoute la tâche, affiche un ✔ coloré et réaffiche la liste</li>
         *       <li><b>list</b>             → affiche la liste sous forme de tableau ASCII</li>
         *       <li><b>exit</b>             → quitte l’application</li>
         *       <li><b>help</b>             → rappelle les commandes disponibles</li>
         *     </ul>
         *   </li>
         *   <li>Utilise des icônes Unicode et des couleurs ANSI pour améliorer l’UX</li>
         * </ul>
         *
         * @param args non utilisés
         */
        GestionnaireTaches gestionnaire = new GestionnaireTaches();
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_BLUE + "📋 Bienvenue sur TaskMaster Lite !" + ANSI_RESET);
        if (gestionnaire.listerTaches().isEmpty()) {
            System.out.println(ANSI_YELLOW +
                    "Votre liste est vide ! Pour ajouter votre première tâche, tapez :" +
                    " add \"Votre tâche\"" +
                    ANSI_RESET);
        }
        System.out.println("Commandes : add \"description\", list, exit, help");

        while (true) {
            System.out.print("> ");
            String ligne = scanner.nextLine().trim();

            if (ligne.startsWith("add ")) {
                String contenu = ligne.substring(4).replaceAll("^\"|\"$", "");
                gestionnaire.ajouterTache(contenu);
                System.out.println(ANSI_GREEN + "✔ Tâche ajoutée !" + ANSI_RESET);
                afficherTaches(gestionnaire.listerTaches());
            }
            else if ("list".equals(ligne)) {
                afficherTaches(gestionnaire.listerTaches());
            }
            else if ("exit".equals(ligne)) {
                System.out.println(ANSI_BLUE + "👋 Au revoir !" + ANSI_RESET);
                break;
            }
            else if ("help".equals(ligne)) {
                System.out.println("Commandes : add \"description\", list, exit, help");
            }
            else {
                System.out.println(ANSI_YELLOW +
                        "❓ Commande inconnue : tapez help pour la liste." +
                        ANSI_RESET);
            }
        }

        scanner.close();
    }

    private static void afficherTaches(List<Tache> liste) {
        if (liste.isEmpty()) {
            System.out.println(ANSI_YELLOW + "Aucune tâche pour l’instant." + ANSI_RESET);
            return;
        }

        int largeurId   = 4;
        int largeurDesc = liste.stream()
                .mapToInt(t -> t.getDescription().length())
                .max()
                .orElse(11);

        String separateur = "+"
                + "-".repeat(largeurId + 2)
                + "+"
                + "-".repeat(largeurDesc + 2)
                + "+";
        String format = "| %-" + largeurId
                + "s | %-" + largeurDesc
                + "s |";

        System.out.println(ANSI_BLUE + "────────────────────────────────────────────────" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "🔹 Liste des tâches :" + ANSI_RESET);
        System.out.println(ANSI_BLUE + separateur + ANSI_RESET);
        System.out.println(ANSI_BLUE + String.format(format, "ID", "Description") + ANSI_RESET);
        System.out.println(ANSI_BLUE + separateur + ANSI_RESET);

        for (Tache t : liste) {
            System.out.println(String.format(format, t.getId(), t.getDescription()));
        }

        System.out.println(ANSI_BLUE + separateur + ANSI_RESET);
    }
    }
