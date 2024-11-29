package com.turtles.designpatterns.factory.turtlebadfactory;

public class TurtleCreator {

    Turtle createTurle(String Type){
        if(Type.equals("Tech")){
                return new TechTurtle();
        }
        if(Type.equals("DramaticTrutle")){
            return new DramaticTurtle();
        }
    return null;
    }
} 

