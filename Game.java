import java.util.ArrayList;

public class Game
{
   int value1;
   int value2;
   
   String name1;
   String name2;

   String winner;   

   Deck startDeck =  new Deck();
   
   PlayerDeck deck1 = new PlayerDeck();
   PlayerDeck deck2 = new PlayerDeck();
   
   public Game(String n1, String n2)
   {
      name1 = n1;
      name2 = n2;
      
      startDeck =  new Deck();
      startDeck.fill();
      
      PlayerDeck deck1 = new PlayerDeck();
      PlayerDeck deck2 = new PlayerDeck();
   }      
      
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
   
   public String round()
   {
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