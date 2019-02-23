
package Character;

import static Character.Character.dice;
/**
 *
 * @author pc
 */
public class Wizard extends Character {
     int maxMagic;
    int currentMagic;


    public Wizard(String n, int s, int d, int i) {
    this.maxMagic = maxLife;
    this.currentMagic = maxMagic;
    this.name = "Pikachu";
 
     
    }

    /**
     *
     * @return castLightningBolt
     */
    public int castLightningBolt() {
     if(currentMagic >= 5){
         currentMagic = currentMagic - 5;
     }
     return dice.roll()+intelligence;
    }

    /**
     *
     * @return castHeal
     */
    public int castHeal() {
     int spell = intelligence+dice.roll();
     if(currentMagic >= 8){
        currentMagic = currentMagic - 8;  
        super.heal(spell);
        return spell;}
        else 
        {
            return 0;
                }  
    }

    /**
     *
     * @return Name
     */

    public String getName() {
    return name;
    }

    /**
     *
     * @return MaxMagic
     */
    public int getMaxMagic() {
     return maxMagic;
    }

    /**
     *
     * @return CurrentMagic
     */
    public int getCurrentMagic() {
     return currentMagic;
    }
   
    public int attack(){
    return dice.roll()* this.intelligence;   
   }
}
