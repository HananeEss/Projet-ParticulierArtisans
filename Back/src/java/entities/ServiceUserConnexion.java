//ici on traite la connexion des utilisateurs:
import java.util.*;

public class ServiceUserConnexion {
    public static void main (String [] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        /*Etapes:
        1- demander d'abord l'utilisateur s'il veut se cennecter en tant que particulier ou artisan: 
        1- lire les données d'identification des user 
        2- chercher dans la base de données si le user existe, si existe récupérer ses données
        3- si particulier => afficher menu particulier, si artisan => afficher menu artisan
            => menu particulier :
                - voir liste metier => voir liste artisans => prendre rdv (choix date)
            => menu artisan :
                - voir planning et mettre à jour 
                - voir données comptabilité 

        */

        System.out.println("\n1 : Particulier ");
        System.out.println("2 : Artisan ");
        System.out.println("Faites votre choix : ");
        int choixConnexion = sc.nextInt();

        System.out.println("\nSe connecter : "); 

        System.out.print("\nEmail : ");
        String email = sc.next();
        System.out.print("Mot de passe : ");
        String motDePasse = sc.next();

        // => chercher dans la base de données si le user existe et si le user est particulier ou artisan

        if(choixConnexion == 1){
            //Si le user est particulier:
            afficherMenuParticulier();
        }

        if(choixConnexion == 2){
            //Si le user est artisan:
            afficherMenuArtisan();
        }

    }

    public static void afficherMenuParticulier(){
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("1 : chercher un artisan par service ");
        System.out.println("2 : chercher un artisan par ville ");
        System.out.println("3 : chercher un artisan par date ");
        System.out.println("4 : Donner une note et/ou un commentaire ");
        System.out.println("5 : accéder à votre profil ");

        System.out.println("\nFaites votre choix : ");
        int choix = sc.nextInt();

        switch(choix) {
            case 1: //chercher par service => voir liste services (metier) => choisir metier  => voir liste artisans =>  prendre rdv       
                System.out.println(" afficher liste services ");
                break;
            case 2: //chercher par localisation =>  choisir la ville  => voir liste artisans par ville =>  prendre rdv
                System.out.println(" choisir la ville ");
                break;
            case 3: //chercher par créneau =>  donner la date du jour et l'heure  => voir liste artisans disponible pour ce créneau =>  prendre rdv
                System.out.println(" donner la date du jour et l'heure ");
                break;
            case 4: //Donner une note et/ou un commentaire à un artisan
                System.out.println(" donner une note ");
                break;
            case 5: //accéder à votre profil (ajouter ou supprimer des informations)
                System.out.println(" afficher infos profil ");
                break;
            default:
            System.out.println("Choix non trouvé !");
        }
    }

    public static void afficherMenuArtisan(){
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("1 : accéder à votre planning ");
        System.out.println("2 : accéder à votre profil ");
        System.out.println("3 : accéder à votre informations de comptabilité ");

        System.out.println("\nFaites votre choix : ");
        int choix = sc.nextInt();

        switch(choix) {
            case 1: // afficher le planning de l'artisan
                System.out.println(" afficher le planning ");
                break;
            case 2: // accéder à votre profil (ajouter ou supprimer des informations)
                System.out.println(" afficher infos profil ");
                break;
            case 3: // afficher les informations de comptabilité de l'artisan (chiffre d'affaire ...)
                System.out.println(" afficher infos comptabilité ");
                break;
            default:
            System.out.println("Choix non trouvé !");
        }
    }
}
