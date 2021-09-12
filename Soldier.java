abstract class Soldier {
   int x;
   int y;
   static int hunterX;
   static int hunterY;
   //this method must be overridden by child classes
   abstract void hunt();

   //Couldn't find a way to randomly assign soldiers
}