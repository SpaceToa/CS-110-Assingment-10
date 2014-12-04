public class WarTest
{
   public static void main(String[]Agrs)
   {
      String name1 = "Andy";
      String name2 = "Fred";
      
      Card c = new Card (1,4);
      
      Deck d = new Deck();
      d.fill();
      d.add(c);
      
      Card s =  d.draw();
      String t = s.toString();
      System.out.println(t);
      
      PlayerDeck pd = new PlayerDeck();
      pd.fill();
      pd.shuffle();
      System.out.println("done");
      System.out.println("done");
      
         

      
      Game war = new Game(name1,name2);
      war.start();
       
       System.out.println("done");
       for(int i=0; i<25; i++)
       { 
       String win = war.round();
       System.out.println(win+ "\n");
       }
   }
}