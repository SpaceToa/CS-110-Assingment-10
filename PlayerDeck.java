import java.util.ArrayList;
import java.util.Random;
/**The PlayerDeck class extends Deck and holds an array list that simulates a deck of Cards*
 *
 *@author Andy Green
 *@version 1.00
 *
*/
public class PlayerDeck extends Deck
{
   /** Creates a deck with a empty ArrayList with a capasity of 52 */
   public PlayerDeck()
   {
      Deck deck = new Deck();
      curCards = 0;
   }
   
   /** Randomly arranges the cards in the PlayerDeck ArrayList*/
   public void shuffle()
   {
      int i = 0;
      
      Random Rand = new Random();
      
      for(i=0; i <= curCards-1; i++)
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
}