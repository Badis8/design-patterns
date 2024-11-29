package com.turtles.designpatterns.factory.turtleFactory;

public class DramaticTurtleCreator extends TurtleCreator {

    @Override
    public Turtle getTurtle() {
        return new DramaticTurtle();
    }
     
    
    
}
