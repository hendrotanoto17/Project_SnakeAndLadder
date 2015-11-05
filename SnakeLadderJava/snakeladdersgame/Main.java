/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakeladdersgame;
import java.util.Scanner;
/**
 *
 * @author Aspire4755
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Board b=new Board();
        Dice d1=new Dice();
        Dice d2=new Dice();
        Player p1=new Player(0,d1,b,"Player 1");
        Player p2=new Player(0,d2,b,"Player 2");
        
        System.out.println("- Console Snake and Ladders Game -");
        System.out.println(b);
        System.out.println();
        System.out.println("The game will continue until one player reaches the finish line.\nHowever, you may stop the game by entering other than 'y' or 'Y' as the command input.");
        System.out.print("Start game? (Y/y)");
        char input=sc.next().charAt(0);
        while(input=='y'||input=='Y'){
            System.out.println("----------------------------------------");
            p1.move();
            System.out.println();
            if(p1.isWin()){
                input='n';
                continue;
            }
            p2.move();
            System.out.println();
            if(p2.isWin()){
                input='n';
                continue;
            }
            System.out.print("Continue game? (Y/y)");
            input=sc.next().charAt(0);
        }
        if(!p1.isWin()&&!p2.isWin()){
            System.out.println("The game hasn't finished and is stopped by players.");
        }
    }
}
