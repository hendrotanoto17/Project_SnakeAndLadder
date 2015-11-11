namespace Engine
{
  class Tile
  {
    private int number; //nomor Tile
    private Teleporter isSnake, isLadder;
    
    public Tile(int num){
      this.number=num;
      this.isSnake=this.isLadder=null;
    }
    
    public void SetNumber(int num){
      this.number=num;
    }
    
    public void SetIsSnake(Teleporter isSnake){
      this.isSnake=isSnake;
    }
    
    public void SetIsLadder(Teleporter isLadder){
      this.isLadder=isLadder;
    }
    
    public int GetNumber(){
      return this.number;
    }
    
    public Teleporter IsSnake(){
      return this.isSnake;
    }
    
    public Teleporter IsLadder(){
      return this.isLadder;
    }
  }
}
