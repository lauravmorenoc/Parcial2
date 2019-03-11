/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioparcial2;

import java.util.ArrayList;

/**
 *
 * @author lamorenoca
 */
public class Person {
    private String name;
    private String id;
    private ArrayList<Pet> pets;

    public Person() {
    }
    

    public Person(String name, String id, ArrayList<Pet> pets) {
        this.name = name;
        this.id = id;
        this.pets = pets;
    }
    
    public void showPets(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
    
}
