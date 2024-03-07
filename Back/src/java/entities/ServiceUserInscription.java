//ici on traite l'inscription des utilisateurs:
import java.util.*;

public class ServiceUserInscription {
    public static void main (String [] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        /*Etapes:
        1- demander d'abord l'utilisateur s'il veut s'inscrire en tant que particulier ou artisan: 
        2- lire les entrées d'inscription user avec la classe scanner
        3- créer une instance de la classe user (particulier ou artisan)
        4- valider les données d'inscription : vérifier l'email et le mot de passe
        5- enrigistrer le user dans la base de données en utilisant la logique d'accès aus données
        6- afficher un message de confirmation ou d'erreur pour le user
        */

        System.out.println("Inscription : ");
        System.out.println("1 : S'inscrire en tant que Particulier");
        System.out.println("2 : S'inscrire en tant que Artisan");
        System.out.println("Faites votre chhoix : ");
        int choix = sc.nextInt();

        System.out.println("votre choix est : "+choix);

        switch(choix) {
            case 1:
                creerCompteParticulier();
                break;
            case 2:
                creerCompteArtisan();
                break;
            default:
            System.out.println("Choix non trouvé !");
        }

    }

    public static void creerCompteParticulier() {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("\nInscription Particulier :");
        //lire les entrées d'inscription pour user particulier :

        System.out.print("\nNom : ");
        String nomParticulier = sc.next();
        System.out.print("Prénom : ");
        String prenomParticulier = sc.next();
        System.out.print("Numéro de téléphone : ");
        String telPersoParticulier = sc.next();
        System.out.println("\nAdresse : ");
        System.out.print("Rue : ");
        String rueParticulier = sc.next();
        System.out.print("Code Postale : ");
        String codePostaleParticulier = sc.next();
        System.out.print("Ville : ");
        String villeParticulier = sc.next();

        //Données d'identification :
        System.out.print("\nEmail : ");
        String emailParticulier = sc.next();
        System.out.print("Mot de passe : ");
        String motDePasseParticulier = sc.next();
        //int id = 1;

        Adresse adresseParticulier = new Adresse(rueParticulier, codePostaleParticulier, villeParticulier);
        Utilisateur particulier = new Particulier(1, nomParticulier, prenomParticulier, telPersoParticulier, emailParticulier, motDePasseParticulier, adresseParticulier);
        System.out.println(particulier.toString());

        //valider les données d'inscription et enregistrer le user dans la base de données:
        if(validerDonneesInscription(particulier)) {
            enregistrerUtilisateur(particulier);
            System.out.println("Inscription réussie !");
        } 
        else {
            System.out.println("Erreur : Données d'inscription invalides !");
        }       
    }

    public static void creerCompteArtisan() {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("\nInscription Artisan :");
        //lire les entrées d'inscription pour user artisan :

        System.out.print("\nNom : ");
        String nomArtisan = sc.next();
        System.out.print("Prénom : ");
        String prenomArtisan = sc.next();
        System.out.print("Numéro de téléphone personnel : ");
        String telPersoArtisan = sc.next();

        //Données sur le métier de l'artisan : 
        System.out.print("\nMétier : ");
        String nomMetier = sc.next();

        //Données sur l'entreprise :
        System.out.print("Nom d'entreprise : ");
        String nomEntreprise = sc.next();
        System.out.print("Numéro SIRET de l'entreprise : ");
        String numSiret = sc.next();
        System.out.print("Numéro de téléphone professionnel : ");
        String telProfessionnel = sc.next();

        System.out.println("\nAdresse : ");
        System.out.print("Rue : ");
        String rueArtisan = sc.next();
        System.out.print("Code Postale : ");
        String codePostaleArtisan = sc.next();
        System.out.print("Ville : ");
        String villeArtisan = sc.next();

        //Données d'identification :
        System.out.print("\nEmail : ");
        String emailArtisan = sc.next();
        System.out.print("Mot de passe : ");
        String motDePasseArtisan = sc.next();

        //classe Metier et Adresse avec leurs attributs :
        Metier metier = new Metier(1, nomMetier);
        Adresse adresseArtisan = new Adresse(rueArtisan, codePostaleArtisan, villeArtisan);

        Utilisateur artisan = new Artisan(1, nomArtisan, prenomArtisan, telPersoArtisan, emailArtisan, motDePasseArtisan, adresseArtisan, metier, nomEntreprise, telProfessionnel, adresseArtisan, "diplôme", "formation", numSiret);
        System.out.println(artisan.toString());

        //valider les données d'inscription et enregistrer le user dans la base de données:
        if(validerDonneesInscription(artisan)) {
            enregistrerUtilisateur(artisan);
            System.out.println("Inscription réussie !");
        } 
        else {
            System.out.println("Erreur : Données d'inscription invalides !");
        }
    }

    private static boolean validerDonneesInscription(Utilisateur utilisateur) {
        //logique de validation des données
        // Vérifiez que tous les champs obligatoires sont remplis
        if (utilisateur.getNom().isEmpty() || utilisateur.getPrenom().isEmpty() || utilisateur.getEmail().isEmpty() || utilisateur.getMotDePasse().isEmpty()) {
        return false;
        }

        // Vérifiez que l'email est au bon format (exemple basique)
        if (!utilisateur.getEmail().matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$")) {
        return false;
        }

        return true; //true si les données sont valides, sinon false 
    }

    private static void enregistrerUtilisateur(Utilisateur utilisateur) {
        //logique pour enregister le particulier dans la base de données particulier/artisan
        try {
            // Connexion à la base de données
            // Préparation de la requête d'insertion
            // Exécution de la requête d'insertion avec les données de l'utilisateur
            // Fermeture de la connexion

            System.out.println("Utilisateur enregistré dans la base de données.");
        } catch (Exception e) {

            System.out.println("Erreur lors de l'enregistrement de l'utilisateur : " + e.getMessage());

        }

    }


}