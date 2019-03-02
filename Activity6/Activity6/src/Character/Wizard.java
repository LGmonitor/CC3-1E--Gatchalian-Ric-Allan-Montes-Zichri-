
package Character;


public class Wizard extends Character implements Weapon,Armor{
     private int maxMagic;
     private int currentMagic;

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        this.maxMagic = dice.roll()+30;
        this.currentMagic = this.maxMagic;
        this.name = "Pikachu";
    }


    public int castLightningBolt() {
     if(currentMagic >= 5){
         currentMagic = currentMagic - 5;
     }
     return dice.roll()+super.getIntelligence();
    }

 
    public int castHeal() {
     int spell = getIntelligence()+dice.roll();
     if(currentMagic >= 8){
        currentMagic = currentMagic - 8;  
        super.heal(spell);
        return spell;}
        else 
        {
            return 0;
                }  
    }

    @Override
    public String getName() {
    return name;
    }

  
    public int getMaxMagic() {
     return maxMagic;
    }
    public void setMaxMagic(int maxMagic){
        this.maxMagic = maxMagic;
    }
  
    public int getCurrentMagic() {
     return currentMagic;
    }
    public void setCurrentMagic(int currentMagic){
        this.currentMagic = currentMagic;
        
    }
    @Override
    public int attack(){
    return dice.roll()* super.getIntelligence();   
   }
    
    
    @Override
    public int useWeapon(){
    return dice.roll()* super.getIntelligence();
    }
    
    
    @Override
     public int useArmor(){
         int heal;
        return dice.roll()* super.getIntelligence();
     }
}
