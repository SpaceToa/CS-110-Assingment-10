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
   
   public Card()
   {
      suit = 0;
      value = 0;
   }
   
   public Card(int s, int v)
   {
      suit = s;
      value = v;
   }
   
   public Card(Card otherCard)
   {
      this.suit = otherCard.getSuit();
      this.value = otherCard.getValue();
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