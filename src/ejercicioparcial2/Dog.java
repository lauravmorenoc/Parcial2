/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioparcial2;

/**
 *
 * @author lamorenoca
 */
public class Dog extends Pet{
    private String breed;

    public Dog(String breed, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.breed = breed;
        this.type="Dog";
    }
    
    @Override
    public String sound(){
        return "Guau";
    }
}
