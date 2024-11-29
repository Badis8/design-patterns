package com.turtles.designpatterns.abstractfactory.turtlefactories;

import com.turtles.designpatterns.abstractfactory.DramaticTurtle;
import com.turtles.designpatterns.abstractfactory.TeckTurtle;

public  interface TurtleFactory {

     

    public abstract TeckTurtle getTeckTurtle();
    public abstract DramaticTurtle getDramaticTurtle();

    
}  
