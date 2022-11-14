/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author admin
 */
public class Team {
    //att
    private int id;
    private String name, country, stadium, division;
    
    //const
    public Team() {
    }
    public Team(int id, String name, String country, String stadium, String division) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.stadium = stadium;
        this.division = division;
    }
    
    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    
    //display

    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", name=" + name + ", country=" + country + ", stadium=" + stadium + ", division=" + division + '}';
    }
    
    
    
}
