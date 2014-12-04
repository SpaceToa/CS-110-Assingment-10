/**The Card class creats abn object that represents a playing card by containg an
 *int for the suit of the card and an int for the card number(value)
 *
 *@author Andy Green
 *@version 1.00
 *
*/

public class Card
{
   int suit;/** int variable for the suit of the card */
   int value;/** int variable for the number of the card */
   
  
   final int DIAMOND = 0;/** int values of 0 */
   final int CLUBS = 1;/** int values of 1 */
   final int SPADES = 2;/** int values of 2 */
   final int HEARTS  = 3;/** int values of 3 */
   
   final int KING = 13; /** int values of 13 */
   final int QUEEN = 12;/** int values of 12 */
   final int JACK = 11;/** int values of 11 */
   final int ACE = 1;/** int values of 1 */
   
   /**Default constructor for a Card object*/
   public Card()
   {
      suit = 0;
      value = 1;
   }
   /**A constructor for a Card object that takes 2 int values that become the suit and value of the card
    *@param s an int value that will be the suit of the card
    *@param v an int value that will be the value of the card
   */
   public Card(int s, int v)
   {
      suit = s;
      value = v;
   }
   /**A copy Contructor to copy another card
    *@param otherCard   A seperate card object
   */
   public Card(Card otherCard)
   {
      this.suit = otherCard.getSuit();
      this.value = otherCard.getValue();
   }
   
   /**Returns the suit of the card
    * @return Suit as an int
    */
   public int getSuit()
   {
      return suit;
   }
   
   /**Returns the value of the card
    * @return Value as an int
    */
   public int getValue()
   {
      
      return value;
   }  
   /**Gets a card objects suit and vaule and makes a string for easy reading
    * @return string with the suit and value in easy reading format
    */
   public String toString()
   {
      String sSuit = "";
      String sVal = "";
      
      switch(suit)
      {
         case 0: sSuit = "DIAMOND"; break;
         case 1: sSuit = "CLUBS";   break;
         case 2: sSuit = "SPADES";  break;
         case 3: sSuit = "HEARTS";  break;
      }
      
      switch(value)
      {
         case 1: sVal = "ACE";break;
         case 2: sVal = "TWO";break;
         case 3: sVal = "TRHEE";break;
         case 4: sVal = "FOUR";break;
         case 5: sVal = "FIVE";break;
         case 6: sVal = "SIX";break;
         case 7: sVal = "SEVEN";break;
         case 8: sVal = "EIGHT";break;
         case 9: sVal = "NINE";break;
         case 10: sVal ="TEN";break;
         case 11: sVal = "JACK";break;
         case 12: sVal = "QUEEN";break;
         case 13: sVal = "KING";break;
      }
      
      String s = sVal + " of " + sSuit ;
      return s;
   } 
}