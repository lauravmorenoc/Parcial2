/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import FileManagement.DataManagement;
import Menu.Gui;
import ejercicioparcial2.Cat;
import ejercicioparcial2.Dog;
import ejercicioparcial2.Person;
import ejercicioparcial2.Pet;
import java.util.ArrayList;
import ejercicioparcial2.Vet;
import java.util.Scanner;
/**
 *
 * @author lamorenoca
 */
public class Starter {
    
    private ArrayList<Vet> vets;
    private ArrayList<Person> people;
    private DataManagement dataManage;
    private Gui gui;

    public Starter(ArrayList<Vet> vets, ArrayList<Person> people) {
        this.vets = vets;
        this.people = people;
        this.dataManage=new DataManagement("pets.txt");
    }
    
    public void start(){
        this.gui.mostrarMenu();
    }
    
    public void readPets(Vet v){
        
    }
    
    public void manageVet(Vet v, String action){
        
    }
    
    
    
    public static void main(String[] args) {
        /*lee una lista de mascotas registradas en la veterinaria con sus dueños
    el archivo se llama pets.txt
        
        ofrece un menu que permite:
        * remover una mascota (por identificador unico)
        * listar mascotas de acuerdo a tipo (dog, cat, hamster)
        *Finalizar el programa y listar mascotas registradas
        */
     ArrayList<Pet> mascotasPersona1=new ArrayList<>();
     Dog perro1= new Dog("Raza A", "123", "Roco", "Blanco");
     Cat gato1=new Cat(false, "126", "Pelusa", "Cafe");
     mascotasPersona1.add(perro1);
     mascotasPersona1.add(gato1);
     
     ArrayList<Vet> veterinarias=new ArrayList<>();
     Vet veterinaria=new Vet();
     veterinarias.add(veterinaria);
     
     ArrayList<Person> people= new ArrayList<>();
     Person person1=new Person("Mauricio", "45631789", mascotasPersona1);
     
     Starter starter=new Starter(veterinarias, people);
     starter.start();
}
}
