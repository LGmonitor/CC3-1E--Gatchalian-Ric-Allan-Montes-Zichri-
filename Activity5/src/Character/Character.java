
package Character;
import Test.Dice;

public class Character {
static Dice dice = new Dice();
    int strength;
    int dexterity;
    int intelligence;
    String name;
    int maxLife;
    int currentLife;

    public Character(String n, int s, int d, int i) {
    this.name = n;
    this.strength = s;
    this.dexterity = d;
    this.intelligence = i;
    this.maxLife = dice.roll()+94;
    this.currentLife = maxLife;
}

   public Character(){
    name = "Pikachu";
    strength = 1;
    dexterity = 1;
    intelligence = 10;
    maxLife = dice.roll()+94;
    currentLife = maxLife;
}  

    /**
     *
     * @return attack
     */
   public int attack(){
    return dice.roll()* this.strength;   
   }
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

    /**
     *
     * @return Strength
     */
    public int getStrength() {
    return strength;
}

    /**
     *
     * @return Dexterity
     */
    public int getDexterity() {
    return dexterity;
}

    /**
     *
     * @return Intelligence
     */
    public int getIntelligence() {
    return intelligence;
}

    /**
     *
     * @return CurrentLife
     */
    public int getCurrentLife() {
    return currentLife;
}

    /**
     *
     * @return MaxLife
     */
    public int getMaxLife() {
    return maxLife;
}

    /**
     *
     * @param n set Name
     */
    public void setName(String n){
    name = n;
}

    /**
     *
     * @param s set Strength
     */
    public void setStrength(int s){
    strength = s;
}

    /**
     *
     * @param d set Dexterity
     */
    public void setDexterity(int d){
    dexterity = d;
}
    
    /**
     *
     * @param i set Intelligence
     */
    public void setIntelligence(int i){
    intelligence = i;
}

    /**
     *
     * @param currentLife set CurrentLife
     */
    public void setCurrentLife(int currentLife){
    this.currentLife = currentLife;
}

    /**
     *
     * @param maxLife set MaxLife
     */
    public void setMaxlife(int maxLife){
    this.maxLife = maxLife;
    }
}
