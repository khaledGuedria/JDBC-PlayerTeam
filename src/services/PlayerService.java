/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.PlayerInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Player;
import models.Team;
import util.MyConnection;

/**
 *
 * @author admin
 */
public class PlayerService implements PlayerInterface{
    //var
    Connection cnx = MyConnection.getInstance().getCnx();

    @Override
    public void addPlayer(Player p) {
        try {
            String req = "INSERT INTO `player`(`name`, `number`, `age`) VALUES ('"+ p.getName() +"',"+p.getNumber()+","+p.getAge()+")";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Player Added successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void addPlayer2(Player p) {
        try {
            
            String req = "INSERT INTO `player`(`name`, `number`, `age`) VALUES (?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getNumber());
            ps.setInt(3, p.getAge());
            ps.executeUpdate();
            System.out.println("Player Added Successfully!");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        

    }

    @Override
    public List<Player> fetchPlayers() {
        List<Player> players = new ArrayList<>();
        try {
            
            String req = "SELECT * FROM player";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {                
                Player p = new Player();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setNumber(rs.getInt("number"));
                p.setAge(rs.getInt("age"));
                
                players.add(p);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return players;
    }

    @Override
    public void affecterJoueur(Player p, Team t) {
        try {
            String req ="UPDATE `player` SET `team`= ? WHERE id = ?";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, t.getId());
            ps.setInt(2, p.getId());
            ps.executeUpdate();
            System.out.println("Player updated successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
