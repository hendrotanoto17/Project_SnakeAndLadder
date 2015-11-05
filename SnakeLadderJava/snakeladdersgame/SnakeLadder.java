/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakeladdersgame;

/**
 *
 * @author Aspire4755
 */
public class SnakeLadder {
    private int start,end;

    public SnakeLadder(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void movePlayer(Player p){
        p.setPosition(end);
    }    
}
