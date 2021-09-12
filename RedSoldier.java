class RedSoldier extends Soldier{
   public void hunt(){
      if(hunterX == x && hunterY == y){
         System.out.println("Killed using the hand\nGame over");
         System.exit(0);
      }
   }
}
