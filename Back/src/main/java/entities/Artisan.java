public class Artisan extends Utilisateur {
    private Metier metier;

    public Artisan(int id, String nom, String prenom, String email, String motDePasse, Adresse adresse, Metier metier) {
        super(id, nom, prenom, email, motDePasse, adresse);
        this.metier = metier;
    }

    // Getters et Setters
    // Méthodes supplémentaires
}
