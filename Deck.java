import java.util.ArrayList;
import java.util.Random;


/**The Deck class holds an array list that simulates a deck of Cards
 *
 *
 *@author Andy Green
 *@version 1.00
 *
*/
public class Deck
{
   static final int numCards = 53;
   public int curCards = -1;
   Card tempCard = new Card();
   ArrayList<Card> deck = new ArrayList<Card>(numCards);
   
   /** Creates a deck with a empty ArrayList with a capasity of 52*/
   public Deck()
   {
      deck = new ArrayList<Card>(numCards);
   }

   /**Populates a deck with a single version of each card possible*/   
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
   
   /**Pulls a card from the end of the array, returns it then remove it from the deck
    *@return The drawn card as a Card Object
    */
   public Card draw()
   { 
      tempCard = deck.get(curCards-1);
      deck.remove(curCards-1);
      curCards --;
      return tempCard;
   }
   
   /** Gets the info of a card in the ArrayList at index i
    *@param i index of the target card
    *@return a sallow copy of that card
    */
   public Card get(int i)
   {
      tempCard = deck.get(i);
      return tempCard;   
   }
   
   /**Removes the card at index i from the ArrayList
    *@param i index of the target card
    */
   public void remove(int i)
   {
      deck.remove(i);
   }
   
   /**Add a new card to the bottom of the deck
    *@param c The card object that is to be added
    */
   public void add(Card c)
   {
      deck.add(0,c);
      curCards ++;
   }
   
   /**An int of the amount of card objects currently in the deck
    *@return number of card objects as int
    */
   
   public int getCurCards()
   {
      return curCards;
   }
   
   /** Tells if the deck is empty as a boolean
   *@return A boolean if the deck is Empty
   */
   
   public boolean getEmpty()
   {
      return deck.isEmpty();
   }
   
   /**Creates a string that holds all info of the cards in the deck
   *@return String that contains all of the Cards.toString() in the deck
   */
  
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