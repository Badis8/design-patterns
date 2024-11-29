package com.turtles.designpatterns.abstractfactory;

import com.turtles.designpatterns.abstractfactory.turtlefactories.LandTurtleFactory;
import com.turtles.designpatterns.abstractfactory.turtlefactories.SeaTurtleFactory;
import com.turtles.designpatterns.abstractfactory.turtlefactories.TurtleFactory;

public class TurtleService {

    TurtleFactory factory;
    

    TurtleService(){
       this.factory=PlaceDetected.findCurentPlace().equals("sea") ? new SeaTurtleFactory() : new LandTurtleFactory();
    }
    
}
