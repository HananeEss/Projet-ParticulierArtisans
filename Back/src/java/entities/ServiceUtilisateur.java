//ici on traite l'inscription et connection des utilisateurs:
import java.util.*;

public class ServiceUtilisateur {
    public static void main (String [] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        //int choix;

        /*String nom, prenom, telPerso,

        Scanner sc;
        sc = new Scanner(System.in);

        //je cree un utilisateur Particulier:
        Utilisateur UP;
        UP = new Particulier();

        System.out.println("utilisateur particulier : " + UP);

        //je veux qu'il s'inscrit:
        System.out.println("Votre nom : ");*/

        /*Etapes:
        => demander d'abord l'utilisateur s'il veut s'inscrire en tant que particulier ou artisan: 
        1- lire les entrées d'inscription user avec la classe scanner
        2- créer une instance de la classe user (particulier ou artisan)
        3- valider les données d'inscription : vérifier l'email et le mot de passe
        4- enrigistrer le user dans la base de données en utilisant la logique d'accès aus données
        5- afficher un message de confirmation ou d'erreur pour le user
        */

        System.out.println("Inscription : ");
        System.out.println("Si vous voulez s'inscrire en tant que particulier tapez '1', si en tant qu'artisan tapez '2' : ");
        int choix = sc.nextInt();

        System.out.println("votre choix est : "+choix);

        switch(choix) {
            case 1:
                System.out.println("Inscription Particulier :");
                //lire les entrées d'inscription pour user particulier :

                System.out.print("\nNom : ");
                String nom = sc.next();
                System.out.print("Prénom : ");
                String prenom = sc.next();
                System.out.print("Numéro de téléphone : ");
                String telPerso = sc.next();
                System.out.print("Email : ");
                String email = sc.next();
                System.out.print("Mot de passe : ");
                String motDePasse = sc.next();
                System.out.print("Adresse : ");
                System.out.print("\nRue : ");
                String rue = sc.next();
                System.out.print("Code Postale : ");
                String codePostale = sc.next();
                System.out.print("Ville : ");
                String ville = sc.next();
                //int id = 1;

                Adresse adresse = new Adresse(rue, codePostale, ville);
                Utilisateur particulier = new Particulier(1, nom, prenom, telPerso, email, motDePasse, adresse);
                System.out.println(particulier.toString());

                //valider les données d'inscription et enregistrer le user dans la base de données:

                /*if(validerDonneesInscription(utilisateur)) {
                    enregistrerUtilisateur(utilisateur)
                    System.out.println('Inscription réussie !');
                } 
                else {
                    System.out.println('Erreur : Données d''inscription invalides !');
                }

                private static boolean validerDonneesInscription(Utilisateur particulier) {
                    //logique de validation des données
                    return true; //true si les données sont valides, sinon false 
                }

                private static void enregistrerUtilisateur(Utilisateur particulier) {
                    //logique pour enregister le particulier dans la base de données particulier
                }*/

                break;
            case 2:
                System.out.println("Artisan");
                break;
            default:
                System.out.println("Choix non trouvé !");
        }

        

    }
}