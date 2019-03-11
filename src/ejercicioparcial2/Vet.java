/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioparcial2;

import FileManagement.DataManagement;
import java.util.ArrayList;

/**
 *
 * @author lamorenoca
 */
public class Vet {
    private ArrayList<Pet> pets;
    private DataManagement data;

    public Vet() {
        this.data=new DataManagement("pets.txt");
        this.pets=new ArrayList<>();
    }
    
    public void removePet(Pet p){
        
    }
    
    public void showPetsByType(String type){
        
    }
    
    public void showPets(){
        
    }
}
