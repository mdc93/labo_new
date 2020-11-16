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

        if( dateDebut != null){
            this.dateDebut = dateDebut;
        }

    }

    public void setDateFin(LocalDateTime dateFin){

        if(dateFin != null){
            this.dateFin = dateFin;
        }
    }

    public String getNom(){return this.nom;}

    public LocalDateTime getDateDebut(){return this.dateDebut;}

    public LocalDateTime getDateFin(){return this.dateFin;}


}
