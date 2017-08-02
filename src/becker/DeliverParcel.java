package becker;

import becker.robots.*;

public class DeliverParcel
{
    public static void girarDerecha( Robot karel){
        for (int i=0; i<3; i++)
        {
            karel.turnLeft();
        }}
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
    
      Thing c2 = new Thing(prague, 3, 3);
      Thing c3 = new Thing(prague, 3, 3);
      Wall p1=
              new Wall (prague , 1 ,1 ,Direction.WEST);
      Wall p2=
              new Wall (prague,1,1,Direction.NORTH);
         Wall p3=
              new Wall (prague , 1 ,2 ,Direction.NORTH);
      Wall p4=
              new Wall (prague,1,2,Direction.EAST );
   
         Wall p5=
              new Wall (prague , 2 ,1 ,Direction.WEST);
      Wall p6=
              new Wall (prague,2,2,Direction.EAST);
      Wall p7=
              new Wall (prague , 2 ,2 ,Direction.SOUTH);
      Wall p8=
              new Wall (prague,2,1,Direction.SOUTH );
   
   
         
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
    
      // Direct the robot to the final situation

      
     // karel.putThing();
        karel.move(); 
   karel.move();
           
            
            karel.turnLeft();
             
     karel.move();
     
      karel.move();
      karel.move();
      
      karel.turnLeft();
   
     karel.move();
     karel.move();
     karel.move();
      
 karel.turnLeft();
 karel.move();
 karel.move();
   karel.move();
             // start turning right as three turn lefts
        // finished turning right
  karel.turnLeft();

      karel.move();
     
      
      
  
           
      System.out.println(karel.countThingsInBackpack());
   }
}
