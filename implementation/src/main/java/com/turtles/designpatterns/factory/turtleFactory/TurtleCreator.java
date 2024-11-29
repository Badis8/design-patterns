package com.turtles.designpatterns.factory.turtleFactory;

public abstract  class TurtleCreator {

    public abstract Turtle getTurtle(); 

    public void observeTurtleHiding(){
        Turtle turtle=this.getTurtle(); 
        System.out.println("lets see the turtle hiding"); 
        turtle.hide();
    }
}
