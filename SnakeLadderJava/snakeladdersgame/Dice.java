/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakeladdersgame;
import java.util.Random;
/**
 *
 * @author Aspire4755
 */
public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public Dice() {
        this.sides=6;
    }
    
    public int rollDice(){
        Random r=new Random();
        int result=r.nextInt(sides)+1;
        return result;
    }
}
