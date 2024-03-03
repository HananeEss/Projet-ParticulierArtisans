import java.time.LocalTime;

public class Planning {
    private int id;
    private String jour;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private boolean disponibilite;
    private Artisan artisan;

    public Planning(int id, String jour, LocalTime heureDebut, LocalTime heureFin, boolean disponibilite, Artisan artisan) {
        this.id = id;
        this.jour = jour;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.disponibilite = disponibilite;
        this.artisan = artisan;
    }

    // Getters et Setters
    // Méthodes supplémentaires
}
