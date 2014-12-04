import java.util.ArrayList;

/**The Game class holds all game functionalloty of for the card game WAR
 *
 *@author Andy Green
 *@version 1.00
 *
*/
public class Game
{
   int value1;/**The value of first players active card*/
   int value2;/**The value of second players active card*/
   
   String name1;/**The String of first players name*/
   String name2;/**The String of second players name*/

   Deck startDeck =  new Deck();/**A deck object that represents a full deck that will be split between the players*/ 
   
   PlayerDeck deck1 = new PlayerDeck();/**First players deck*/
   PlayerDeck deck2 = new PlayerDeck();/**Second players deck*/
   
   /**A Contructor that starts by making the startDeck and the two player decks
    *@param n1 the name of the first player
    *@param n2 the name of the second player
    */
   public Game(String n1, String n2)
   {
      name1 = n1;
      name2 = n2;
      
      startDeck =  new Deck();
      startDeck.fill();
      
      PlayerDeck deck1 = new PlayerDeck();
      PlayerDeck deck2 = new PlayerDeck();
   }      
    
   /**Splits the startDeck into the two decks for the players then shuffles those decks*/    
   public void start()
   {   
      int i=0;
      while (i < 50)
      {
         int j = 1;
         
         if (j == 1)
         {
            Card tempCard = startDeck.draw();
            deck1.add(tempCard);  
            j = 2;
            i++;
         }
         if (j == 2)
         {
            Card tempCard = startDeck.draw();
            deck2.add(tempCard);  
            j = 1;
            i++;
         }      
         
      }
      deck1.shuffle();
      deck2.shuffle();
      
      
   }
   
   /**Simulates one round of WAR. checking first if a player is out of the cards and declaring who won if someone is out of cards
    *then it pulls the top cards from each deck and compares then and annouces a winner and puts the in play cards into their deck.
    *if there is a tie the round starts again with the in play cards going to the war piles.
    *@return A string declaring who won and the cards they had or who won the game when someones deck runs out.
    */
   
   public String round()
   {
      String winner;
      if(deck1.getEmpty())
      {
        winner = name1 + " is out of cards \n" + name2 + " WINS!";
        return winner ;
      }
      if(deck1.getEmpty())
      {
        winner = name2 + " is out of cards \n" + name1 + " WINS!";
        return winner;
      }
   
      Deck warPile1 = new Deck();
      Deck warPile2 = new Deck();   
      
      Card inplay1 = deck1.draw();
      Card inplay2 = deck2.draw();
      
      value1 = inplay1.getValue();
      value2 = inplay2.getValue();
      
      String s1 = inplay1.toString();
      String s2 = inplay2.toString(); 
      
      
      
      if(value1>value2)
      {
         deck1.add(inplay1);
         deck1.add(inplay2);
         winner = name1 +" is the winner! \n" + name1 + " had " + s1 + "\n" + name2 + " had " + s2 ;
      }
      else if(value1<value2)
      {
         deck2.add(inplay1);
         deck2.add(inplay2);
         winner = name2 +" is the winner! \n" + name1 + " had " + s1 + "\n" + name2 + " had " + s2 ;      }
      else
      {
         winner = "WAR!!";
         warPile1.add(inplay1);
         warPile2.add(inplay2);
         round();
      }
      
      return winner;
   }
   
   //public int round+
   
   
}