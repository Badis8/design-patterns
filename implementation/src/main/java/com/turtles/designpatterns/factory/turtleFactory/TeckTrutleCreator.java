package com.turtles.designpatterns.factory.turtleFactory;
public class TeckTrutleCreator extends TurtleCreator{

    @Override
    public Turtle getTurtle() {
       return new TechTurtle();
    }


    
}
