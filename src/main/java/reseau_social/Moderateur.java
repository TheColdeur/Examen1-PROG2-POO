package reseau_social;

import java.time.LocalDate;

public class Moderateur extends Utilisateur{

    public Moderateur(String id, String nom, String email, LocalDate dateCreation){
        super(id, nom, email);
    }

    public void supprimerCommentaire(Publication publication, Commentaire commentaire) {
        publication.getCommentaire().remove(commentaire);
    }
    
    public void supprimerPublication(GroupeUtilisateur groupe, Publication publication) {
        groupe.getPublications().remove(publication);
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus : Moderateur";
    }

    
}
