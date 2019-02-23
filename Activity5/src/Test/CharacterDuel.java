
package Test;

import Character.Assassin;
import Character.Wizard;

public class CharacterDuel {

    public static void main(String[] args) {
       Dice dice = new Dice();
        Wizard Pikachu = new Wizard("Pikachu",dice.roll(),dice.roll(),dice.roll()){
            public int attack(){
                return 0;
        }
    };
    Assassin Reaper = new Assassin("Reaper",dice.roll(),dice.roll(),dice.roll()){
        
    public int attack(){
            return 0;
        }
    };
    
    int damage;
    int heal;
    
    
    for(int i = 1; i <=10; i++){
        System.out.println();
        System.out.println("Round " + i);
        
        System.out.println(Pikachu.getName() + ": " + Pikachu.getCurrentLife());
        System.out.println(Reaper.getName() + ": " + Reaper.getCurrentLife());
        
      
        if ((Pikachu.getCurrentLife() < 15) && (Pikachu.getCurrentMagic() >= 10)){
        System.out.println(Pikachu.getName() + "emited self-regeneration for  " + Pikachu.castHeal()+"+LifePoints");
        }
        
         if (Pikachu.getCurrentMagic()>=10){
             damage = Pikachu.castLightningBolt();
             System.out.println(Pikachu.getName() + " used Lightningbolt on " + Reaper.getName() + " for " + damage);     
         
         }       
         else{
              damage = Pikachu.attack();
             System.out.println(Pikachu.getName() + " attacks " + Reaper.getName() + " for " + damage);
             
         }  
                Reaper.wound(damage);
            if (Reaper.getCurrentLife()<=0){        
                System.out.println(Pikachu.getName() + " HAS ELECTRICUTED " + Reaper.getName());
                break;
            }
            if ((Reaper.getCurrentLife() < 15) && (Reaper.getCurrentEnergy() >= 10)){
            System.out.println(Reaper.getName() + " rested to heal for  " + Pikachu.castHeal()+" +LifePoints");
            }
             if (Reaper.getCurrentEnergy()>=10){
             damage = Reaper.LeapStrike();
             System.out.println(Reaper.getName() + " used LeapStrike on " + Pikachu.getName() + " for " + damage);
             }
            else{
            damage = Reaper.attack();
            System.out.println(Reaper.getName() + " attacks " + Pikachu.getName() + " for " + damage);
                  
            }
                Pikachu.wound(damage);
            if (Pikachu.getCurrentLife()<=0){
                System.out.println(Reaper.getName() +" HAS SLICED " + Pikachu.getName());
                break;
                            
            }
    }
}
}    
