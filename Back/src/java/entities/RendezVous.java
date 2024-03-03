import java.time.LocalDate;
import java.time.LocalTime;

public class RendezVous {
    private int id;
    private LocalDate date;
    private LocalTime heure;
    private Particulier particulier;
    private Artisan artisan;

    public RendezVous(int id, LocalDate date, LocalTime heure, Particulier particulier, Artisan artisan) {
        this.id = id;
        this.date = date;
        this.heure = heure;
        this.particulier = particulier;
        this.artisan = artisan;
    }

    // Getters et Setters
    // Méthodes supplémentaires
}
