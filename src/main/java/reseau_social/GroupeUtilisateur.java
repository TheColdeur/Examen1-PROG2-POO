package reseau_social;

import java.util.List;

public class GroupeUtilisateur {
    private String nom;
    private List<Utilisateur> membre;
    private List<Publication> publications;

    public GroupeUtilisateur(String nom, List<Utilisateur> membre, List<Publication> publications) {
        this.nom = nom;
        this.membre = membre;
        this.publications = publications;
    }

    public String getNom() {
        return nom;
    }

    public List<Utilisateur> getMembre() {
        return membre;
    }

    public List<Publication> getPublications() {
        return publications;
    }
    public List<Publication> rechercherPublications(String motCle){
        return publications.stream()
        .filter(user -> user.getContenu().toLowerCase().contains(motCle.toLowerCase()))
        .toList();
    }
    public long nombreTotalDePublication(){
        return publications.stream()
        .count();
    }
}
