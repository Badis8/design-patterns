package com.turtles.designpatterns.abstractfactory;
import java.util.*;
public class PlaceDetected {
   static public String findCurentPlace(){ 
        Random rand = new Random();
 
         return  rand.nextInt(1)==1 ?   "sea":   "land";
            
    }
}
