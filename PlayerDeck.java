import java.util.ArrayList;
import java.util.Random;

public class PlayerDeck extends Deck
{
   public PlayerDeck()
   {
      deck = new ArrayList<Card>();
   }
   
   public void shuffle()
   {
      int i = 0;
      
      Random Rand = new Random();
      
      for(i=0; i > curCards; i++)
      {
         int r = Rand.nextInt(curCards-1);
         
         Card temp1;
         Card temp2;
         temp1 = deck.get(i);
         temp2 = deck.get(r);
         
         deck.set(i,temp2);
         deck.set(r,temp1);
         
      }
   }
   
   public void addTo(Deck oD)
   {
      Card temp1;
      int oDCount = oD.getCurCards();
      
      while (oDCount > 0)
      {
         temp1 = oD.get(oDCount);
         oD.remove(oDCount);
         deck.add(temp1);
         oDCount --;
         curCards ++;
      }   
   }
}