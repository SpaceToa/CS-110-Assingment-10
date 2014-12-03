import java.util.ArrayList;

public class Game
{
   int value1;
   int value2;
   
   String name1;
   String name2;

   Deck startDeck =  new Deck();
   
   PlayerDeck deck1 = new PlayerDeck();
   PlayerDeck deck2 = new PlayerDeck();
   
   public Game(String n1, String n2)
   {
      name1 = n1;
      name2 = n2;
      
      Deck startDeck =  new Deck();
      startDeck.fill();
      
      PlayerDeck deck1 = new PlayerDeck();
      PlayerDeck deck2 = new PlayerDeck();
   }      
      
   public void start()
   {   
      int i=0;
      while (i <= 52)
      {
         int j = 1;
         
         if (j == 1)
         {
            Card tempCard = startDeck.draw();
            deck1.add(tempCard);  
            j = 2;
         }
         if (j == 2)
         {
            Card tempCard = startDeck.draw();
            deck2.add(tempCard);  
            j = 1;
         }
         
         deck1.shuffle();
         deck2.shuffle();
         
      }
      
      
   }
   
   //public int round+
   
   
}