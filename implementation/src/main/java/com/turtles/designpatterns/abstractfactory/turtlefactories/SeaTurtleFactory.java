package com.turtles.designpatterns.abstractfactory.turtlefactories;

import com.turtles.designpatterns.abstractfactory.DramaticTurtle;
import com.turtles.designpatterns.abstractfactory.TeckTurtle;
import com.turtles.designpatterns.abstractfactory.seaturtles.DramaticSeaTurtle;
import com.turtles.designpatterns.abstractfactory.seaturtles.TeckSeaTurtle;

public class  SeaTurtleFactory implements TurtleFactory {

    @Override
    public TeckTurtle getTeckTurtle() {
        return new  TeckSeaTurtle();
    }

    @Override
    public DramaticTurtle getDramaticTurtle() {
            return new DramaticSeaTurtle();  
    }

    

}  