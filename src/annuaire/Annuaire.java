package annuaire;

import java.util.ArrayList;

/**
 * Created by adrien on 26/03/2018.
 *
 *
 *
 */
public class Annuaire {
    /** Variables */
    public static ArrayList<Utilisateur> tab = new ArrayList();
    protected static int uniqueID;

    /** Contructeur */
    public Annuaire(){

    }

    /** Getters */

    /** Setter */

    /** Methode */
    // NouvelleUtilisateur
    public void nouvelleUtilisateur(String pseudo, String ip, int statut, int id){
        Utilisateur u = new Utilisateur(pseudo,ip,statut,id);
        tab.add(u);
    }

    public void ajouterUtilisateur(Utilisateur u){
        tab.add(u);
    }

    public void retirerUtilisateur(int id){
        if(tab.isEmpty()==false){
            for(int i=0 ; i<tab.size() ; i++){
                if(tab.get(i).getId() == id){
                    tab.remove(i);
                }
            }
        }
    }

    public Utilisateur getUtilisateur(String nom){
        if(tab.isEmpty()==false){
            for(int i=0 ; i<tab.size() ; i++){
                if(tab.get(i).getPseudo() == nom){
                    return tab.get(i);
                }
            }
        }
        return null;
    }





}
