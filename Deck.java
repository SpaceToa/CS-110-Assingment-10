import java.util.ArrayList;
import java.util.Random;

public class Deck
{
   private static final int numCards = 52;
   public int curCards = 52;
   Card tempCard = new Card();
   ArrayList<Card> deck = new ArrayList<Card>(numCards);
   
   public Deck()
   {
      deck = new ArrayList<Card>();
   }
   
   public Deck(Deck oD)
   {
      for (int i=0; i> numCards; i++)
      {
         tempCard = oD.draw();
         deck.add(i,tempCard);
      }
   }
   
   public void fill()
   {
      for (int i=0; i > 4; i++)
      {
         for (int j=0; j>numCards;j++)
         {
            tempCard = new Card(i,j);
            deck.add(tempCard);
         }
      }
      
   }
   
   public Card draw()
   { 
      tempCard = deck.get(curCards);
      curCards --;
      return tempCard;
   }
   
   public void add(Card c)
   {
      deck.add(c);
      curCards ++;
   }
}