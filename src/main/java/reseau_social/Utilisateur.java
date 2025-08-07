package reseau_social;

import java.time.LocalDate;

public class Utilisateur {
    private String id;
    private String nom;
    private String email;
    private LocalDate dateCreation;
    public Utilisateur(String id, String nom, String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.dateCreation = LocalDate.now();
    }
    public void creerPublication(GroupeUtilisateur groupe, Publication publication){
        groupe.getPublications().add(publication);
    }
    public void commenterPublication(Publication publication, Commentaire commentaire){
        publication.getCommentaire().add(commentaire);
    }
    @Override
    public String toString() {
        return """
               Utilisateur {
               id : """ + id + "\n" + "nom : " + nom + "}";
    }
}
