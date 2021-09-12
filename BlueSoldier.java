class BlueSoldier extends Soldier{
   public void hunt(){
      if(hunterX == x && hunterY == y){
         System.out.println("Killed using a gun\nGame over");
         System.exit(0);
      }
   }
}
