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
public class Player {
    private int position;
    private final String name;
    private Dice d;
    private Board b;
    private boolean win=false;

    public Player(int position, Dice d,Board b,String name) {
        this.position = position;
        this.d = d;
        this.b=b;
        this.name=name;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    public void move(){
        System.out.println(name+"'s turn.");
        int steps=d.rollDice();
        System.out.println("The dice shows the number "+steps+".");
        if(position+steps>99){
            position=99-((position+steps)-99);
            System.out.println("Current position: "+(position+1));
            System.out.println("Your movement is too far from the finish line, so let's turn around and try again!");
        }
        else if(position+steps==99){
            position+=steps;
            System.out.println("Current position: "+(position+1));
            System.out.println("Congratulations, "+name+"! You've reached the finish line!");
            win=true;
        }
        else{
            position+=steps;
            System.out.println("Current position: "+(position+1));
            Tile curTile=b.getTiles()[position];
            if(curTile.isLadder()){
                System.out.println("You found a ladder! Climbing faster to the finish line...");
                curTile.getSnakeladder().movePlayer(this);
                System.out.println("Current position: "+(position+1));
            }
            else if(curTile.isSnake()){
                System.out.println("You found a snake! Falling farther from the finish line...");
                curTile.getSnakeladder().movePlayer(this);
                System.out.println("Current position: "+(position+1));
            }
        }
    }

    public boolean isWin() {
        return win;
    }
    
}
