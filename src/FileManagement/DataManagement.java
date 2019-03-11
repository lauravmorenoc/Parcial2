/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagement;

import ejercicioparcial2.Pet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lamorenoca
 */
public class DataManagement {
    private String ruta;
    private ArrayList<Pet> pets;
    private BufferedWriter bw = null;
    private FileWriter fw = null;
     
    public DataManagement(String ruta){
        this.ruta=ruta;
    }
    
    
    public boolean guardar(Pet pet) throws IOException{ //Guarda los datos del arraylist en un archivo, separados por espacios
        
        boolean existe=false;
        for(Pet p:this.pets){
            if(p.getId().equals(pet.getId())){
                existe=true;
                throw new IllegalArgumentException("La mascota debe tener otro identificador");
            }
        }
        this.pets.add(pet);
        
        File archivo=new File(this.ruta);
        if(archivo.exists()){
            archivo.createNewFile();//le coloca como nombre la ruta de esta clase (this.ruta)
        
        
        fw = new FileWriter(archivo.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);
        
        
        bw.write("------------------Se modifico el archivo------------------");
        for(Pet m: this.pets){
        bw.write(m.getType() +" " + m.getName() + " " + m.getHairColor() +"\n");
        bw.write(m.getOwner().getName() + " " + m.getOwner().getId() + "\n");
        }

        bw.flush(); //Hace que la informacion se quede en el archivo
        bw.close();
        fw.close();
        }
        return true;
    }
    
   
    public boolean remove(Pet p) throws IOException{
        this.pets.remove(p);
        
        File archivo=new File(this.ruta);
        if(archivo.exists()){
            archivo.createNewFile();//le coloca como nombre la ruta de esta clase (this.ruta)
        
        
        fw = new FileWriter(archivo.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.write("------------------Se modifico el archivo------------------");
        for(Pet m: this.pets){
        bw.write(m.getType() +" " + m.getName() + " " + m.getHairColor() +"\n");
        bw.write(m.getOwner().getName() + " " + m.getOwner().getId() + "\n");
        }

        bw.flush(); //Hace que la informacion se quede en el archivo
        bw.close();
        fw.close();
    }
        return true;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
