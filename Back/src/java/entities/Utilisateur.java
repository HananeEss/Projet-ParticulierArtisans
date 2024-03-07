public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String telPerso;
    private String email;
    private String motDePasse;
    private Adresse adresse;

    public Utilisateur(int id, String nom, String prenom, String telPerso, String email, String motDePasse, Adresse adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telPerso = telPerso;
        this.email = email;
        this.motDePasse = motDePasse;
        this.adresse = adresse;
    }

    public Utilisateur() {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telPerso =telPerso;
        this.email = email;
        this.motDePasse = motDePasse;
        this.adresse = adresse;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    // Méthodes supplémentaires


    @Override
    public String toString() {
        return "utilisateur {" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\''  +
                '}';
    }
}
