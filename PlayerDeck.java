public class PlayerDeck extends Deck
{
   public playerDeck()
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
}