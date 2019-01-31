/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;



public class Animals {

    public static void main(String[] args) {
       
       
       
        
        AnimalBP turtle = new AnimalBP("Reptile", 2,"Green",true);
        AnimalBP dog = new AnimalBP("Mammal",2,"White",false);
        AnimalBP bird = new AnimalBP("Bird",1,"Gray",true);
        AnimalBP cat = new AnimalBP("Mammal",2,"Black",false);
      
        
  
        System.out.println("Turtle: ");
        turtle.print();
        System.out.print("\n");
        System.out.println("Dog ");
        dog.print();
        System.out.print("\n");
        System.out.println("Bird ");
        bird.print();
        System.out.print("\n");
        System.out.println("Cat ");
        cat.print();
       
        }

}
