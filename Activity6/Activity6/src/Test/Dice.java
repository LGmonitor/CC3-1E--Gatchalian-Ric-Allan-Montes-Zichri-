/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Random;


public class Dice {
private Random r;

    public Dice() {
    r = new Random();

    }
    public int roll(){
        return r.nextInt(6)+1; 
    }

}   