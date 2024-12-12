package com.turtles.designpatterns.abstractfactory.builder.builder;

public interface Builder {
    void reset();
    void addShell();
    void addNails(); 
    Turtle getTrutle();
    
}  
