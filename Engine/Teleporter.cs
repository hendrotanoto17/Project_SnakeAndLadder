namespace Engine
{
  abstract class Teleporter
  {
    private int head,tail;
    
    public int Head
    {
      get
      {
        return head;
      }
      set
      {
        head=value;
      }
    }
    
    public int Tail
    {
      get
      {
        return tail;
      }
      set
      {
        tail=value;
      }
    }
    
    public Teleporter(int head,int tail)
    {
      this.head=head;
      this.tail=tail;
    }
    
    public abstract void MovePlayer(Player p);
  }
}
