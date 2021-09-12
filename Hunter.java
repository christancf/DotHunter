import java.util.Scanner;
class Hunter {
   private String playerName;
   private String playerColor;
   int X;
   int Y;

   //Implemented overloaded constructor to initialize the variables
   Hunter(String playerName, String playerColor) {
      this.playerName = playerName;
      this.playerColor = playerColor;
      this.X = 0;
      this.Y = 0;
   }
   //setter for position X
   public void setXPos(int X){
      this.X = X;
   }
   //setter for position Y
   public void setYPos(int Y){
      this.Y = Y;
   }
   //
   public void move(Hunter h) throws SoundException{
      //throws an exception if the hunter hits the wall
      Scanner sc = new Scanner(System.in); 
      if(h.X >= Board.xPOS || h.Y >= Board.yPOS){
         throw new SoundException("Oh oo!!");
      }
      System.out.println("Hunter is moving, X:" + this.X + " Y:" + this.Y);
      Soldier.hunterX = h.X;  
      Soldier.hunterY = h.Y;
      this.setXPos(sc.nextInt());
      this.setYPos(sc.nextInt());
      
   }
   //subtracts the dots according to the type
   public void hunt(Board b){
      if(b.type.equals("superDot") && b.superDots > 0){
         System.out.println("Hunting super dots");
         --b.superDots;
         System.out.println("SuperDot: " + b.superDots);
      }
      //checks whether the hunter wins or not
      if(b.dots == 0 && b.superDots == 0){
         System.out.println("Hunter wins!!");
         System.exit(0);
      }
   }
}
