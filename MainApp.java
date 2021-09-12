import java.util.Scanner;

public class MainApp{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Hunter myhunter = new Hunter("Maha Deva", "Brown");
      Soldier[] threeSoldiers = {new RedSoldier(), new RedSoldier(), new GreenSoldier()};
      Board myboard = new Board("superDot", myhunter, threeSoldiers);

      System.out.println("Use the keyboard up, down, left, right arrow keys to move the hunter");
      myhunter.setXPos(sc.nextInt());
      myhunter.setYPos(sc.nextInt());
      //implemented try catch
      try {
         myhunter.move(myhunter);
         myhunter.hunt(myboard);
         threeSoldiers[2].hunt();
      } catch (SoundException e) {
         System.out.println(e.getMessage());
      }
      sc.close();
   }
}