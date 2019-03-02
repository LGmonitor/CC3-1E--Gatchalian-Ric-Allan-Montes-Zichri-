
package Character;
public class Assassin extends Character implements Weapon,Armor{
    private int maxEnergy;
    private int currentEnergy;


public Assassin(String n, int s, int d, int i) {
    super(n, s, d, i);
    this.maxEnergy = dice.roll()+30;
    this.currentEnergy = maxEnergy;
    this.name = "Reaper";

}
 public int LeapStrike() {
     if(currentEnergy >= 5){
         currentEnergy = currentEnergy - 5;
     }
     return dice.roll()+super.getDexterity();
    }


    public int Meditate() {
     int Med = getIntelligence()+dice.roll();
     if(currentEnergy >= 10){
        currentEnergy = currentEnergy - 10;  
        super.heal(Med);
        return Med;}
        else 
        {
            return 0;
                }  
    }

    @Override
    public String getName() {
    return name;
    }

 
    public int getMaxEnergy() {
     return maxEnergy;
    }
    public void setMaxEnergy(int MaxEnergy){
        this.maxEnergy = MaxEnergy;
    }
 
    public int getCurrentEnergy() {
     return currentEnergy;
    }
    public void setCurrentEnergy(int CurrentEnergy){
        this.currentEnergy =CurrentEnergy;
    }
    
    @Override
    public int attack(){
    return dice.roll()* super.getDexterity();   
   }
    @Override
    public int useWeapon(){
    return dice.roll()* super.getStrength();
    }
    @Override
    public int useArmor(){
    return dice.roll()* super.getStrength();
     }
}
