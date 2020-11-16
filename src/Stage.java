import java.time.LocalDateTime;

public class Stage {

    private String nom = "";
    private LocalDateTime dateDebut = null;
    private LocalDateTime dateFin = null;

    public void setNom(String nom){

        if(nom != null && nom.length()>0){
            this.nom = nom;
        }
    }

    public void setDateDebut(LocalDateTime dateDebut){

        dateDebut = LocalDateTime.now();

    }

    public void setDateFin(LocalDateTime dateFin){

        dateFin = LocalDateTime.now();
    }

    public String getNom(){return this.nom;}

    public LocalDateTime getDateDebut(){return this.dateDebut;}

    public LocalDateTime getDateFin(){return this.dateFin;}


}
