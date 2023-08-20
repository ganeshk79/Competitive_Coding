class TowerOfHanoi
{
  public static void main(String args[])
  {
    int n = 3;
    TowerOfHanoi ob = new TowerOfHanoi(); 
    ob.towerOfHanoi(n,'A','C','B');
  }
  void towerOfHanoi(int n,char from_tower,char to_tower,char aux_tower)
  {
      if(n==0)
          return ;

      towerOfHanoi(n-1,from_tower,aux_tower,to_tower);
      System.out.printf("Move disk %d from tower %c to tower %c \n",n,from_tower,to_tower);
      towerOfHanoi(n-1,aux_tower,to_tower,from_tower);    

  }

}