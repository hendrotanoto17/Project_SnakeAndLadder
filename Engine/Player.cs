namespace Engine
{
  class player
  {
    private int position;
    private final String name;
    
    //Dice akan disimpan di class Game.cs / Board.cs.
    
    //Player tidak menyimpan Board.cs.
    
    private boolean win;

    public Player(int position,String name) {
        this.position = 0;
        this.name=name;
        this.win = false;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    public void move(Dice d){
      int steps = d.roll();
      position=position+steps;
      if(this.position==99){
        //pas finish
        this.win = true;
      }else if(this.position>99){
        //jika melebihi dari finish
        int pos = this.position-99;
        this.position = this.position-pos;
      }
      
    }
    
    public int getPosition() {
        return this.position;
    }
    
    public boolean isWin(){
      return this.win;
    }
  }
}
