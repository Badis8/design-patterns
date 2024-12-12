package com.turtles.designpatterns.abstractfactory.builder.builder;

public class Director {
    
    Turtle MakeHomlessTurtle(Builder builder){
        builder.addNails();
        return builder.getTrutle();
    }

    Turtle MakeNormalTurtle(Builder builder){
        builder.addNails();
        builder.addShell();
        return builder.getTrutle();

    }
}
