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
public class Hamster extends Pet{
    private double weight;

    public Hamster(double weight, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.weight = weight;
        this.type="Hamster";
    }
    @Override
    public String sound(){
        return "";
    }
}
