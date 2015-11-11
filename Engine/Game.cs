namespace Engine
{
  //kelas controller.
  //yang menjalankan semua proses yang diperlukan untuk menjalankan game ini.
  class Game{
    
    Board papan ;
    Player[] players ;
    
    //konstruktor
    public Game(Board b, Player[] pemain){
      this.papan = b;
      this.players = pemain;
    }
    
    public void setPlayerLocation(Player p){
      papan.setPlayer(p.);
      
    }
  }
  
}
