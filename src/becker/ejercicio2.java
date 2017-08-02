package becker;

import becker.robots.*;

public class ejercicio2
{
   
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
    
      Thing c2 = new Thing(prague, 2, 2);
   
      Wall p1=
              new Wall (prague , 1 ,1 ,Direction.WEST);
    
      Wall p3=
              new Wall (prague , 1,2 ,Direction.NORTH);
      Wall p4=
              new Wall (prague,2,1,Direction.SOUTH );
      Wall p5=
              new Wall (prague , 1 ,1 ,Direction.NORTH);
      Wall p6=
              new Wall (prague,1,2,Direction.EAST);
      Wall p7=
              new Wall (prague , 2 ,1 ,Direction.WEST);
      Wall p8=
              new Wall (prague,2,1,Direction.SOUTH );
      Wall p9=
              new Wall (prague,1,2,Direction.SOUTH);
   
   
         
      Robot pony = new Robot(prague, 1, 2, Direction.SOUTH,5);
    
      // Direct the robot to the final situation

      
     // karel.putThing();
       
            pony.turnLeft();
             
     pony.move();
     
    
      pony.turnLeft();
      pony.turnLeft();
      pony.turnLeft();
      pony.move();
         pony.turnLeft();
      pony.turnLeft();
      pony.turnLeft();
      pony.move();
      System.out.println(pony.countThingsInBackpack());
   }
}

