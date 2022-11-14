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
public class Player {
    
    //att
    private int id;
    private String name;
    private int number, age;
    private Team team;
    
    //const
    
    public Player() {
    }

    public Player(int id, String name, int number, int age, Team team) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.age = age;
        this.team = team;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    //display

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", number=" + number + ", age=" + age + ", team=" + team + '}';
    }
    
    
}
