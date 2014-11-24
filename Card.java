public class Card
{
   int suit;
   int value;
   
   final int DIAMOND = 0;
   final int CLUBS = 1;
   final int  SPADES = 2;
   final int HEARTS  = 3;
   
   final int KING = 13;
   final int QUEEN = 12;
   final int JACK = 11;
   final int ACE = 1;
   
   public Card(int s, int v)
   {
      suit = s;
      value = v;
   }
   
   public int getSuit()
   {
      return suit;
   }
   
   public int getValue()
   {
      return value;
   }   
}