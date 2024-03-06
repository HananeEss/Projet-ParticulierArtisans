public class Artisan extends Utilisateur {
    private Metier metier;
	private String nomEntreprise;
	private String numProfessionnel;
	private Adresse adresseEntreprise;
	private String diplome;
	private String formation;
	private String numSiret;

    public Artisan(int id, String nom, String prenom, String telPerso, String email, String motDePasse, Adresse adresse, 
                    Metier metier, String nomEntreprise, String numProfessionnel, Adresse adresseEntreprise, String diplome, 
                    String formation, String numSiret) {
                        
        super(id, nom, prenom, telPerso, email, motDePasse, adresse);
        this.metier = metier;
		this.nomEntreprise = nomEntreprise;
		this.numProfessionnel = numProfessionnel;
		this.adresseEntreprise = adresseEntreprise;
		this.diplome = diplome;
		this.formation = formation;
		this.numSiret = numSiret;
        
    }

    // Getters et Setters
    public String getnomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNumProfessionnel() {
        return numProfessionnel;
    }

    public void setNumProfessionnel(String numProfessionnel) {
        this.numProfessionnel = numProfessionnel;
    }

    public Adresse getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(Adresse adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getNumSiret() {
        return numSiret;
    }

    public void setNumSiret(String numSiret) {
        this.numSiret = numSiret;
    }

    // Méthodes supplémentaires
}
