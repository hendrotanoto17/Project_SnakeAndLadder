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
public class Tile {
    private boolean isSnake,isLadder;
    private SnakeLadder snakeladder=null;

    public Tile() {
        this.isSnake=false;
        this.isLadder=false;
    }

    public boolean isSnake() {
        return isSnake;
    }

    public void setSnake(boolean isSnake) {
        this.isSnake = isSnake;
    }

    public boolean isLadder() {
        return isLadder;
    }

    public void setLadder(boolean isLadder) {
        this.isLadder = isLadder;
    }

    public void setSnakeladder(SnakeLadder snakeladder) {
        this.snakeladder = snakeladder;
    }

    public SnakeLadder getSnakeladder() {
        return snakeladder;
    }
    
}
