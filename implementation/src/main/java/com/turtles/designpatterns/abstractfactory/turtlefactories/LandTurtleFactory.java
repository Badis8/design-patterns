package com.turtles.designpatterns.abstractfactory.turtlefactories;

import com.turtles.designpatterns.abstractfactory.DramaticTurtle;
import com.turtles.designpatterns.abstractfactory.TeckTurtle;
import com.turtles.designpatterns.abstractfactory.landturtles.TechLandTurtle;
import com.turtles.designpatterns.abstractfactory.landturtles.DramaticLandTurtle;
public class LandTurtleFactory implements TurtleFactory{

    @Override
    public TeckTurtle getTeckTurtle() {
        return new TechLandTurtle();
    }

    @Override
    public DramaticTurtle getDramaticTurtle() {
        return new DramaticLandTurtle();
    
    }

        
    
}
