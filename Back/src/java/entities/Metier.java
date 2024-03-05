public class Metier {
    private int id;
    private String nomMetier;

    public Metier(int id, String nomMetier) {
        this.id = id;
        this.nomMetier = nomMetier;
    }

    // Getters et Setters
    public String getNomMetier() {
        return nomMetier;
    }

    public void setNomMetier(String nomMetier) {
        this.nomMetier = nomMetier;
    }

    // Méthodes supplémentaires
}
