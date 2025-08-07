package reseau_social;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private Utilisateur utilisateur;
    private final String contenu;
    private List<Commentaire> commentaire;

    public Publication(Utilisateur utilisateur, String contenu) {
        this.utilisateur = utilisateur;
        this.contenu = contenu;
        this.commentaire = new ArrayList<>();
    }
    @Override
    public String toString() {
        return contenu;
    }

    public String getContenu(){
        return contenu;
    }

    public List<Commentaire> getCommentaire() {
        return commentaire;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
}
