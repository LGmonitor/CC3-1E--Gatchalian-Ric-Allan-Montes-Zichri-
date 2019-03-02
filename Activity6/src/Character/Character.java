
package Character;
import Test.Dice;

public abstract class Character {
static Dice dice = new Dice();
    private int strength;
    private int dexterity;
    private int intelligence;
    String name;
    private int maxLife;
    private int currentLife;

    public Character(String n, int s, int d, int i) {
    this.name = n;
    this.strength = s;
    this.dexterity = d;
    this.intelligence = i;
    this.maxLife = dice.roll()+97;
    this.currentLife = maxLife;
    }

    /**
     *
     * @return attack
     */
   public abstract int attack();
      
   
    /**
     *
     * @param damage
     */
    public void wound(int damage) {
    currentLife = currentLife - damage;
    }
    public void heal(int heal) {
    currentLife = currentLife + heal; 
    }

  
     public String getName() {
    return name;
    }
       public void setName(String n){
    name = n;
    }

    public int getStrength() {
    return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getDexterity() {
    return dexterity;
    
    }
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }
    
    public int getIntelligence() {
    return intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    
    public int getCurrentLife() {
    return currentLife;
    }
  public void setCurrentLife(int currentLife){
    this.currentLife = currentLife;
    }
    public int getMaxLife() {
    return maxLife;
    }

  
    public void setMaxlife(int maxLife){
    this.maxLife = maxLife;
    }
 

}
