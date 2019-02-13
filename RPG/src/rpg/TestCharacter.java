
package rpg;


public class TestCharacter {
        
        
        public TestCharacter(){ 
        Dice dice = new Dice();
        
        // Character Knight = new Character ("Knight",dice.roll(),dice.roll(),dice.roll());
        //Character Archer = new Character ("Archer",dice.roll(),dice.roll(),dice.roll());
        Character Knight = new Character ("Knight",1,1,1);
        Character Archer = new Character ("Archer",1,1,1);
        
            for(int i = 1; i <= 3; i++){
            System.out.println("Round " + i);
            
            System.out.println(Knight.getName() + ": " + Knight.getCurrentLife());
            System.out.println(Archer.getName() + ": " + Archer.getCurrentLife());
          
            int MeleeAttack = Knight.attack(), RangedAttack = Archer.attack();
            
             System.out.println(Knight.getName() + " attacks " + Archer.getName() + " for " +MeleeAttack);
             Archer.wound(MeleeAttack);
                 
                 
            if (Archer.getCurrentLife()<=0){
                System.out.println(Knight.getName() + " HAS SLAIN " + Archer.getName());
                break;
            }
            System.out.println(Archer.getName() + " attacks " + Knight.getName() + " for " + RangedAttack);
            Knight.wound(RangedAttack);
    
            
            if (Knight.getCurrentLife()<=0){
                System.out.println(Archer.getName() +" HAS ELIMINATED " + Knight.getName());
                break;
                            
            }
                
               if (i == 3){        // END OF ROUND THREE ,WINNER IS DECIDED BASED ON WHICH CHARACTER HAS HIGHER HP.
                 System.out.println("");
              if (Knight.getCurrentLife()< Archer.getCurrentLife()){
                 System.out.println("ROUND ENDED");   
                 System.out.print("Heath Status of " + Knight.getName() + " is: " + Knight.getCurrentLife());
                 System.out.println("\nHeath Status of " + Archer.getName() + " is: " + Archer.getCurrentLife()); 
                 System.out.println(Archer.getName() + " Wins");
   
              }
              if (Archer.getCurrentLife() < Knight.getCurrentLife()){
                  System.out.println("ROUND ENDED");   
                  System.out.print("Heath Status of " + Knight.getName() + " is: " + Knight.getCurrentLife());
                  System.out.println("\nHeath Status of " + Archer.getName() + " is: " + Archer.getCurrentLife()); 
                  System.out.println(Knight.getName() + " Wins");           
              }
              }    
                  else if((Knight.getCurrentLife()<=0) && (Archer.getCurrentLife()<=0) ){  // Results end in Draw. 0% chance of happening
                     System.out.print("\nHeath Status of " + Knight.getName() + " is: " + Knight.getCurrentLife());
                     System.out.print("\nHeath Status of " + Archer.getName() + " is: " + Archer.getCurrentLife()); 
                     System.out.println("DRAW!");
                     break;

            }
        }
    }
} //end of class
 

   

