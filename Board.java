import java.util.Random;

class Board {
   String type;
   //Wall boundary
   static final int xPOS = 250;
   static final int yPOS = 360;
   //Dot counts
   int dots = 97;
   int superDots = 3;
   //Implemented overloaded constructor
   Board(String type, Hunter h, Soldier[] s){
      this.type = type;
      init(h, s);
      System.out.println("Board is ready and three soldiers and the hunter is positioned in the board");
      
   }
   //Initializes a random coordinate for the three soldiers
   public void init(Hunter h, Soldier[] s){
      Random r = new Random();
      for(int i = 0; i < 3; ++i){
         s[i].x = r.nextInt(xPOS);
         s[i].y = r.nextInt(yPOS);
         //to make sure soldiers aren't positioned to the hunter's position
         if(s[i].x == h.X && s[i].y == h.Y){
            --i;
         }
         //System.out.println("X: " + s[i].x + " Y: " + s[i].y);
      }
   }
}
