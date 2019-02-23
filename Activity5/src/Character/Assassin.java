
package Character;


public class Assassin extends Character {
    int maxEnergy;
    int currentEnergy;


public Assassin(String n, int s, int d, int i) {
    this.maxEnergy = maxLife;
    this.currentEnergy = maxEnergy;
    this.name = "Reaper";

}
 public int LeapStrike() {
     if(currentEnergy >= 5){
         currentEnergy = currentEnergy - 5;
     }
     return dice.roll()+dexterity;
    }

    /**
     *
     * @return castHeal
     */
    public int Meditate() {
     int Med = intelligence+dice.roll();
     if(currentEnergy >= 10){
        currentEnergy = currentEnergy - 10;  
        super.heal(Med);
        return Med;}
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
    public int getMaxEnergy() {
     return maxEnergy;
    }

    /**
     *
     * @return CurrentMagic
     */
    public int getCurrentEnergy() {
     return currentEnergy;
    }
   
    public int attack(){
    return dice.roll()* this.dexterity;   
   }
}
