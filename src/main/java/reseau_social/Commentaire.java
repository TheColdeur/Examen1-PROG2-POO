package reseau_social;

public class Commentaire {
    private String contenu;
    private Utilisateur utilisateur;

    public Commentaire(String contenu, Utilisateur utilisateur) {
        this.contenu = contenu;
        this.utilisateur = utilisateur;
    }

    public String getContenu() {
        return contenu;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    
}
