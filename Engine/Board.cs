namespace Engine
{
  class Board
  {
    private Tile[] tiles;

    public Board(){
       this.tile = new Tile[100];
       for(int i=0;i<tiles.length;i++){
          tiles[i]=new Tile();
       }
      generateBoard();
    }

    public void generateBoard(){
      Random r = new Random();
      int count = 0;
      int start = 0;
      int end = 0;
      while(count<8){
        start = r.nextInt(98)+1;
        end = r.nextInt(98)+1;
        if((start<end)&&isValidSnakeLadder(tiles[start],tiles[end])){
        tiles[start].setSnake(true);
        tiles[start].setSnakeladder(new SnakeLadder(start,end));
        tiles[end].setSnakeladder(new SnakeLadder(start,end));
        }
      }
      count=start=end=0;
    }
  }
}
