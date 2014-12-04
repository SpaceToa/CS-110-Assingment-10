import java.util.ArrayList;
import java.util.Random;

public class Deck
{
   static final int numCards = 53;
   public int curCards = -1;
   Card tempCard = new Card();
   ArrayList<Card> deck = new ArrayList<Card>(numCards);
   
   public Deck()
   {
      deck = new ArrayList<Card>(numCards);
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
      for (int i=0; i <=3; i++)
      {
         for (int j=1; j<=13;j++)
         {
            Card tCard = new Card(i,j);
            deck.add(tCard);
            curCards ++;
         }
      }
      
   }
   
   public Card draw()
   { 
      tempCard = deck.get(curCards-1);
      deck.remove(curCards-1);
      curCards --;
      return tempCard;
   }
   
   public Card get(int i)
   {
      tempCard = deck.get(i);
      deck.remove(i);
      return tempCard;   
   }
   
   public void remove(int i)
   {
      deck.remove(i);
   }
   
   public void add(Card c)
   {
      deck.add(0,c);
      curCards ++;
   }
   
   public int getCurCards()
   {
      return curCards;
   }
   
   public boolean getEmpty()
   {
      return deck.isEmpty();
   }
   
   public String toString()
   {
      String fullList = "";
      for(int i=0; i> curCards; i++)
      {
         Card tempcard = deck.get(i);
         String s = tempcard.toString();
         fullList += s +"/n";
      }
      return fullList; 
   }
}