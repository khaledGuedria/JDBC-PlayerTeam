/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Player;
import models.Team;

/**
 *
 * @author admin
 */
public interface PlayerInterface {
    
    //add
    public void addPlayer(Player p);
    public void addPlayer2(Player p);
    
    //list : select
    public List<Player> fetchPlayers();
    
    //affectation
    public void affecterJoueur(Player p, Team t);
    
}
