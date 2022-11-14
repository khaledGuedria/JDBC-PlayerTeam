/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationalinfo5;

import interfaces.PlayerInterface;
import models.Player;
import models.Team;
import services.PlayerService;

/**
 *
 * @author admin
 */
public class JavaApplicationALINFO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // service init
        PlayerInterface ps = new PlayerService();
        
        //player init
//        Player p = new Player();
//        p.setName("Sadio Mane");
//        p.setNumber(19);
//        p.setAge(28);
//        
//        //add action
//        ps.addPlayer2(p);
        
        //select
        //System.out.println(ps.fetchPlayers());
        Player p = new Player();
        p.setId(2);
        Team t = new Team();
        t.setId(1);
        
        ps.affecterJoueur(p, t);
        
    }
    
}
