
package Test;

import Character.Assassin;
import Character.Wizard;

public class CharacterDuel {

    public static void main(String[] args) {
       Dice dice = new Dice();
       Wizard Pikachu = new Wizard("Pikachu",dice.roll(),dice.roll(),dice.roll());
       Assassin Reaper = new Assassin("Reaper",dice.roll(),dice.roll(),dice.roll());
    
 
    int damage;
    int Barrier = Pikachu.useArmor();
    int Arms =Pikachu.useWeapon();
    
    int RiotShield = Reaper.useArmor();
    int Ak47 = Reaper.useWeapon();
    
    for(int i = 1; i <=20; i++){
        System.out.println();
        System.out.println("Round " + i);     
        System.out.println(Pikachu.getName() + ": " + Pikachu.getCurrentLife());
        System.out.println(Reaper.getName() + ": " + Reaper.getCurrentLife());
        
      
        if ((Pikachu.getCurrentLife() < 15) && (Pikachu.getCurrentMagic() >= 10)){
                System.out.println(Pikachu.getName() + " emited enhanced self-protection  " + Barrier);
        }  
            else if (Pikachu.getCurrentMagic()>=10){
            damage = Pikachu.castLightningBolt();
                System.out.println(Pikachu.getName() + " used Lightningbolt on " + Reaper.getName() + " for " + damage);
                Reaper.wound(damage);
            }       
            
             else if (Pikachu.getCurrentMagic() < 10) {
              damage = Arms;
              System.out.println(Pikachu.getName() + " used an Iron Staff to attack " + Reaper.getName() + " for " + damage);
              Reaper.wound(Arms);
            }  
              
            if (Reaper.getCurrentLife()<=0){       
                System.out.println("");
                System.out.println(Pikachu.getName() + " with " + Pikachu.getCurrentLife() + " HP LEFT HAS SUCCESSFULLY ELECTRICUTED " + Reaper.getName());
                break;
              }
            
            
            if ((Reaper.getCurrentLife() < 15) && (Reaper.getCurrentEnergy() >= 10)){
                System.out.println(Reaper.getName() + " Gaurded himself for resistance  " + RiotShield);
                }
            
                else if (Reaper.getCurrentEnergy()>=10){
                damage = Reaper.LeapStrike();
                System.out.println(Reaper.getName() + " used LeapStrike on " + Pikachu.getName() + " for " + damage);
                Pikachu.wound(damage);
                }
             
              
                else if (Reaper.getCurrentEnergy() < 10){ 
                damage = Ak47;
                System.out.println(Reaper.getName() + " used a Rifle to Shoot " + Pikachu.getName() + " for " + damage);
                 Pikachu.wound(Ak47);
                 }
               
              
                if (Pikachu.getCurrentLife()<=0 && Reaper.getCurrentLife() > 0){
                System.out.println("");
                System.out.println(Reaper.getName() + " with " + Reaper.getCurrentLife() +" HP LEFT  HAS SUCCESSFULLY HUNTED " + Pikachu.getName());
                break;
                 }
                    if (Pikachu.getCurrentLife() > Reaper.getCurrentLife() && i >= 15) { //ending the at round 15
                        System.out.println("The Wizard won the battle");
                          break;
                        }
                   else if(Reaper.getCurrentLife() > Pikachu.getCurrentLife() && i >= 15) { //ending at round 15 
                        System.out.println("The Assassin won the battle");
                          break;
                    }
      
        }
    }// end of main
}//end of class    
