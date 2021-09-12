class GreenSoldier extends Soldier{
   public void hunt(){
      if(hunterX == x && hunterY == y){
         System.out.println("Killed using a knife\nGame over");
         System.exit(0);
      }
   }
}
