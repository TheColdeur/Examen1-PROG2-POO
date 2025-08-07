import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import reseau_social.GroupeUtilisateur;
import reseau_social.Publication;
import reseau_social.Utilisateur;

public class MainTest {
    @BeforeEach
    void setup(){
        var user1 = new Utilisateur("1", "Jean", "jean@gmail.com");
        var user2 = new Utilisateur("2", "Jeanne", "jeanne@gmail.com");
        var user3 = new Utilisateur("3", "Paul", "paul@gmail.com");
        List<Utilisateur> membre = new ArrayList<>();
        membre.add(user1);
        membre.add(user2);
        membre.add(user3);
        List<Publication> publicationList = new ArrayList();
        var groupe1 = new GroupeUtilisateur("Groupe1", membre, publicationList);
    }
    @Test
    void creationPublication(){
        
    }
}
