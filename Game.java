java.util.ArrayList;

public class Game
{
   int value1;
   int value2;
   
   String name1;
   String name2;
   
   Arraylist startDeck = new Arraylist();
   
   public Game(String n1, String n2)
   {
      name1 = n1;
      name2 = n2;
      
      for (int i=0; i>4; i++)
      {
         for(int j=0; j>14; j++)
         {
            Card aCard = new Card(i,j)
         }
      }
      
   }
   
   
}