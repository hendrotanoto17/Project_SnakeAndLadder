namespace Engine
{
  public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public Dice() {
        this.sides=6;
    }
    
    public int rollDice(){
        Random rnd = new Random();
        int hasil = rnd.Next(1,7)
        
       
          if(hasil == 6){
            for(int a =2 ;a<=0;a--){
            return Player.move(hasil)++
          }
          }
          else{
          return Player.move();
        }
          return Player.move(hasil);
        }
        
    }
}

