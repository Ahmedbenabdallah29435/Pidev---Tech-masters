/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Categorie;
import entity.Joueur;
import java.util.List;

/**
 *
 *
 */
public interface IJoueur <J> {
    
    public boolean AjouterJoueur(J j);
    public boolean ModifierJoueur(J j);
    public boolean SupprimerJoueur(int idJoueur);
    public List<Joueur> AfficherJoueur(Joueur t);
    public List<Joueur> rechercheParFiltre(String type, String valeur);
    public List<Categorie> MaxCategorieInJoueur();
}
