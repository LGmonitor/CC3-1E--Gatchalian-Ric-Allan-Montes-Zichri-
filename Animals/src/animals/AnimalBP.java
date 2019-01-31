/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author m304user
 */
public class AnimalBP {
   String Type;
    int Numbersoffeet;
    String color;
    boolean egg;
    
    public AnimalBP(String Type, int Numbersoffeet,String color,boolean egg){
    this.Type = Type;
    this.Numbersoffeet = Numbersoffeet;
    this.color= color;
    this.egg =egg;
    
    
    
    }
   public void print(){
       
       System.out.println("Type: "+this.Type);
       System.out.println("Number of Feet: "+this.Numbersoffeet);
       System.out.println("Color: "+this.color);
       System.out.println("Does it Lay Eggs? "+this.egg);
   }
 
}
