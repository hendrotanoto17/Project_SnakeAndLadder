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
public class Board {
    private Tile[] tiles;

    public Board() {
        this.tiles=new Tile[100];
        for(int i=0;i<tiles.length;i++){
            tiles[i]=new Tile();
        }
        generateBoard();
    }
    public void generateBoard(){
        Random r=new Random();
        int count=0;
        int start=0;
        int end=0;
        while(count<8){
            start=r.nextInt(98)+1;
            end=r.nextInt(98)+1;
            if((start<end)&&isValidSnakeLadder(tiles[start],tiles[end])){
                tiles[start].setLadder(true);
                tiles[start].setSnakeladder(new SnakeLadder(start,end));
                tiles[end].setSnakeladder(new SnakeLadder(start,end));
                count++;
            }
        }
        count=start=end=0;
        while(count<8){
            start=r.nextInt(98)+1;
            end=r.nextInt(98)+1;
            if((start>end)&&isValidSnakeLadder(tiles[start],tiles[end])){
                tiles[start].setSnake(true);
                tiles[start].setSnakeladder(new SnakeLadder(start,end));
                tiles[end].setSnakeladder(new SnakeLadder(start,end));
                count++;
            }
        }
    }
    private boolean isValidSnakeLadder(Tile t1,Tile t2){
        if(t1.getSnakeladder()!=null||t2.getSnakeladder()!=null){
            return false;
        }
        else{
            return true;
        }
    }

    public Tile[] getTiles() {
        return tiles;
    }
    
    public String toString(){
        String str="";
        for(int i=0;i<tiles.length;i+=10){
            if((i/10)%2==0){
                for(int j=9;j>=0;j--){
                    if(i+j==0){
                        str="* "+str;
                    }
                    else if(i+j==99){
                        str="@ "+str;
                    }
                    else{
                        if(tiles[i+j].getSnakeladder()==null){
                            str=". "+str;
                        }
                        else{
                            if(tiles[i+j].isLadder()){
                                str="H "+str;
                            }
                            else if(tiles[i+j].isSnake()){
                                str="S "+str;
                            }
                            else{
                                str=". "+str;
                            }
                        }
                    }
                }
            }
            else{
                for(int j=0;j<10;j++){
                    if(i+j==0){
                        str="* "+str;
                    }
                    else if(i+j==99){
                        str="@ "+str;
                    }
                    else{
                        if(tiles[i+j].getSnakeladder()==null){
                            str=". "+str;
                        }
                        else{
                            if(tiles[i+j].isLadder()){
                                str="H "+str;
                            }
                            else if(tiles[i+j].isSnake()){
                                str="S "+str;
                            }
                            else{
                                str=". "+str;
                            }
                        }
                    }
                }
            }
            str="\n"+str;
        }
        str+="\n*: starting point\n@: finish line\nS: snakes\nH: ladders";
        return str;
    }
}
